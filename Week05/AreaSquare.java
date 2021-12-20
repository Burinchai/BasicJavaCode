package Week05;
import java.util.Scanner;
public class AreaSquare {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter X = ");
        int x = kb.nextInt();
        System.out.print("Enter Y = ");
        int y = kb.nextInt();

        int z = x * y;

        System.out.println(x + " * " + y + " = " + z);
        kb.close();

    }
}
