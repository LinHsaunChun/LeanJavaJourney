package leanJAVA; 

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 

public class connectSQL { 
  private Connection con = null; //Database objects 
  //�s��object 
  private Statement stat = null; 
  //����,�ǤJ��sql������r�� 
  private ResultSet rs = null; 
  //���G�� 
  private PreparedStatement pst = null; 
  //����,�ǤJ��sql���w�x���r��,�ݭn�ǤJ�ܼƤ���m 
  //���Q��?�Ӱ��Х� 
  
  /*
   *  �۩w�qSQL���O
   */
  	
  private String dropdbSQL = "DROP TABLE User "; 
  		// DROP TABLE [���W��]
  
  private String createdbSQL = "CREATE TABLE User (" + 
    "    id     INTEGER " + 
    "  , name    VARCHAR(20) " + 
    "  , passwd  VARCHAR(20))"; 
  		// CREATE TABLE [���W��]([���@�W��]  [���@���A], [���G�W��]  [���G���A])
  
  private String insertdbSQL = "insert into User(id,name,passwd) " + 
      "select ifNULL(max(id),0)+1,?,? FROM User"; 
  		// insert into User([���@�W��],[���G�W��],[���T�W��])
  			/*
  			 * SELECT IFNULL(x, y)
			 * �p�Gx���ONULL(���]�t0)�AIFNULL()��^x�A�_�h����^y�C
			 * IFNULL()��^�@�ӼƦr�Φr�Ŧ�ȡC
  			 */
  
  private String selectSQL = "select * from User "; 
  
  
  public static void main(String[] args) 
  { 
    //���ݬݬO�_���` 
    connectSQL test = new connectSQL(); 
    test.dropTable(); 
    test.createTable(); 
    test.insertTable("yku", "12356"); 
    test.insertTable("yku2", "7890"); 
    test.SelectTable(); 
  
  } 
  
  /*
   *  Java�s�uMySQL function
   */
  public connectSQL() 
  { 
    try { 
    	/*
    	 * ���UJava�s�umysql���X�ʵ{�� 
    	 */
      Class.forName("com.mysql.jdbc.Driver"); 
      	/*
      	 * ���oconnection�榡�p�U
      	 * DriverManager.getConnection("jdbc:mysql://[���A���W��:Port��]/[��Ʈw�W��]?useUnicode=true&characterEncoding=[�s�X�榡]", 
      	 * "[�ϥΪ̱b��]","[�ϥΪ̱K�X]")
      	 */
      con = DriverManager.getConnection( 
      "jdbc:mysql://localhost:5432/test?useUnicode=true&characterEncoding=utf8", 
      "root",""); 
      
    	} 
    		/*
    		 *  �p�G�䤣��mysql���X�ʵ{���o�X�ҥ~�T��
    		 */
    		catch(ClassNotFoundException ex1) 
    		{ 
    			System.out.println("DriverClassNotFound :"+ex1.toString()); 
    		}
    		/*
    		 *  �p�G�䤣��SQL�o�X�ҥ~�T��
    		 */
    		catch(SQLException ex2) 
    		{ 
    			System.out.println("Exception :"+ex2.toString()); 
    		} 
    
  } 
  
  
  
  //�إ�table���覡 
  //�i�H�ݬ�Statement���ϥΤ覡 
  public void createTable() 
  { 
    try 
    { 
      stat = con.createStatement(); 
      stat.executeUpdate(createdbSQL); 
    } 
    	catch(SQLException ex1) 
    	{ 
    		System.out.println("CreateDB Exception :" + ex1.toString()); 
    	} 
    	finally 
    	{ 
    		Close(); 
    	} 
  } 
  
  
  
  //�s�W��� 
  //�i�H�ݬ�PrepareStatement���ϥΤ覡 
  	/*
  	 *  �s�W���A�榡�p�U�G
  	 *  insertTable( [���@��ƫ��A] [���@�W��],[���G��ƫ��A] [���G�W��]) 
  	 */
  public void insertTable( String name,String passwd) 
  { 
    try 
    { 
      pst = con.prepareStatement(insertdbSQL); 
      
      pst.setString(1, name); 
      pst.setString(2, passwd); 
      pst.executeUpdate(); 
    } 
    catch(SQLException e) 
    { 
      System.out.println("InsertDB Exception :" + e.toString()); 
    } 
    finally 
    { 
      Close(); 
    } 
  } 
    /*
	 *  �R�����
	 *  
	 */ 
  public void dropTable() 
  { 
    try 
    { 
      stat = con.createStatement(); 
      stat.executeUpdate(dropdbSQL); 
    } 
    catch(SQLException e) 
    { 
      System.out.println("DropDB Exception :" + e.toString()); 
    } 
    finally 
    { 
      Close(); 
    } 
  } 
  //�d�߸�� 
  //�i�H�ݬݦ^�ǵ��G���Ψ��o��Ƥ覡 
  public void SelectTable() 
  { 
    try 
    { 
      stat = con.createStatement(); 
      rs = stat.executeQuery(selectSQL); 
      System.out.println("ID\t\tName\t\tPASSWORD"); 
      while(rs.next()) 
      { 
        System.out.println(rs.getInt("id")+"\t\t"+ 
            rs.getString("name")+"\t\t"+rs.getString("passwd")); 
      } 
    } 
    catch(SQLException e) 
    { 
      System.out.println("DropDB Exception :" + e.toString()); 
    } 
    finally 
    { 
      Close(); 
    } 
  } 
  //����ϥΧ���Ʈw��,�O�o�n�����Ҧ�Object 
  //�_�h�b����Timeout��,�i��|��Connection poor�����p 
  private void Close() 
  { 
    try 
    { 
      if(rs!=null) 
      { 
        rs.close(); 
        rs = null; 
      } 
      if(stat!=null) 
      { 
        stat.close(); 
        stat = null; 
      } 
      if(pst!=null) 
      { 
        pst.close(); 
        pst = null; 
      } 
    } 
    catch(SQLException e) 
    { 
      System.out.println("Close Exception :" + e.toString()); 
    } 
  } 
 }