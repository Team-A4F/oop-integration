package DatabaseLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private final String URL = "jdbc:mysql://localhost:3306/tutora_db";
    private final String Uname = "root";
    private final String Password = "";
    private static DatabaseConnection instance;
    private Connection con;
    
    private DatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, Uname, Password);
            System.out.println("Connection Success");
        } catch (SQLException ex) {
            System.out.println("Databease issue!" + ex.getMessage() );
        } catch (ClassNotFoundException ex) {
            System.out.println("Databease issue!" + ex.getMessage() );
        }
    }
    
    /*we create the below to avoid multipe overloading of the connection
      object and expose only a single 'instance' to the outside*/
    /*singleton design pattern*/
    public static DatabaseConnection getSingleInstance() {
        try {
            if(instance == null) { // becuase we're exposing only 1 instance, chk if no connection 
                instance = new DatabaseConnection();
            } else if(instance.con.isClosed()) { // else if connection is closed 
                instance = new DatabaseConnection();
            } else {
                return instance; // else if already have a connection
            }
            return instance;
        } catch (SQLException ex) {
            System.out.println("Databease issue!" + ex.getMessage());
            return null; // if have an sql exception
        }
    };
    
    public boolean ExcecuteQuery(String sqlQ) {
        try {
            Statement st = con.createStatement();
            int result = st.executeUpdate(sqlQ);
            return result > 0;
        } catch(SQLException ex) {
            System.out.println("SQl connection Error " + ex.getMessage() );
            return false;
        }
    }
}
