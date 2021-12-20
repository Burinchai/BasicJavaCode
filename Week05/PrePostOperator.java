package Week05;
public class PrePostOperator {
    public static void main(String[] args) {
        int x = 5, y = 4;
        int ans;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        ans = x + ++y;
        System.out.println(ans);
    }
}
