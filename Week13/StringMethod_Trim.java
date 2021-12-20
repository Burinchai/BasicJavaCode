package Week13;
public class StringMethod_Trim {
    public static void main(String[] args) {
        String fullname = "   Burinchai Sukon   ";

        int count = fullname.length();
        System.out.println(count);
        System.out.println("Before =>"+fullname);

        // .trim() ตัดช่องว่างหน้าหลังออก
        String result = fullname.trim();
        System.out.println(result.length());
        System.out.println("After =>"+result);

        // .indexof() แสดงผลตำแหน่งที่ของข้อความ
        System.out.println(fullname.indexOf("in"));

        // .toUpperCase() and .toLowerCase()
        System.out.println(result.toUpperCase());
        System.out.println(result.toLowerCase());

        // .substring()  ตัดคำที่ต้องการ
        String uni =  "Nakhon Pathom Rajabhat University";
        System.out.println(uni.substring(0,13));
    }
}
