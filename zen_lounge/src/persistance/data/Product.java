package persistance.data;


public abstract class Product {
    private String name;

    private String brand;

    private int price;

    private int quantityAvailable;

    private int memberReduction;

    int getPrice() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.price;
    }

    void setPrice(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.price = value;
    }

    String getBrand() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.brand;
    }

    void setBrand(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.brand = value;
    }

    String getName() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.name;
    }

    void setName(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.name = value;
    }

    int getQuantityAvailable() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.quantityAvailable;
    }

    void setQuantityAvailable(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.quantityAvailable = value;
    }

    int getMemberReduction() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.memberReduction;
    }

    void setMemberReduction(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.memberReduction = value;
    }

    public void save() {
    }

    public void load() {
    }

    public void update() {
    }

}
