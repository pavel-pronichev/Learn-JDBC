import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateTable {

    private static final String URL = "jdbc:mysql://localhost:3306/new_schema";
    private static final String USER = "root";
    private static final String PASSWORD = "q138527946";

    private static String getCurrentDate(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD");
        Date date = new Date();
        return simpleDateFormat.format(date.getTime());
    }

    public static void main(String[] args){

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println(connection.isClosed());

            Statement statement = connection.createStatement();

            String creatTable = "CREATE TABLE user (id INT(11) NOT NULL AUTO_INCREMENT, user_name VARCHAR(45) NOT NULL, experience VARCHAR(45), age INT, PRIMARY KEY( ID ))";

            statement.execute(creatTable);
            System.out.println("Table DBUSER created");



           // String isert = "INSERT INTO dbuser (user_name, user_pwd, create_date) VALUES(Pavel, qwerty, " + getCurrentDate()+" )";

            connection.close();
            System.out.println(connection.isClosed());

        } catch (SQLException e) {
            e.printStackTrace();
        }
        }


    }

