package Week17;

import java.util.Scanner;

public class Array_getDataKB {
    public static void main(String[]arg){
        Scanner kb = new Scanner(System.in);
        int[] num = new int[5];

    
        for (int i = 0; i < num.length; i++) {
            System.out.print("enter number "+(i+1)+" : ");
            num[i] = kb.nextInt();
        } 
        int sum =0 ;
        System.out.print("{");
        for (int i : num) {
            System.out.print(i);
            if(i<=num[0] ){
                System.out.print(",");
            }
            sum = sum+i;
        }
        System.out.println("}");
        System.out.println(sum);
        kb.close();
    }

}
