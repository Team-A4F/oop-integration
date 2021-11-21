package DatabaseAccessLayer;

import DatabaseLayer.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Model.Student;
import Views.StudentEdit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StudentAccessLogic {

    private DatabaseConnection singleConn;

    public StudentAccessLogic() {
        singleConn = DatabaseConnection.getSingleInstance();
    }

    public String[][] getStudentEnquiry() {
        try {
            String query = "SELECT * FROM students order by created_at DESC;";
            String[][] result = singleConn.ExcecuteStudentSelect(query);
            return result;
        } catch (Exception ex) {
            return null;
        }
    }

    public Boolean saveStudentDetails(Student std) {
        try {
            String query = "INSERT INTO students (name , nic , phone, age , email , gender , address) VALUES('" + std.getName() + "' , '" + std.getNic() + "' , '" + std.getPhone() + "' , '" + std.getAge() + "' , '" + std.getEmail() + "' , '" + std.getGender() + "' , '" + std.getAddress() + "');";
            Boolean result = singleConn.saveIntoStudents(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

    public Boolean deleteStudentOnce(String id) {

        try {
            String query = "DELETE FROM students WHERE id= '" + id + "' ;";
            System.out.println(query);
            Boolean result = singleConn.deleteFromStudents(query);
            return result;
        } catch (Exception e) {
            return false;
        }
    }

    public int getCountStudents() {

        String query = "SELECT * FROM students ;";
        int result = singleConn.getStudentsCount(query);
        return result;

    }

    public String[] getSingleStudent(String id) {
        
        try {
            String query = "SELECT * FROM students WHERE id='" + id + "';";
            String[] result = singleConn.getSingleStudent(query);
            return result;
        } catch (Exception e) {
            return null;
        }

    }
    
    public Boolean updateStudentToDB(Student std , String id){

        try {
            String query = "UPDATE students SET name= '" + std.getName() + "' , nic = '" + std.getNic() + "' , phone = '" + std.getPhone() + "' ,age = '" + std.getAge() + "' ,email = '" + std.getEmail() + "' ,gender = '" + std.getGender() + "' , address = '" + std.getAddress() + "' WHERE id = '"+id+"';";
            Boolean result = singleConn.saveIntoStudents(query);
            return result;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    public int getCountIssues(){
    
        String query = "SELECT * FROM exam_enquiries ;";
        int result = singleConn.getStudentsCount(query);
        return result;
        
    }
    
    public int getCountIssuesToday(){
    
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println(dtf.format(now)); 
        String current_time = dtf.format(now);
   
        String query = "SELECT * FROM issues WHERE created_at='"+current_time+"' ;";
        int result = singleConn.getStudentsCount(query);
        return result;
        
    }
    
    public int getCountIssuesResolved(){
    
        String query = "SELECT * FROM issues WHERE resolved='0' ;";
        int result = singleConn.getStudentsCount(query);
        return result;
        
    }
    
    public int getCountIssuesUnresolved(){
   
        String query = "SELECT * FROM issues WHERE resolved='1' ;";
        int result = singleConn.getStudentsCount(query);
        return result;
        
    }
    
    public int getCountCourses(){
   
        String query = "SELECT * FROM courses ;";
        int result = singleConn.getStudentsCount(query);
        return result;
        
    }

}
