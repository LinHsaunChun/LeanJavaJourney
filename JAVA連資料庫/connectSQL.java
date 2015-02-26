package leanJAVA; 

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 

public class connectSQL { 
  private Connection con = null; //Database objects 
  //連接object 
  private Statement stat = null; 
  //執行,傳入之sql為完整字串 
  private ResultSet rs = null; 
  //結果集 
  private PreparedStatement pst = null; 
  //執行,傳入之sql為預儲之字申,需要傳入變數之位置 
  //先利用?來做標示 
  
  /*
   *  自定義SQL指令
   */
  	
  private String dropdbSQL = "DROP TABLE User "; 
  		// DROP TABLE [表格名稱]
  
  private String createdbSQL = "CREATE TABLE User (" + 
    "    id     INTEGER " + 
    "  , name    VARCHAR(20) " + 
    "  , passwd  VARCHAR(20))"; 
  		// CREATE TABLE [表格名稱]([欄位一名稱]  [欄位一型態], [欄位二名稱]  [欄位二型態])
  
  private String insertdbSQL = "insert into User(id,name,passwd) " + 
      "select ifNULL(max(id),0)+1,?,? FROM User"; 
  		// insert into User([欄位一名稱],[欄位二名稱],[欄位三名稱])
  			/*
  			 * SELECT IFNULL(x, y)
			 * 如果x不是NULL(不包含0)，IFNULL()返回x，否則它返回y。
			 * IFNULL()返回一個數字或字符串值。
  			 */
  
  private String selectSQL = "select * from User "; 
  
  
  public static void main(String[] args) 
  { 
    //測看看是否正常 
    connectSQL test = new connectSQL(); 
    test.dropTable(); 
    test.createTable(); 
    test.insertTable("yku", "12356"); 
    test.insertTable("yku2", "7890"); 
    test.SelectTable(); 
  
  } 
  
  /*
   *  Java連線MySQL function
   */
  public connectSQL() 
  { 
    try { 
    	/*
    	 * 註冊Java連線mysql的驅動程式 
    	 */
      Class.forName("com.mysql.jdbc.Driver"); 
      	/*
      	 * 取得connection格式如下
      	 * DriverManager.getConnection("jdbc:mysql://[伺服器名稱:Port號]/[資料庫名稱]?useUnicode=true&characterEncoding=[編碼格式]", 
      	 * "[使用者帳戶]","[使用者密碼]")
      	 */
      con = DriverManager.getConnection( 
      "jdbc:mysql://localhost:5432/test?useUnicode=true&characterEncoding=utf8", 
      "root",""); 
      
    	} 
    		/*
    		 *  如果找不到mysql的驅動程式發出例外訊息
    		 */
    		catch(ClassNotFoundException ex1) 
    		{ 
    			System.out.println("DriverClassNotFound :"+ex1.toString()); 
    		}
    		/*
    		 *  如果找不到SQL發出例外訊息
    		 */
    		catch(SQLException ex2) 
    		{ 
    			System.out.println("Exception :"+ex2.toString()); 
    		} 
    
  } 
  
  
  
  //建立table的方式 
  //可以看看Statement的使用方式 
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
  
  
  
  //新增資料 
  //可以看看PrepareStatement的使用方式 
  	/*
  	 *  新增表格，格式如下：
  	 *  insertTable( [欄位一資料型態] [欄位一名稱],[欄位二資料型態] [欄位二名稱]) 
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
	 *  刪除表格
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
  //查詢資料 
  //可以看看回傳結果集及取得資料方式 
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
  //完整使用完資料庫後,記得要關閉所有Object 
  //否則在等待Timeout時,可能會有Connection poor的狀況 
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