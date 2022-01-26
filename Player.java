/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
    private String name;
    private int points;
  /* your code here - constructor(s) */ 
    public Player() 
    {
      System.out.print("Enter Player Name: ");
      Scanner sc = new Scanner(System.in);
      String newName = sc.NextLine();

      name = newName;
      points = 0;
      System.out.println("Hello and welcome to " + getName());
    }
    public Player(String inputName)
    {
        return inputName;
    }
  /* your code here - accessor(s) */ 
    public String getName()
    {

    }
    public int getPoints()
    {

    }
  /* your code here - mutator(s) */
    public void setName()
    {

    } 
    public void addToPoints(int value)
    {

    }
}