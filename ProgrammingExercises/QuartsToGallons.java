import java.util.Scanner;
public class QuartsToGallons
{
    public static void main(String[] args)
    {
        int numOfQuarts;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter number of quarts to convert >> ");
        numOfQuarts = inputDevice.nextLine();
        System.out.print(numOfQuarts + "to gallons = " + (numOfQuarts * 0.25));
    }
}