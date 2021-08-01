package bazydanych;

import java.sql.*;

public class polonczenie {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/zdtestpol50";
        String username = "root";
        String password = "6nbabjiq"; //tutaj wpisujemy swoje hasło do bazy danych

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("połąnczono z bazą danych");

            String sql = "select * from employees where first_name like 'W%';";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);

            int count = 0;
            while (result.next()){
                String firstname = result.getString(3);
                String lastname = result.getString("last_name");

                count++;

                System.out.println("Customer " + count + ": " + firstname + " " + lastname);
            }

            connection.close();
        }
        catch (SQLException throwables) {
            System.out.println("Oops, error");
            throwables.printStackTrace();
        }

    }
}
