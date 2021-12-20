package Week11;
import java.util.Scanner;
public class WhileLoop_Factorial {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = kb.nextInt();

        long numFac = 1;

        System.out.print(num + "! = ");
        while (num >= 1) {
            numFac = numFac * num;
            System.out.print(num);
            num--;

            if (num >= 1) {
                System.out.print(" * ");

            } else {
                System.out.println("");
            }
        }
        kb.close();
        System.out.println("result : " + numFac);
    }
}
