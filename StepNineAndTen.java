import java.util.ArrayList;
import java.util.Scanner;

public class StepNineAndTen
{
  public static void main(String[] args) 
  {
    boolean playAgain = true;
    String choice = "a";
    String userString = "placeholder";
    int index = 0;
    Scanner sc = new Scanner(System.in);
    ArrayList<String> foodList = new ArrayList<String>(); 
    foodList.add("Apple");
    foodList.add("Banana");
    foodList.add("Kiwi");
    while (playAgain == true)
    {
        System.out.println(foodList);
        System.out.println("Would you like to (a)dd, (i)nsert, (r)emove, re(p)lace, or (q)uit?");
        choice = sc.nextLine();
        
        if (choice == "a")
        {
          System.out.println("Enter a fruit: ");
          foodList.add(sc.nextLine());
        }
        else if (choice == "i")
        {
          System.out.println("Enter a fruit: ");
          userString = sc.nextLine();
          System.out.println("Enter a position: ");
          index = sc.nextInt();
          foodList.add(index, userString);
        }
        else if (choice == "r")
        {
          System.out.println("Enter a position: ");
          index = sc.nextInt();
          foodList.remove(index);
        }
        else if (choice == "p")
        {
          System.out.println("Enter a fruit: ");
          userString = sc.nextLine();
          System.out.println("Enter a position: ");
          index = sc.nextInt();
          foodList.remove(index);
          foodList.add(index, userString);
        }
        else if (choice == "q")
        {
          playAgain = false;
        }
        else
        {
          System.out.println("That was an invalid input! Try again.");
        }
      }
  }
} 