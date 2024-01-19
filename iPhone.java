public class iPhone {
    public String modelName;
    public int storage;
    public int price;
    public String color;
    public int availableStock;
    public int id;

    public iPhone(int storage, String color, int availableStock)
    {
        this.storage=storage;
        this.color=color;
        this.availableStock=availableStock;
    }

    void displayAvailableiPhones()//displays iPhone
    {
        if (availableStock!=0)
        {
            System.out.printf("%-5s      %-1dGB      $%-5d      %-5s %n", modelName, storage, price, color);
        }
    }

    void buyAniPhone(int storage, String color){//deducts from iphone stock if there is stock or displays that there is no more stock
        if (availableStock>0)
            availableStock--;
        else
            System.out.println("Cannot buy iPhone. It is out of stock");

    }
}
