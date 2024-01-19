public class iPhone13 extends iPhone{
    //private static int tempID=1;
    public iPhone13(int storage, String color, int availableStock) {//sets properties of iphone
        super(storage, color, availableStock);
        modelName= "iPhone 13";
        //id= tempID;
        //tempID++;
        int[] ids = new int[availableStock];
        for (int i=0; i<availableStock; i++)//automatically generates id depending on stock
        {
            ids[i]= i+1;
        }
        if (storage==128)
        {
            price=450;
            if (color.equals("White"))
            {
                availableStock=2;
            } else if (color.equals("Black")) {
                availableStock=3;
            } else if (color.equals("Red")) {
                availableStock=1;
            }
        }
        if (storage==256)
        {
            price=500;
            if (color.equals("White"))
            {
                availableStock=3;
            } else if (color.equals("Black")) {
                availableStock=1;
            } else if (color.equals("Red")) {
                availableStock=2;
            }
        }
    }

}
