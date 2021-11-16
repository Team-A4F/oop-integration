package Controller;

import Model.Exam;
import DatabaseAccessLayer.ExamAccessLogic;

public class ExamController {
    ExamAccessLogic exal;
    
    public  ExamController() {
        exal = new ExamAccessLogic();
    }
    
    public boolean insertExamEnquiry(Exam exam) {
        System.out.println("exam2222 ==== " + exam );
        boolean result = exal.addExamEnquiry(exam);
        return result;
    }
    
}
