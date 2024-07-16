package com.bk.code.servlet;

/**
 * balmukund
 */
public class LoginServlet {
    
	public static void main(String[] args) {
		System.out.println("hello");
	}
    
    
    /* 
        private static Connection connection;
        public static void main(String[] args) throws SQLException {
        System.out.println("hello world");

        String jdbcUrl = "jdbc:mysql://localhost:3306/testFirst";
        String dbUser = "root";
        String dbPass = "pa55bird";
        String readQuery = "select * from students";

        connection = DriverManager.getConnection(jdbcUrl,dbUser,dbPass);

        PreparedStatement pstmt = connection.prepareStatement(readQuery);

        ResultSet result = pstmt.executeQuery();

        while (result.next()) {
            System.err.print(result.getString("name"));
            System.err.print("-----");
            System.err.print(result.getString("email"));
            System.out.println();
        }

        pstmt.close();
        connection.close();

    } */
}
