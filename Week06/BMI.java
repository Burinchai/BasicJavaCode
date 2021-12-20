package Week06;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนน้ำหนัก(kg) : ");
        float weight = kb.nextFloat();
        System.out.print("ป้อนส่วนสูง(m) : ");
        float height = kb.nextFloat();

        float bmi = weight/(height*height);

        System.out.println("น้ำหนัก = "+weight+" kg"+"\nส่วนสูง = "+height+" m"+"\nค่าดัชนีมวลกาย (BMI) = "+bmi);
        kb.close();
       
    }
}
