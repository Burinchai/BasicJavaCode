package Week15;

public class Array_InsertOddNum {
    public static void main(String[] args) {
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");// Before input Data
            
        }
        int num = 1;
        for (int i = 0; i < x.length; i++) {//Being input Data
            x[i] = num;
            num+=2;
        }
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }
    }
}
