package com.jspider.singleton;

class Connection{
	private static Connection con=new Connection();
	public static Connection getConnect() {
		if(con==null) {
			con=new Connection();
			System.out.println("reference variable is found null so creating new object");
		}
		return con;
	}
	private Connection() {
		
	}
}

public class Program2 {

	public static void main(String[] args) {
		Connection c1= Connection.getConnect();
		System.out.println(c1);
		c1=null;
		System.out.println(c1);
		c1= Connection.getConnect();

	}

}
