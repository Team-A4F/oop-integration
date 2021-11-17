package DatabaseAccessLayer;

import DatabaseLayer.DatabaseConnection;
import Model.Exam;
import javax.swing.JOptionPane;

public class ExamAccessLogic {
    private DatabaseConnection singleConn;
    
    //constructor 
    public ExamAccessLogic() {
        singleConn = DatabaseConnection.getSingleInstance();
    }
    
    //check if successfully added to db
    public boolean addExamEnquiry(Exam exam) {
        try {
            String query = "INSERT INTO exam_enquiries (subject, exam_date, enquiry, studentID) VALUES ('" + exam.getSubjectTxt() +"','"+ exam.getExamdateTxt() +"','"+ exam.getEnqTxt() +"','"+ exam.getStudIDTxt() +"');";
            boolean result = singleConn.ExcecuteQuery(query);
            return result;  
        } catch (Exception ex) {
            return false;            
        }
    }
    
}