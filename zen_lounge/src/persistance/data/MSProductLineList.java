package persistance.data;

import java.util.ArrayList;
import java.util.List;
import persistance.MySQLDatabase;

public class MSProductLineList extends ProductLineList {
    public List<MSProductLine> mSProductLine = new ArrayList<MSProductLine> ();

    public MySQLDatabase mySQLDatabase;

}
