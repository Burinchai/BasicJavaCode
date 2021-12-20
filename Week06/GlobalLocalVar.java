package Week06;
public class GlobalLocalVar {
    public static void main(String[] args) {
        int a=100,b=200;
        System.out.println(a);
        {
            int c=300;
            System.out.println(c);
            System.out.println(a+b);
        }
        
    }
}
