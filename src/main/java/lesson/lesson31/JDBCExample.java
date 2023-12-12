package lesson.lesson31;

import java.sql.*;

public class JDBCExample {
    private static final String URL = "jdbc:mysql://localhost:3306/library";
    private static final String USER = "root";
    private static final String PASSWORD = "123123";

    private Connection connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public void getAllAuthors() {
        String sql = "SELECT author_id, name, birthday FROM authors";
        try (Connection connection = this.connection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("author_id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("birthday"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        JDBCExample jdbcExample = new JDBCExample();
        jdbcExample.getAllAuthors();
    }
}
