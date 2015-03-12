package persistance.data;

import java.util.ArrayList;
import java.util.List;
import persistance.MySQLDatabase;

public class MSProductLine extends ProductLine {
    public int quantity;

    public List<Product> product = new ArrayList<Product> ();

    public MySQLDatabase mySQLDatabase;

}
