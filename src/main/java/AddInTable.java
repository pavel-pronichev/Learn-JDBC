import java.sql.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AddInTable {

    private static final String URL = "jdbc:mysql://localhost:3306/new_schema";
    private static final String USER = "root";
    private static final String PASSWORD = "q138527946";

    private static String getCurrentDate(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
        Date date = new Date();
        return simpleDateFormat.format(date.getTime());
    }

    public static void main(String[] args){

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println(connection.isClosed());

            Statement statement = connection.createStatement();
            System.out.println(getCurrentDate());

            String str = "INSERT INTO dbusers ( user_name, user_pwd, create_date) values ( 'Paveldfg', 'pavel1234sdfg', '" + getCurrentDate() +"')" ;

            statement.executeUpdate(str);

            connection.close();
            System.out.println(connection.isClosed());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
