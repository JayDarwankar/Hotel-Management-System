package Hotel.management.system;
import java.sql.*;
public class conn {
    Connection c;
    Statement  s;
    public conn(){
        try {
            class forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///projecthms","root","Mysql@123");



        }
        catch (Exception e){

        }

    }
}
