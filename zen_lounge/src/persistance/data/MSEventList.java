package persistance.data;

import java.util.ArrayList;
import java.util.List;
import persistance.MySQLDatabase;

public class MSEventList extends EventList {
    public MySQLDatabase mySQLDatabase;

    public List<Event> event = new ArrayList<Event> ();

}
