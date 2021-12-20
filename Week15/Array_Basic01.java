package Week15;
public class Array_Basic01 {
    public static void main(String[] args) {
        //การปรกาศตั้วแปรประเภทArray
        //แบบที่ 1 ประกาศแบบกำหนดสมาชิก
        int[] num = {2,5,8,6,5,65};

        System.out.println(num.length);
        System.out.println(num[4]);

        num[4] = 10;//เปลี่ยนค่าข้อมูลในตัวแปร

        //แบบที่ 2 ประกาศแบบกำหนดขนาด

        char[] alphabet = new char[26];
        alphabet[0] = 'a';
        alphabet[1] = 'b';
        alphabet[3] = 'c';

        System.out.println(alphabet[0]);
        System.out.println(alphabet[25]);



    }
}
