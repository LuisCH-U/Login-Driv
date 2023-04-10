package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;


public class Db {
    public Connection cnn;
    public Statement stm;
    public ResultSet rs;
    Db con = null;


	 public static Connection getConnection() {
	    Connection con = null;
	           try{
	        Class.forName("com.mysql.jdbc.Driver");
	                con=DriverManager.getConnection("jdbc:mysql://localhost/BD_HOME_DRIV_SAC","root","73525804");
	//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	//            cn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-SOB1KLM5\\SQLEXPRESS/farmacia:1433;databaseName=neptuno;user=sa;password=luis");            
	        }
	        
	    catch(Exception e1){
	        System.out.println("Error Sql :"+e1.getMessage());
	    }
	    return con;
	}

}