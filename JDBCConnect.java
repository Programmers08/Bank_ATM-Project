package businesslogic;

import java.sql.Connection;
import java.sql.DriverManager;
public class JDBCConnect {
	
	//Class for getting DBConnection.Making "conn" object static, to avoid multiple connections being opened
	
	private static Connection conn;
	
	
	public static Connection getDBConnect() {
	
		String url = "localhost:3306/Bank";
	    String ucid ="root";
	    String dbpassword ="root";
	
	
	if(conn==null){
		try {
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		conn = DriverManager.getConnection("jdbc:mysql://"+url+"/"+ucid+"?user="+ucid+"&password="+dbpassword);
		
		return conn;
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		}else{
		return conn;
		}
		return null;
	
		}
	
}
