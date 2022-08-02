import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.Random;
public class Main {
    public static void main(String[]args)
    {
        Scanner scanner= new Scanner(System.in);



        ArrayList<ArrayList<String>> GroceryList= new ArrayList<>();


        ArrayList<String> bakeryList= new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");


        ArrayList<String> produceList= new ArrayList<String>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");


        ArrayList<String> drinksList= new ArrayList<String>();
        drinksList.add("coffee");
        drinksList.add("Pepsi");

        GroceryList.add(bakeryList);
        GroceryList.add(produceList);
        GroceryList.add(drinksList);


        //for-each better than for loop

        String [] animals= {"cat", "dog", "rat", "bird"};

        for (ArrayList<String> value: GroceryList) {  //wow

            System.out.println(value);

        }



        //wrapper classes

        //  Boolean a= true;
         // Character b= '@'; //autoboxing or
         //  Integer c= 123;
        //   Double d= 3.14;
        //   String e= "Bro";

         //  char f=b.charValue();  //gives the value of B (unboxing) and assign it to f


        //you will not use primitive classes, but wrapper classes. So instead of int, you will use Integer
        //for ArrayLists wrapper/reference classes are used
       // ArrayList<String> food= new ArrayList<String>();

       // food.add("Makarna");
       // food.add("Pizza");
      //  food.add("HotDog");
      //  food.set(0, "Sushi"); //Makarna has been replaced now
      //  food.remove(2); //Hotdog will be removed;
      //  food.clear(); //clear the arrayList
      //  for(int i=0; i<food.size(); i++)
     //   {
        //    System.out.println(food.get(i)); //you have to use get
       // }





       // String[] cars= {"Camaro", "Meow", "Tits"};

         // String[]  cars= new String[3]; //3 strings->initialization
        //   String[][] Array= new String[2][3]; //another way to initialize 2D arrays


          //   for(int i=0; i< Array.length; i++)
          //   {
            //     for(int j=0; j<Array[i].length; j++)//why Array[i].length? Well Array[0] is the first row, then it will move onto the J of that row
             //    {

             //    }
         //    }



        //  String name= "Bilal      ";
       //   Boolean result= name.equalsIgnoreCase("Bilal"); //returns boolean
        //this ignores the casse sensitivity
       // int Length=name.length();
      //  char key= name.charAt(3);
    //    String upper= name.toUpperCase();
      //  String trim=name.trim(); //trims the empty places
     //   System.out.println(upper);
      //  System.out.println(key);
      //  System.out.println(result);





















        /** System.out.print("Hello World!\n");
         long x= 1231241241414421412L;
         boolean z= true;
         System.out.println("The number is " + x); **/

          /**Scanner name= new Scanner(System.in);
          System.out.print("Enter your name: ");
          String Name= name.nextLine();
          System.out.println("Your name is:" + Name);**/

         /** String Name= JOptionPane.showInputDialog("What is your Name: ");
          JOptionPane.showMessageDialog(null, "Hello "+ Name);

          int age= Integer.parseInt(JOptionPane.showInputDialog("Enter your Age: ")); //this is known as parsing because JOptionpane returns a string
        JOptionPane.showMessageDialog(null, "You are " + age + " Years old!");

        double height= Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null, "You are "+ height + " cms Tall!");**/
         //scanner.close(); you should do it!

      //  Random number= new Random();

      //  int x= number.nextInt(6) + 1;
        //  double x = number.nextDouble(10);
        //  boolean z= number.nextBoolean() ;
        //  System.out.println(x);



       // String response= scanner.next();

      //  if(response.equals("q") || response.equals("Q"))
      //  {
         //   System.out.println("You quit!");
     //   }else {
     //       System.out.println("Pew Pew!");
//
      //  }
     //  String name="";

      // while(name.isBlank())
      // {
         //  System.out.println("Enter your name: ");
     //    name  = scanner.next();
   //    }

     //  System.out.println("Your name is: " + name);



    }
}