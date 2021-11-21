/*
Done by :: IT21711282 - M.P.W.P.Anjana Lakshan
*/
package Controller;
import DatabaseAccessLayer.CourseAccessLogic;
import Model.Course;


public class CourseController {
    Course newC;
    CourseAccessLogic cLogic;
    
    public CourseController() {
        cLogic = new CourseAccessLogic();
    }
    
    public Course addCourse(String Cname,String Cdurat,String Cfee,String Lecturer,String Centre) {
        newC = new Course(Cname,Cdurat,Cfee,Lecturer,Centre);
        return newC;
    }
    public boolean insertCourse(Course c) {
        boolean result = cLogic.addCourse(c);
        return result;
    }
    
}