
import java.sql.*;

public class GetDataFromSQLBase {

    private static final String URL = "jdbc:mysql://localhost:3306/new_schema";
    private static final String USER = "root";
    private static final String PASSWORD = "q138527946";

    public static void main(String[] args){

        String str = "SELECT * FROM dbusers";

        try {
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            Statement statement = connection.createStatement();

            ResultSet resultSet =  statement.executeQuery(str);

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("user_name");
                String pwd = resultSet.getString("user_pwd");
                java.util.Date date = resultSet.getDate("create_date");
                System.out.println("id: "+id +" name: "+name+" pwd: "+pwd+" Date: "+date.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
