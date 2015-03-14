package persistance.data.mysql;

import java.util.ArrayList;
import java.util.List;

import persistance.MySQLDatabase;
import persistance.data.generic.Event;
import persistance.data.generic.EventList;

public class MSEventList extends EventList {
    public MySQLDatabase mySQLDatabase;

    public List<Event> event = new ArrayList<Event> ();

}
