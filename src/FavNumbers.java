import java.util.Scanner;
public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favInteger = SafeInput.getInt(in, "Enter your favorite integer");
        double favDouble = SafeInput.getDouble(in, "Enter your favorite double");
        System.out.println("Favorite Integer: " + favInteger);
        System.out.println("Favorite Double: " + favDouble);
    }
}
