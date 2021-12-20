package Week15;

public class Array_Insert1_1000 {
    public static void main(String[] args) {
        int[] m = new int[1000];
        int num = 1;
        for (int i = 0; i < m.length; i++) {
            m[i]=num;
            num++;

            System.out.println(m[i]);
        }
    }
}
