import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateInSql {

    private static final String URL = "jdbc:mysql://localhost:3306/new_schema";
    private static final String USER = "root";
    private static final String PASSWORD = "q138527946";

    public static void main(String[] args){

        String str = "update dbusers set user_name = 'nikolay' where id = 2";

        try {
            Connection connection = DriverManager.getConnection(URL,USER, PASSWORD);

            Statement statement = connection.createStatement();

            statement.execute(str);
            System.out.println("Record is update");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
