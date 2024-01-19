public class MagSafeCharger extends Accessories{

    public MagSafeCharger(String modelName, int stock)//sets properties of charger
    {
        super(modelName, stock);
        accessoryName= "MagSafeCharger";
        this.modelName= modelName;
        if (modelName.equals("iPhone12"))
        {
            stock=3;
        } else if (modelName.equals("iPhone13")) {
            stock=2;
        }
        price=100;
    }

    @Override
    void displayAvailableAccessories()//displays charger
    {
        if (stock!=0)
        {
            System.out.printf("%-5s  %-5s           %-5d%n", accessoryName, modelName, price);
        }
    }

    void buyAccessory(String modelName)//deducts from stock if charger is bought or displays out of stock if cant be bought
    {
        if (stock>0)
            stock--;
        else
            System.out.println("Cannot buy charger. It is out of stock.");
    }
}
