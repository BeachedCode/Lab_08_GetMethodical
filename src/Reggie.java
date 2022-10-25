import java.util.Scanner;
public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String menuAnswer = "";
        boolean done = false;
        String SSN = SafeInput.getRegExString(in, "Enter your social security number", "\\d{3}-\\d{2}-\\d{4}");
        String MN = SafeInput.getRegExString(in, "Enter your UC M-number", "(M|m)\\d{8}");
        do {
            System.out.println("Select a menu option:\n   Open(O)  Save(S)  View(V)  Quit(Q)");
            if (in.hasNext())
            {
                menuAnswer = in.nextLine().toUpperCase();
                if (menuAnswer.equals("O") || menuAnswer.equals("S") || menuAnswer.equals("V") || menuAnswer.equals("Q"))
                {
                    done = true;
                }
            }
        } while(!done);
    }
}
