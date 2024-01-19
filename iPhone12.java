public class iPhone12 extends iPhone{
    //private static int tempID=1;
    public iPhone12(int storage, String color, int availableStock) {//sets properties of iphone
        super(storage, color, availableStock);
        modelName= "iPhone12";
        //id= tempID;
        //tempID++;
        int[] ids = new int[availableStock];
        for (int i=0; i<availableStock; i++)//automatically generates id depending on stock
        {
            ids[i]= i+1;
        }
        if (storage==64)
        {
            price=350;
            if (color.equals("White"))
            {
                availableStock=1;
            } else if (color.equals("Black")) {
                availableStock=4;
            } else if (color.equals("Blue")) {
                availableStock=2;
            }
        }
        if (storage==128)
        {
            price=400;
            if (color.equals("White"))
            {
                availableStock=2;
            } else if (color.equals("Black")) {
                availableStock=3;
            } else if (color.equals("Blue")) {
                availableStock=4;
            }
        }
    }
}
