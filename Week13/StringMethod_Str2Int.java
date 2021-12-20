package Week13;

public class StringMethod_Str2Int {
    public static void main(String[] args) {
        String s1 = "500";
        String s2 = "300.5";
        int num1 = 100;

        System.out.println(s1+num1);
        
        // Integer.praseInt() , Double.praseDouble() , Float.praseFloat() แปลงข้อความเป็นตัวเลข
        int num2 = Integer.parseInt(s1);
        double num3 =Double.parseDouble(s2);
        System.out.println(num2+num1+num3);

    }
}
