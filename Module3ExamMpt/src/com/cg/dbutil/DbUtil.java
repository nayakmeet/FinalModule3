package com.cg.dbutil;
	
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

	public class DbUtil {

		static Connection conn=null;
		public static Connection getConnection() throws NamingException, IOException
		{
			try{
				InitialContext ic= new InitialContext();
				DataSource ds=(DataSource) ic.lookup("java:/Meet");
				conn=ds.getConnection();
				}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			catch(NamingException e)
			{
				e.printStackTrace();
			}
			return conn;
	}
	}

