package persistance.data.mysql;

import java.util.ArrayList;
import java.util.List;

import persistance.MySQLDatabase;
import persistance.data.generic.ProductLineList;

public class MSProductLineList extends ProductLineList {
    public List<MSProductLine> mSProductLine = new ArrayList<MSProductLine> ();

    public MySQLDatabase mySQLDatabase;

}
