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
        System.out.println("exam ==== " + exam );
        try {
            JOptionPane.showMessageDialog(null, "Added Enquiry 11111", "Succ added1111", JOptionPane.PLAIN_MESSAGE);
            String query = "INSERT INTO exam_enquiries (subject, exam_date, enquiry, studentID) VALUES (" + exam.getSubjectTxt() +","+ exam.getExamdateTxt() +","+ exam.getEnqTxt() +","+ exam.getStudIDTxt() +");";
            boolean result = singleConn.ExcecuteQuery(query);
            JOptionPane.showMessageDialog(null, "Added Enquiry 22222", "Succ added1111", JOptionPane.PLAIN_MESSAGE);
            return result;            
        } catch (Exception ex) {
            System.out.println("SQl Error when adding " + ex.getMessage() );
            JOptionPane.showMessageDialog(null, "Eror", "Failed to add", JOptionPane.WARNING_MESSAGE);
            return false;            
        }
    }
    
}
/*
try {
            String query = "INSERT INTO exam_enquiries values(" + exam.getSubjectTxt() +","+ exam.getExamdateTxt() +","+ exam.getEnqTxt() +","+ exam.studIDTxt() +");";
            boolean result = singleConn.ExcecuteQuery(query);
            JOptionPane.showMessageDialog(null, "Added Enquiry", "Succ added", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Eror", "Failed to add", JOptionPane.WARNING_MESSAGE);
        }
*/