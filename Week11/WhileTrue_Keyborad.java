package Week11;

import java.util.Scanner;

public class WhileTrue_Keyborad {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while(true){
            System.out.print("Enter Number : ");
            int num = kb.nextInt();

            if(num==0)
            break;
        }
        kb.close();
    }
}
