package Controller;

import DatabaseAccessLayer.StudentAccessLogic;
import Model.Student;

public class StudentController {

    StudentAccessLogic std;
    Student stdobj;

    public StudentController() {
        std = new StudentAccessLogic();
    }

    public Student addStudentEnquiry(String name, String nic, String phone, String age, String email, String gender, String address) {
        stdobj = new Student(name, nic, phone, age, email, gender, address);
        return stdobj;
    }

    public boolean insertStudentEnquiry(Student student_model) {
        boolean result = std.saveStudentDetails(student_model);
        return result;
    }

    public boolean updateStudent(Student student_model, String id) {
        boolean result = std.updateStudentToDB(student_model, id);
        return result;
    }

    public String[][] selectExamEnquiry() {
        String[][] result = std.getStudentEnquiry();
        return result;
    }

    public boolean deleteStudent(String id) {

        boolean result = std.deleteStudentOnce(id);
        return result;

    }

    public int studentCount() {

        int count = std.getCountStudents();
        return count;

    }

    public String[] getSingleStudent(String id) {

        String[] result = std.getSingleStudent(id);
        return result;

    }

    public int issueCount() {

        int count = std.getCountIssues();
        return count;
    }

    public int issueCountToday() {

        int count = std.getCountIssuesToday();
        return count;
    }

    public int getCountIssuesResolved() {

        int count = std.getCountIssuesResolved();
        return count;
    }

    public int getCountIssuesUnresolved() {

        int count = std.getCountIssuesUnresolved();
        return count;
    }

    public int getCountCourses() {
        int count = std.getCountCourses();
        return count;
    }

}
