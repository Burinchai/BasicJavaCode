package Week12;

import java.util.Scanner;

public class Factorial3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while(true){
        System.out.print("Enter Number : ");
        int num = kb.nextInt();
        
        long numFac = 1;
        if(num == 0){
            break;
        }
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
           
            System.out.println("result : " + numFac);
            }
            System.out.println("End of Program");
            kb.close();
        }
    }
