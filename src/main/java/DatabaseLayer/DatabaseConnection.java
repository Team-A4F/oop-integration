/*
Done by :: IT21703294 - W.A.S.Fernando
*/
package DatabaseLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
    
    public ArrayList<String> ExcecuteSelectQuery(String sqlQ) {
        try {
            Statement st = con.createStatement();
            ResultSet result = st.executeQuery(sqlQ);
            ArrayList<String> examEnquiries = new ArrayList<String>();
            
            while (result.next()) { 
              String ei = result.getString("enqID") + "," + 
                          result.getString("subject") + "," + 
                          result.getString("exam_date") + "," + 
                          result.getString("enquiry")+ "," + 
                        result.getString("id");
              examEnquiries.add( ei );
            }            
            st.close();
            return examEnquiries;
            
        } catch(SQLException ex) {
            System.out.println("SQl connection Error " + ex.getMessage() );
            return null;
        }
    }
    
    
    /*******
    By :: IT19786438 - T.G.Ashan Nadeeka
    *******/
    public String[][] ExcecuteStudentSelect(String sqlQ) {
        System.out.println("--- ++++ ---- > " + sqlQ);
        try {
            Statement st = con.createStatement();
            ResultSet result = st.executeQuery(sqlQ);
            
            String[][] studentDetails = new String[9][10];
            int count = 0;
            while (result.next()) {
                studentDetails[count][0] = result.getString("id");
                studentDetails[count][1] = result.getString("name");
                studentDetails[count][2] = result.getString("nic");
                studentDetails[count][3] = result.getString("phone");
                studentDetails[count][4] = result.getString("age");
                studentDetails[count][5] = result.getString("email");
                studentDetails[count][6] = result.getString("gender");
                studentDetails[count][7] = result.getString("address");
                studentDetails[count][8] = result.getString("created_at");
                count++;
            }            
            st.close();
            return studentDetails;
        
        } catch (SQLException ex) {
            System.out.println("SQl connection Error " + ex.getMessage());
            return null;
        }
    }

    public Boolean saveIntoStudents(String sql) {
        try {            
            Statement st = con.createStatement();
            int result = st.executeUpdate(sql);
            return result > 0;
        } catch (SQLException ex) {
            System.out.println("SQl connection Error " + ex.getMessage());
            return false;
        }
    }
    
    public Boolean deleteFromStudents(String sql) {
        try {
            Statement st = con.createStatement();
            int result = st.executeUpdate(sql);            
            return result > 0;
        } catch (Exception e) {
            return false;
        }

    }	
    public int getStudentsCount(String sql) {
        try {
            Statement st = con.createStatement();
            ResultSet result = st.executeQuery(sql);
            int size = 0;

            while (result.next()) {
                size++;
            }
            
            st.close();
            System.out.println(size);
            return size;
        } catch (Exception e) {
            System.out.println(""+e);
            return -99;
        }

    }
	
    public String[] getSingleStudent(String sql) {	
        try {
            Statement st = con.createStatement();
            ResultSet result = st.executeQuery(sql);
            String[] studentDetails = new String[9];
            System.out.println(sql);

            while (result.next()) {
                studentDetails[0] = result.getString("id");
                studentDetails[1] = result.getString("name");
                studentDetails[2] = result.getString("nic");
                studentDetails[3] = result.getString("phone");
                studentDetails[4] = result.getString("age");
                studentDetails[5] = result.getString("email");
                studentDetails[6] = result.getString("gender");
                studentDetails[7] = result.getString("address");
                studentDetails[8] = result.getString("created_at");
                System.out.println(result.getString("name"));
            }

            st.close();
            return studentDetails;

        } catch (Exception e) {
            return null;
        }
    }
	
    public Boolean updateSingleStudent(String sql) {
        try {
            Statement st = con.createStatement();
            int result = st.executeUpdate(sql);
            return result > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
