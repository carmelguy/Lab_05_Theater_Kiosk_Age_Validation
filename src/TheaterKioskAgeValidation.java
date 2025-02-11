import java.util.Scanner;
public class TheaterKioskAgeValidation
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
                int age = 0;
                String trash = "";

                System.out.print("Enter your age: ");

                if (in.hasNextInt())
                {
                    age = in.nextInt();
                    in.nextLine(); // Clear the buffer

                    if (age >= 21)
                    {
                        System.out.println("You get a wristband.");
                    }
                    // else { do nothing }
                } else
                {
                    trash = in.nextLine();
                    System.out.println("Invalid input: " + trash);
                    System.out.println("Please enter a valid integer for your age.");
                }
    }
}