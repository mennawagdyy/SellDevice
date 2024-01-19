public abstract class Accessories {
    public String accessoryName;
    public String modelName;
    public int stock;
    public int price;
    public Accessories(String modelName, int stock)
    {
        this.modelName= modelName;
        this.stock=stock;
    }
    void displayAvailableAccessories()
    {
    }

    void buyAccessory()
    {
    }
}
