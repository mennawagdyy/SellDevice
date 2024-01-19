import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BuyAniPhone {

    public static void main(String[] args)
    {
        iPhone12 iPhone12Array[];//declare array of iPhone 12 to contain all the different lines
        iPhone12 iphone12_64_white= new iPhone12(64, "White", 1);
        iPhone12 iphone12_64_black= new iPhone12(64, "Black", 4);
        iPhone12 iphone12_64_blue= new iPhone12(64, "Blue", 2);

        iPhone12 iphone12_128_white= new iPhone12(128, "White", 2);
        iPhone12 iphone12_128_black= new iPhone12(128, "Black", 3);
        iPhone12 iphone12_128_blue= new iPhone12(128, "Blue", 4);
        iPhone12Array= new iPhone12[]{iphone12_64_white, iphone12_64_black, iphone12_64_blue, iphone12_128_white, iphone12_128_black, iphone12_128_blue};

        iPhone13 iPhone13Array[];//declare array of iPhone 13 to contain all the different lines
        iPhone13 iphone13_128_white= new iPhone13(128, "White", 2);
        iPhone13 iphone13_128_black= new iPhone13(128, "Black", 3);
        iPhone13 iphone13_128_red= new iPhone13(128, "Red", 1);

        iPhone13 iphone13_256_white= new iPhone13(256, "White", 3);
        iPhone13 iphone13_256_black= new iPhone13(256, "Black", 1);
        iPhone13 iphone13_256_red= new iPhone13(256, "Red", 2);
        iPhone13Array= new iPhone13[]{iphone13_128_white, iphone13_128_black, iphone13_128_red, iphone13_256_white, iphone13_256_black, iphone13_256_red};

        iPhoneSE iPhoneSEArray[];//declare array of iPhone SE to contain all the different lines
        iPhoneSE iphoneSE_64_white= new iPhoneSE(64, "White", 2);
        iPhoneSE iphoneSE_64_black= new iPhoneSE(64, "Black", 3);
        iPhoneSEArray= new iPhoneSE[]{iphoneSE_64_white, iphoneSE_64_black};

        MagSafeCharger chargers[]; //declare array of chargers for different models
        MagSafeCharger iPhone12Charger= new MagSafeCharger("iPhone12", 3);
        MagSafeCharger iPhone13Charger= new MagSafeCharger("iPhone13", 2);
        chargers= new MagSafeCharger[]{iPhone12Charger, iPhone13Charger};

        Case cases[]; //declare array of cases for different models and colors
        Case iPhoneSERedCase= new Case("iPhoneSE", "Red", 2);
        Case iPhoneSEBlackCase= new Case("iPhoneSE", "Black", 1);
        Case iPhone12BlueCase= new Case("iPhone12", "Blue", 3);
        Case iPhone12WhiteCase= new Case("iPhone12", "White", 4);
        Case iPhone13YellowCase= new Case("iPhone13", "Yellow", 1);
        Case iPhone13GreenCase= new Case("iPhone13", "Green", 3);
        cases= new Case[]{iPhoneSERedCase, iPhoneSEBlackCase, iPhone12BlueCase, iPhone12WhiteCase, iPhone13YellowCase, iPhone13GreenCase};

        AirPods airPods= new AirPods(5); //only need one object for airpods

        ArrayList<CartItem> cart= new ArrayList<CartItem>();
        String makeASale= "";//to store whether we still need to make a sale
        String chosenModel = "";//store input of iPhone model
        String chosenColor = "";//store input of iPhone color
        int chosenStorage = 0;//store input of iPhone storage
        String chosenAccessory = "";//store input of accessory
        String chosenChargerModel = "";//store input of charger model
        String chosenCaseModel = "";//store input of case model
        String chosenCaseColor="";//store input of case color
        int itemPrice=0;//temporarily store price of item that will be put in cart
        int cartTotalPrice=0;//to store calculated total price at the end
        String confirmSale="";//to confirm sale in cart
        String wantToBuyPhone="";//to say if a phone will be bought
        String wantToBuyAccessory="";//to say if an accessory will be bought
        boolean saleMade=false;

        Scanner scan= new Scanner(System.in);

        System.out.println("Would you like to make a sale? Type 'yes' or 'no'");//asking if a sale will be made
        try {
            makeASale= scan.next();
        }catch (InputMismatchException exception)
        {
            System.out.println("Please type 'yes' or 'no'");
            makeASale= scan.next();
        }
        while (!(makeASale.equals("yes") || makeASale.equals("no")))
        {
            System.out.println("Please type 'yes' or 'no'");
            makeASale= scan.next();
        }

        while (makeASale.equals("yes"))
        {
            System.out.println("Would you like to buy an iPhone");
            try {
                wantToBuyPhone= scan.next();
            }catch (InputMismatchException e)
            {
                System.out.println("Please type 'yes' or 'no'");
                wantToBuyPhone= scan.next();
            }
            while (!(wantToBuyPhone.equals("yes") || wantToBuyPhone.equals("no")))//ensure input is valid
            {
                System.out.println("Please type 'yes' or 'no'");
                wantToBuyPhone= scan.next();
            }
            if (wantToBuyPhone.equals("yes"))
            {
                System.out.printf("Model          Storage    Price    Color%n");
                for (int i=0; i<iPhone12Array.length; i++)//display available phones of all models
                {
                    if (iPhone12Array[i].availableStock!=0)
                        iPhone12Array[i].displayAvailableiPhones();
                }
                for (int i=0; i<iPhone13Array.length; i++)
                {
                    if (iPhone13Array[i].availableStock!=0)
                        iPhone13Array[i].displayAvailableiPhones();
                }
                for (int i=0; i<iPhoneSEArray.length; i++)
                {
                    if (iPhoneSEArray[i].availableStock!=0)
                        iPhoneSEArray[i].displayAvailableiPhones();
                }
                System.out.println("Choose a model to buy");//input of iPhone model
                try {
                    chosenModel= scan.next();
                }catch (InputMismatchException e)
                {
                    System.out.println("Please type 'iPhoneSE' or 'iPhone12' or 'iPhone13'");
                    chosenModel= scan.next();
                }
                while (!(chosenModel.equals("iPhoneSE")|| chosenModel.equals("iPhone12") || chosenModel.equals("iPhone13")))//validate input
                {
                    System.out.println("Please type 'iPhoneSE' or 'iPhone12' or 'iPhone13'");
                    chosenModel= scan.next();
                }
                System.out.println("Choose a color");//input of iPhone color
                try {
                    chosenColor= scan.next();
                }catch (InputMismatchException e)
                {
                    System.out.println("Please choose one of the colors displayed");
                    chosenColor= scan.next();
                }
                boolean flag= false;
                while (!flag){//while loop to check that chosen color actually exists for that model
                    if (chosenModel.equals("iPhoneSE"))//depending on model, loop through corresponding array
                    {
                        for (int i=0; i<iPhoneSEArray.length; i++)
                        {
                            if (iPhoneSEArray[i].color.equals(chosenColor))//if one of the phones of the model has the chosen color, mark flag as true
                            {
                                flag=true;
                            }
                        }
                    } else if (chosenModel.equals("iPhone12")) {
                        for (int i=0; i<iPhone12Array.length; i++)
                        {
                            if (iPhone12Array[i].color.equals(chosenColor))
                            {
                                flag=true;
                            }
                        }
                    }else if (chosenModel.equals("iPhone13")) {
                        for (int i=0; i<iPhone13Array.length; i++)
                        {
                            if (iPhone13Array[i].color.equals(chosenColor))
                            {
                                flag=true;
                            }
                        }
                    }
                    if (!flag)//if color does not exist for the model, ask for color again
                    {
                        System.out.println("Please choose a color applicable for the chosen model");
                        chosenColor=scan.next();
                    }
                }
                flag=false;
                System.out.println("Choose storage");//get storage
                try {
                    chosenStorage= scan.nextInt();
                }catch (InputMismatchException e)
                {
                    System.out.println("Please choose one of the storage displayed");
                    chosenStorage= scan.nextInt();
                }
                while (!flag){//while loop similar to the one validating color, but for storage
                    if (chosenModel.equals("iPhoneSE"))
                    {
                        for (int i=0; i<iPhoneSEArray.length; i++)
                        {
                            if (iPhoneSEArray[i].storage==chosenStorage)
                            {
                                flag=true;
                            }
                        }
                    } else if (chosenModel.equals("iPhone12")) {
                        for (int i=0; i<iPhone12Array.length; i++)
                        {
                            if (iPhone12Array[i].storage==chosenStorage)
                            {
                                flag=true;
                            }
                        }
                    }else if (chosenModel.equals("iPhone13")) {
                        for (int i=0; i<iPhone13Array.length; i++)
                        {
                            if (iPhone13Array[i].storage==(chosenStorage))
                            {
                                flag=true;
                            }
                        }
                    }
                    if (!flag)//if storage not applicable to chosen model, get input again
                    {
                        System.out.println("Please choose a storage applicable for the chosen model");
                        chosenStorage=scan.nextInt();
                    }
                }
                if (chosenModel.equals("iPhone12"))//gets corresponding buy function for the chosen model, color, storage
                {
                    if (chosenColor.equals("White"))
                    {
                        if (chosenStorage==(64))
                        {
                            if (iphone12_64_white.availableStock>0) {
                                itemPrice = iphone12_64_white.price;
                                saleMade=true;//mark that there was stock and sale was made to add to cart
                            }
                            iphone12_64_white.buyAniPhone(64, "White");
                        } else if (chosenStorage==128) {
                            if (iphone12_128_white.availableStock>0)
                            {
                                itemPrice= iphone12_128_white.price;
                                saleMade=true;
                            }
                            iphone12_128_white.buyAniPhone(128, "White");
                        }
                    } else if (chosenColor.equals("Black")) {
                        if (chosenStorage==(64))
                        {
                            if (iphone12_64_black.availableStock>0)
                            {
                                itemPrice=iphone12_64_black.price;
                                saleMade=true;
                            }
                            iphone12_64_black.buyAniPhone(64, "Black");
                        } else if (chosenStorage==128) {
                            if (iphone12_128_black.availableStock>0)
                            {
                                itemPrice= iphone12_128_black.price;
                                saleMade=true;
                            }
                            iphone12_128_black.buyAniPhone(128, "Black");
                        }
                    }else if (chosenColor.equals("Blue")) {
                        if (chosenStorage==(64))
                        {
                            if (iphone12_64_blue.availableStock>0)
                            {
                                itemPrice= iphone12_64_blue.price;
                                saleMade=true;
                            }
                            iphone12_64_blue.buyAniPhone(64, "Blue");
                        } else if (chosenStorage==128) {
                            if (iphone12_128_blue.availableStock>0)
                            {
                                itemPrice= iphone12_128_blue.price;
                                saleMade=true;
                            }
                            iphone12_128_blue.buyAniPhone(128, "Blue");
                        }
                    }
                } else if (chosenModel.equals("iPhone13")) {
                    if (chosenColor.equals("White"))
                    {
                        if (chosenStorage==(128))
                        {
                            if ( iphone13_128_white.availableStock>0)
                            {
                                itemPrice=iphone13_128_white.price;
                                saleMade=true;
                            }
                            iphone13_128_white.buyAniPhone(128, "White");
                        } else if (chosenStorage==256) {
                            if (iphone13_256_white.availableStock>0)
                            {
                                itemPrice=iphone13_256_white.price;
                                saleMade=true;
                            }
                            iphone13_256_white.buyAniPhone(256, "White");
                        }
                    } else if (chosenColor.equals("Black")) {
                        if (chosenStorage==(128))
                        {
                            if (iphone13_128_black.availableStock>0)
                            {
                                itemPrice=iphone13_128_black.price;
                                saleMade=true;
                            }
                            iphone13_128_black.buyAniPhone(128, "Black");
                        } else if (chosenStorage==256) {
                            if (iphone13_256_black.availableStock>0)
                            {
                                itemPrice=iphone13_256_black.price;
                                saleMade=true;
                            }
                            iphone13_256_black.buyAniPhone(256, "Black");
                        }
                    }else if (chosenColor.equals("Red")) {
                        if (chosenStorage==(128))
                        {
                            if (iphone13_128_red.availableStock>0)
                            {
                                itemPrice=iphone13_128_red.price;
                                saleMade=true;
                            }
                            iphone13_128_red.buyAniPhone(128, "Red");
                        } else if (chosenStorage==256) {
                            if (iphone13_256_red.availableStock>0)
                            {
                                itemPrice=iphone13_256_red.price;
                                saleMade=true;
                            }
                            iphone13_256_red.buyAniPhone(256, "Red");
                        }
                    }
                } else if (chosenModel.equals("iPhoneSE")) {
                    if (chosenStorage==(64))
                    {
                        if (chosenColor.equals("White"))
                        {
                            if (iphoneSE_64_white.availableStock>0)
                            {
                                itemPrice=iphoneSE_64_white.price;
                                saleMade=true;
                            }
                            iphoneSE_64_white.buyAniPhone(64, "White");
                        } else if (chosenColor.equals("Black")) {
                            if ( iphoneSE_64_black.availableStock>0)
                            {
                                itemPrice=iphoneSE_64_black.price;
                                saleMade=true;
                            }
                            iphoneSE_64_black.buyAniPhone(64, "Black");
                        }
                    }
                }
                if (saleMade)
                {
                    CartItem cartItem= new CartItem(chosenModel, chosenColor, itemPrice);
                    cart.add(cartItem);
                }
                saleMade=false;
                itemPrice=0;
            }
            System.out.println("Would you like to buy an accessory?");//checks if an accessory will be bought
            try {
                wantToBuyAccessory=scan.next();
            }catch (InputMismatchException e)
            {
                System.out.println("Please type 'yes' or 'no'");
                wantToBuyAccessory=scan.next();
            }
            while (!(wantToBuyAccessory.equals("yes") || wantToBuyAccessory.equals("no")))//ensure input is valid
            {
                System.out.println("Please type 'yes' or 'no'");
                wantToBuyAccessory= scan.next();
            }
            if (wantToBuyAccessory.equals("yes"))
            {
                System.out.println("Choose accessory to buy");
                System.out.printf("Accessory       Model    Color    Price%n");//display accessories
                for (int i=0; i<chargers.length; i++)
                {
                    if (chargers[i].stock!=0)
                        chargers[i].displayAvailableAccessories();
                }
                for (int i=0; i<cases.length; i++)
                {
                    if (cases[i].stock!=0)
                        cases[i].displayAvailableAccessories();
                }
                airPods.displayAvailableAccessories();
                try {
                    chosenAccessory= scan.next();
                }catch (InputMismatchException e)
                {
                    System.out.println("Please choose an accessory from the ones displayed");
                }
                if (chosenAccessory.equals("Charger"))
                {
                    System.out.println("Choose model");
                    try {
                        chosenChargerModel= scan.next();
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Chargers are only available for iPhone12 and iPhone13, please enter your choice again");
                        chosenChargerModel= scan.next();
                    }
                    while (!(chosenChargerModel.equals("iPhone12")||chosenChargerModel.equals("iPhone13")))//validate input
                    {
                        System.out.println("Chargers are only available for iPhone12 and iPhone13, please enter your choice again");
                        chosenChargerModel= scan.next();
                    }
                    if (chosenChargerModel.equals("iPhone12"))//get corresponding buy function for chosen accessory
                    {
                        if (iPhone12Charger.stock>0)
                        {
                            itemPrice=iPhone12Charger.price;
                            saleMade=true;
                        }
                        iPhone12Charger.buyAccessory("iPhone12");
                    } else if (chosenChargerModel.equals("iPhone13")) {
                        if (iPhone13Charger.stock>0)
                        {
                            itemPrice=iPhone13Charger.price;
                            saleMade=true;
                        }
                        iPhone13Charger.buyAccessory("iPhone13");
                    }
                } else if (chosenAccessory.equals("Case")) {
                    System.out.println("Choose model");
                    try {
                        chosenCaseModel= scan.next();
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Please enter 'iPhone12', 'iPhone13' or 'iPhoneSE'");
                        chosenCaseModel= scan.next();
                    }
                    while (!(chosenCaseModel.equals("iPhoneSE")|| chosenCaseModel.equals("iPhone12") || chosenCaseModel.equals("iPhone13")))//validate input
                    {
                        System.out.println("Please type 'iPhoneSE' or 'iPhone12' or 'iPhone13'");
                        chosenCaseModel= scan.next();
                    }
                    if (chosenCaseModel.equals("iPhoneSE"))//get corresponding buy function
                    {
                        System.out.println("Choose color");
                        try {
                            chosenCaseColor= scan.next();
                        }catch (InputMismatchException e)
                        {
                            System.out.println("Please enter an applicable color for the case");
                            chosenCaseColor= scan.next();
                        }
                        while (!(chosenCaseColor.equals("Red")||chosenCaseColor.equals("Black")))
                        {
                            System.out.println("Please enter an applicable color for the case");
                            chosenCaseColor= scan.next();
                        }
                        if (chosenCaseColor.equals("Red"))
                        {
                            if (iPhoneSERedCase.stock>0)
                            {
                                itemPrice=iPhoneSERedCase.price;
                                saleMade=true;
                            }
                            iPhoneSERedCase.buyAccessory("iPhoneSE", "Red");
                        } else if (chosenCaseColor.equals("Black")) {
                            if (iPhoneSEBlackCase.stock>0)
                            {
                                itemPrice=iPhoneSEBlackCase.price;
                                saleMade=true;
                            }
                            iPhoneSEBlackCase.buyAccessory("iPhoneSE", "Black");
                        }

                    } else if (chosenCaseModel.equals("iPhone12")) {
                        System.out.println("Choose color");
                        try {
                            chosenCaseColor= scan.next();
                        }catch (InputMismatchException e)
                        {
                            System.out.println("Please enter an applicable color for the case");
                            chosenCaseColor= scan.next();
                        }
                        while (!(chosenCaseColor.equals("Blue")||chosenCaseColor.equals("White")))
                        {
                            System.out.println("Please enter an applicable color for the case");
                            chosenCaseColor= scan.next();
                        }
                        if (chosenCaseColor.equals("Blue"))
                        {
                            if (iPhone12BlueCase.stock>0)
                            {
                                itemPrice=iPhone12BlueCase.price;
                                saleMade=true;
                            }
                            iPhone12BlueCase.buyAccessory("iPhone12", "Blue");
                        } else if (chosenCaseColor.equals("White")) {
                            if (iPhone12WhiteCase.stock>0)
                            {
                                itemPrice=iPhone12WhiteCase.price;
                                saleMade=true;
                            }
                            iPhone12WhiteCase.buyAccessory("iPhone12", "White");
                        }
                    }else if (chosenCaseModel.equals("iPhone13")) {
                        System.out.println("Choose color");
                        try {
                            chosenCaseColor= scan.next();
                        }catch (InputMismatchException e)
                        {
                            System.out.println("Please enter an applicable color for the case");
                            chosenCaseColor= scan.next();
                        }
                        while (!(chosenCaseColor.equals("Yellow")||chosenCaseColor.equals("Green")))
                        {
                            System.out.println("Please enter an applicable color for the case");
                            chosenCaseColor= scan.next();
                        }
                        if (chosenCaseColor.equals("Yellow"))
                        {
                            if (iPhone13YellowCase.stock>0)
                            {
                                itemPrice=iPhone13YellowCase.price;
                                saleMade=true;
                            }
                            iPhone13YellowCase.buyAccessory("iPhone13", "Yellow");
                        } else if (chosenCaseColor.equals("Green")) {
                            if (iPhone13GreenCase.stock>0)
                            {
                                itemPrice=iPhone13GreenCase.price;
                                saleMade=true;
                            }
                            iPhone13GreenCase.buyAccessory("iPhoneS13", "Green");
                        }
                    }
                } else if (chosenAccessory.equals("AirPods")) {
                    if (airPods.stock>0)
                    {
                        System.out.println("AirPods are only available for iPhone 13");
                        itemPrice=airPods.price;
                        saleMade=true;
                    }
                    airPods.buyAccessory("iPhone13");
                }
                CartItem cartItem;
                if (saleMade)
                {
                    if (chosenAccessory.equals("Case"))
                    {
                        cartItem= new CartItem(chosenAccessory, chosenCaseColor, itemPrice);
                    }
                    else
                        cartItem= new CartItem(chosenAccessory,"" , itemPrice);
                    cart.add(cartItem);
                }
                saleMade=false;
                itemPrice=0;
            }

            System.out.println("Cart:");//display cart
            for (int i=0; i<cart.size(); i++)//calculate total price
            {
                System.out.printf("%s %s : %d%n", cart.get(i).itemColor, cart.get(i).itemName, cart.get(i).itemPrice);
                cartTotalPrice= cartTotalPrice+cart.get(i).itemPrice;
            }
            System.out.printf("Total: %d%n", cartTotalPrice);
            System.out.println("Please confirm sale, enter 'confirm' or 'no'");
            try {
                confirmSale=scan.next();
            }catch (InputMismatchException e)
            {
                System.out.println("Please  enter 'confirm' or 'no'");
                confirmSale=scan.next();
            }
            while (!(confirmSale.equals("confirm")||confirmSale.equals("no")))
            {
                System.out.println("Please  enter 'confirm' or 'no'");
                confirmSale=scan.next();
            }
            if (confirmSale.equals("confirm"))//if sale is confirmed, we proceed normally and ask if we will make another sale
            {
                cartTotalPrice=0;//reset cart total price
                System.out.println("Would you like to make another sale?");
                try {
                    makeASale= scan.next();//check if another sale will be made
                }catch (InputMismatchException exception)
                {
                    System.out.println("Please type 'yes' or 'no'");
                    makeASale= scan.next();
                }
                while (!(makeASale.equals("yes") || makeASale.equals("no")))
                {
                    System.out.println("Please type 'yes' or 'no'");
                    makeASale= scan.next();
                }
            }
            else//since user wants to start again, reset all stocks to original numbers and clear cart to start over
            {
                iphone12_64_white.availableStock=1;
                iphone12_64_black.availableStock=4;
                iphone12_64_blue.availableStock=2;
                iphone12_128_white.availableStock=2;
                iphone12_128_black.availableStock=3;
                iphone12_128_blue.availableStock=4;
                iphone13_128_white.availableStock= 2;
                iphone13_128_black.availableStock=3;
                iphone13_128_red.availableStock=1;
                iphone13_256_white.availableStock= 3;
                iphone13_256_black.availableStock=1;
                iphone13_256_red.availableStock=2;
                iphoneSE_64_white.availableStock=2;
                iphoneSE_64_black.availableStock=3;
                iPhone12Charger.stock=3;
                iPhone13Charger.stock=2;
                iPhoneSERedCase.stock=2;
                iPhoneSEBlackCase.stock=1;
                iPhone12BlueCase.stock=3;
                iPhone12WhiteCase.stock=4;
                iPhone13YellowCase.stock=1;
                iPhone13GreenCase.stock=3;
                airPods.stock=5;
                cart.clear();
                cartTotalPrice=0;
                makeASale="yes";
            }
        }
    }
}