package Week17;
public class Method_Ex02 {
    // method แบบที่ 2 มีการรับค่าที่ส่งมาจาก main program แต่ไม่มีการส่งค่าออก
    public static void main(String[] args) {
        display("ดีใจจัง");
        plus(5, 7);
        display("ไปตลาดให้หน่อย");
        fullname("Burinchai", "Sukon");
    }
    static void plus(int num1, int num2){
        int result = num1+num2;
        System.out.println("ผลลัพท์การบวก เท่ากับ "+result);
    }
    static void display(String x){
        System.out.println(x);
    }
    static void fullname(String fname, String lname){
        System.out.println(fname+" "+lname);
    }

}
