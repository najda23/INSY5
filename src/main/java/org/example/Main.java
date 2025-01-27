package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://aws-0-eu-central-1.pooler.supabase.com:5432/postgres?user=postgres.mworqcgyhkjbuhlpylvy&password=P@$$w0rd DATABAS";
        String user = "najmus20@htl-shkoder.com";
        String password = "P@$$w0rd DATABAS";

        try (java.sql.Connection conn = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT title FROM books ORDER BY title";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString("title"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
