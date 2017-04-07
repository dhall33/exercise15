
import java.util.Scanner;

public class Main
{    
    public static void main(String[] args)
    {
        int limit = 0;
        int sum   = 0; //default values
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a Limit: "); //user prompt and scan
        limit = scan.nextInt();
        
  
        System.out.println("The sum of the even numbers between 2 and " + limit + " (inclusive) are:");
        
        for (int count = 1; count <= limit; count++) //logic
        {
            
            if((count & 1)!= 1)
            {
                sum+=count;
                System.out.println(count);
            }
            else if(limit<intMin) {
                System.out.println("That number is too low!"); //error message
            }
        }
        System.out.println("The sum is " + sum); //final output
        
    }
}
