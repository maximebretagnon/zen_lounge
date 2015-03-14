package persistance.data.mysql;

import java.util.ArrayList;
import java.util.List;

import persistance.MySQLDatabase;
import persistance.data.generic.Product;
import persistance.data.generic.ProductLine;

public class MSProductLine extends ProductLine {
    public int quantity;

    public List<Product> product = new ArrayList<Product> ();

    public MySQLDatabase mySQLDatabase;

}
