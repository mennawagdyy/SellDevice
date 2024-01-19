public class AirPods extends Accessories{
    public AirPods(int stock)//sets properties of airpods
    {
        super("iPhone13", stock);
        accessoryName= "AirPods";
        modelName= "iPhone13";
        price=150;
        stock=stock;
    }

    @Override
    void displayAvailableAccessories()//displays airpods
    {
        if (stock!=0)
        {
            System.out.printf("%-5s                            %-5d%n", accessoryName, price);
        }
    }

    void buyAccessory(String modelName)//deducts from case stock if there is stock or displays that there is no more stock
    {
        if (stock>0)
            stock--;
        else
            System.out.println("Cannot buy airpods. Out of stock.");
    }
}
