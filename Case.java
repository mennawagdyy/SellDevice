public class Case extends Accessories{
    public String color;
    public Case(String modelName, String color, int stock)//sets properties of case
    {
        super(modelName, stock);
        accessoryName= "Case";
        this.modelName= modelName;
        this.color=color;
        if (modelName.equals("iPhoneSE"))
        {
            price=30;
            if (color.equals("Red"))
            {
                stock=2;
            } else if (color.equals("Black")) {
                stock=1;
            }
        } else if (modelName.equals("iPhone12")) {
            price=40;
            if (color.equals("Blue"))
            {
                stock=3;
            } else if (color.equals("White")) {
                stock=4;
            }
        }
        else if (modelName.equals("iPhone13")) {
            price=40;
            if (color.equals("Yellow"))
            {
                stock=1;
            } else if (color.equals("Green")) {
                stock=3;
            }
        }


    }

    @Override
    void displayAvailableAccessories()//displays case
    {
        if (stock!=0)
        {
            System.out.printf("%-5s            %-5s     %-5s    %-5d%n", accessoryName, modelName, color, price);
        }
    }

    void buyAccessory(String modelName, String color)//deducts from case stock if there is stock or displays that there is no more stock
    {
        if (stock>0)
            stock--;
        else
            System.out.println("Cannot buy case. It is out of stock.");
    }
}
