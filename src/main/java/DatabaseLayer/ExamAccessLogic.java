package DatabaseLayer;

import DatabaseLayer.DatabaseConnection;

public class ExamAccessLogic {
    private DatabaseConnection singleConn;
    
    public ExamAccessLogic() {
        singleConn = DatabaseConnection.getSingleInstance();
    }
}
