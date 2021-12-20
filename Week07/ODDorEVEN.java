package Week07;
import java.util.Scanner;
public class ODDorEVEN {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = kb.nextInt();
        
        if (n%2==0) {
            System.out.println(n+" is even number");
        }else{
            System.out.println(n+" is odd number");
        }
        kb.close();
    }
}
