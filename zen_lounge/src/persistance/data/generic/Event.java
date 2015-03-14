package persistance.data.generic;


public interface Event {
    void save();

    void load();

    String getName();

    void setName(String value);

    int getPrice();

    void setPrice(int value);

}
