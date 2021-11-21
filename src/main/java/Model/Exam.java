/*
Done by :: IT21703294 - W.A.S.Fernando
*/
package Model;

public class Exam {
    private String examdateTxt;
    private String subjectTxt;
    private String enqTxt;
    private String studIDTxt;
    private String exEnqryTxt;

    public Exam(String examdateTxt, String subjectTxt, String enqTxt, String studIDTxt, String exEnqryTxt) {
        this.examdateTxt = examdateTxt;
        this.subjectTxt = subjectTxt;
        this.enqTxt = enqTxt;
        this.studIDTxt = studIDTxt;
        this.exEnqryTxt = exEnqryTxt; //enq ref ID for update & delete
    }
    
    public String getExamdateTxt() {
        return examdateTxt;
    }

    public String getSubjectTxt() {
        return subjectTxt;
    }

    public String getEnqTxt() {
        return enqTxt;
    }

    public String getStudIDTxt() {
        return studIDTxt;
    }
    
    public String getexEnqryTxt() {
        return exEnqryTxt;
    }
    
}
