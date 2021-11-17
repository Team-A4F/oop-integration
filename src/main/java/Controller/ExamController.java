package Controller;

import Model.Exam;
import DatabaseAccessLayer.ExamAccessLogic;

public class ExamController {
    ExamAccessLogic exal;
    Exam objExams;
    
    public  ExamController() {
        exal = new ExamAccessLogic();
    }
    
    public Exam addExamEnquiry(String examdateTxt, String subjectTxt, String enqTxt, String studIDTxt) {
        objExams = new Exam(examdateTxt, subjectTxt, enqTxt, studIDTxt);
        return objExams;
    }
    
    public boolean insertExamEnquiry(Exam exam) {
        boolean result = exal.addExamEnquiry(exam);
        return result;
    }
    
}
