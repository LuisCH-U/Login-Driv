package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import bd.Db;
import bean.*;

public class dao_home {
	Connection cn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public dUsuario Login(String Email, String Pass) {
		dUsuario Usuario = null;
		try {
			cn = Db.getConnection();
			String sql = "SELECT EMAIL, PASS FROM TA_INIC_SESI WHERE EMAIL=? AND PASS =?";
			ps = cn.prepareStatement(sql);
			ps.setString(1, Email);
			ps.setString(2, Pass);
			rs = ps.executeQuery();
			while (rs.next()) {
				Usuario = new dUsuario();
				Usuario.setEMAIL(Email);
				Usuario.setPASS(Pass);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				
				if (ps != null) {
					ps.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return Usuario;
	}
	
	public static void Registro (dUsuario us) throws SQLException {
	    String sql = "INSERT INTO TA_REGI_USUA(NOMBRE, EMAIL, PASS) VALUES('', '', '')";
	    try (Connection connection = Db.getConnection();
	        PreparedStatement ps = connection.prepareStatement(sql)) {
	    	ps.setString(1, us.getNOMBRE());
	    	ps.setString(3, us.getEMAIL());
	    	ps.setString(4, us.getPASS());
	        System.out.println(ps);
	        int result = ps.executeUpdate();
	        if (result == 0) {
	            throw new SQLException("Error Con la BD");
	        }
	    } catch (SQLException e) {
	        printSQLException(e);
	        throw e;
	    }
	}
	
	private static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error404: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
