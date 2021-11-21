
package DatabaseAccessLayer;
import DatabaseLayer.DatabaseConnection;
import Model.Course;

public class CourseAccessLogic {
 
    Course cc;

    private DatabaseConnection singleConn;

    public CourseAccessLogic() {
       singleConn = DatabaseConnection.getSingleInstance();
    }
    
    public Boolean addCourse(Course cc){
        return true;
    }
    
}
