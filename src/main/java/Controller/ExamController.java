/*
Done by :: IT21703294 - W.A.S.Fernando
*/
package Controller;

import Model.Exam;
import DatabaseAccessLayer.ExamAccessLogic;
import java.util.ArrayList;

public class ExamController {
    ExamAccessLogic exal;
    Exam objExams;
    
    public  ExamController() {
        exal = new ExamAccessLogic();
    }
    
    public Exam addExamEnquiry(String examdateTxt, String subjectTxt, String enqTxt, String studIDTxt, String exEnqryTxt) {
        objExams = new Exam(examdateTxt, subjectTxt, enqTxt, studIDTxt, exEnqryTxt);
        return objExams;
    }    
    public boolean insertExamEnquiry(Exam exam) {
        boolean result = exal.addExamEnquiry(exam);
        return result;
    }
    
    public Exam updateExamEnquiry(String examdateTxt, String subjectTxt, String enqTxt, String studIDTxt, String exEnqryTxt) {
        objExams = new Exam(examdateTxt, subjectTxt, enqTxt, studIDTxt, exEnqryTxt);
        return objExams;
    }
    public boolean alterExamEnquiry(Exam exam) {
        boolean result = exal.updateExamEnquiry(exam);
        return result;
    }
    
    public Exam removeExamEnquiry(String examdateTxt, String subjectTxt, String enqTxt, String studIDTxt, String exEnqryTxt) {
        objExams = new Exam(examdateTxt, subjectTxt, enqTxt, studIDTxt, exEnqryTxt);
        return objExams;
    }
    public boolean deleteExamEnquiry(Exam exam) {
        boolean result = exal.removeExamEnquiry(exam);
        return result;
    }
    
    public ArrayList<String> selectExamEnquiry() {
        ArrayList<String> result = exal.selectExamEnquiry();
        return result;
    }
    
}
