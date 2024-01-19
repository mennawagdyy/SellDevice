public class iPhoneSE extends iPhone{
    //private static int tempID=1;
    public iPhoneSE(int storage, String color, int availableStock) {//sets properties of iphone
        super(storage, color, availableStock);
        modelName= "iPhone SE";
        //id= tempID;
        //tempID++;
        int[] ids = new int[availableStock];
        for (int i=0; i<availableStock; i++)//automatically generates id depending on stock
        {
            ids[i]= i+1;
        }
        storage= 64;
        price= 300;
        if (color.equals("White"))
        {
            availableStock=2;
        } else if (color.equals("Black")) {
            availableStock = 3;
        }
    }

}
