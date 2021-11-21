/*
Done by :: IT21703294 - W.A.S.Fernando
*/
package DatabaseAccessLayer;

import DatabaseLayer.DatabaseConnection;
import Model.Exam;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExamAccessLogic {
    private DatabaseConnection singleConn;
    
    //constructor 
    public ExamAccessLogic() {
        singleConn = DatabaseConnection.getSingleInstance();
    }
    
    //insert exam enquiry
    public boolean addExamEnquiry(Exam exam) {
        try {
            String query = "INSERT INTO exam_enquiries (subject, exam_date, enquiry, id) VALUES ('" + exam.getSubjectTxt() +"','"+ exam.getExamdateTxt() +"','"+ exam.getEnqTxt() +"','"+ exam.getStudIDTxt() +"');";
            boolean result = singleConn.ExcecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
    
    //call exam enquir
    public ArrayList<String> selectExamEnquiry() {
        try {
            String query = "SELECT enqID,subject,exam_date,enquiry,id FROM exam_enquiries ORDER BY enqID DESC;";
            ArrayList<String> result = singleConn.ExcecuteSelectQuery(query);
            return result;
        } catch (Exception ex) {
            return null;
        }
    }
    
    //update exam enquiry
    public boolean updateExamEnquiry(Exam exam) {
        try {
            String query = "UPDATE exam_enquiries SET subject = '" + exam.getSubjectTxt() +"', exam_date = '"+ exam.getExamdateTxt() +"', enquiry = '"+ exam.getEnqTxt() +"' WHERE enqID = '"+ exam.getexEnqryTxt() +"' ;";
            boolean result = singleConn.ExcecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
    
    //remove exam enquiry
    public boolean removeExamEnquiry(Exam exam) {
        try {
            String query = "DELETE FROM exam_enquiries WHERE enqID = '"+ exam.getexEnqryTxt() +"' ;";
            boolean result = singleConn.ExcecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
  
}