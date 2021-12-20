package Week12;
import java.util.Scanner;
public class BE_To_AD {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int result;

        while (true) {
            System.out.print("Enter The year(BE) : ");
            int BE = kb.nextInt();// รับค่าปีที่เป็น พ.ศ. จากคีย์บอร์ด
            if (BE == 0) {// เงื่อนไขว่าถ้าข้อมูลปีที่ป้อนเข้ามาเป็น 0 จะหยุดรันทันที
                System.out.println("End of Program");
                break;
            }

            result = BE - 543;// เปลี่ยน พ.ศ. เป็น ค.ศ.

            System.out.println("BE to AD is " + result);// แสดงผลค่าที่เป็น พ.ศ. เป็น ค.ศ. แล้ว

        }
        kb.close();
    }

}
