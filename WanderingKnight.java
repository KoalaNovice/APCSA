// Colin Finney - Wandering Knight Story
// Requirements stated in comments
import java.util.Scanner;
 
import javax.lang.model.util.ElementScanner14;
public class WanderingKnight
{
 public static void main(String[] args)
   {
     try {

        // Initialize important variables used to determine whether the user survives or not, all three must be true to win (a,a,a)
        // All roads lead to some form of death except a,a,a
        boolean pickupCarrot = false;
        boolean putBack = false;
        boolean fightTroll = false;
        Scanner sc = new Scanner(System.in);

        //Intro with pauses after the lines to give time to read
        System.out.println("In order for this to work please enter either a lowercase a or b");
        Thread.sleep(3000);
        System.out.println("POV: You are a wandering knight in a distant land walking along a deserted road");
        Thread.sleep(3000);

        // First question is asked and sends user down the first or second branch of the tree, must choose a to win
       System.out.println("You see a golden carrot lying on the ground  : (a) Pick it up (b) Ignore and walk past");
       pickupCarrot = sc.nextLine().equals("a"); 
       // There are 3 different paths in this if statement, the other 6 are in the else statement below relating to this if
       if (pickupCarrot) {
           
            // Must choose a to survive or else bunny kills you
           System.out.println("You pick up the golden carrot");
           System.out.println("An angry rabbit gets out of his hole and demands you put it back: (a) put it back (b) run away");
           putBack = sc.nextLine().equals("a");
           if (putBack)
           {
                //Note the nested if clauses
                //Must choose a and fight troll or else user dies
               System.out.println("You put it back and continue on the path");
               System.out.println("A troll blocks your path across the river and demands payment in gold: (a) Fight him (b) Jump in and swim across");
               fightTroll = sc.nextLine().equals("a");
 
               if (fightTroll)
               {
                   //Note user wins the fight against the troll in this branch but in the other branch they lose no matter what
                   System.out.println("You commence a fight with the troll.");
               }
               else
               {  
                   System.out.println("You dive into the river and try to swim across but drown.");
               }
           }
           else 
           {
               System.out.println("The bunny is faster than you and hunts you to death.");
               
           }
 
        //On this side of the decision tree the player is doomed for death, while the decisions lead to different deaths they all die
        //There are 6 different paths in this else statement totaling 9
       } else {
           System.out.println("You continue down the path");
           System.out.println("A troll blocks your path across the river and demands payment in gold, not wanting to comply you: (a) Fight him (b) Jump in and swim across");
           fightTroll = sc.nextLine().equals("a");
 
           if (fightTroll)
           {
               System.out.println("Your adrenaline builds and you scream your battle cry.");
               System.out.println("You attack first, do you: (a) swing your sword (b) stab with your sword");
               boolean swingSword = sc.nextLine().equals("a");
 
               if (swingSword)
               {
                   //Note the nested if clauses
                   System.out.println("Your sword digs into the deep flesh and gets stuck.");
                   System.out.println("Do you: (a) dodge back (b) dodge to the side");
                   boolean dodgeBack = sc.nextLine().equals("a");
 
                   if (dodgeBack)
                   {
                       System.out.println("The troll swipes and misses.");
                       System.out.println("Do you: (a) Kick his sensitive parts (b) Punch him in the face");
                       boolean kickCrotch = sc.nextLine().equals("a");
 
                       System.out.println("The troll staggers: (a) Run past him (b) Punch him again ");
                       boolean runAway = sc.nextLine().equals("a");
 
                       if (kickCrotch && runAway)
                       {   System.out.println("You run past him and he kicks you over the bridge.");
                           System.out.println("You drown in the water.");
                       }
                       else if (kickCrotch && !runAway)
                       {
                           System.out.println("You missed your opportunity to run.");
                           System.out.println("The troll stomps on you.");
                       }
                       else 
                       {
                           System.out.println("You missed your opportunity.");
                           System.out.println("He picks you up and crushes you.");
                       }
 
                   }
                   else 
                   {
                       System.out.println("The troll hits you at full force.");
                   }
               }
               else 
               {
                   System.out.println("You stab your sword and it only goes in a couple inches and gets stuck, the troll picks you up and throws you."); 
               }
           }
           else 
           {
               System.out.println("You jump in the river and the fast current sweeps you away as you start to drown."); 
 
           }
       }
       sc.close();
 
       if (pickupCarrot && putBack && fightTroll)
       {
           //Only a,a,a leads to this finish
           System.out.println("Congratulations! You kill the troll and keep on the path until you soon find a small village to rest at.");
       }
       else
       {
           //Other than a,a,a leads to this finish
           System.out.println("You died.");
       }
 
       System.out.println("End of adventure game");
 
     }
     catch(InterruptedException ex)
     {
       ex.printStackTrace();
     }
 
 
   }
}
