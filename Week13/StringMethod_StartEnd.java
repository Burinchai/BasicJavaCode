package Week13;
public class StringMethod_StartEnd {
    public static void main(String[] args) {
        String fullname = "นายสมชาย เข็มขัด";

        //หาตำแหน่งของคำ   .startwith()

        if(fullname.startsWith("นาย")){
            System.out.println(fullname+"เป็นผู้ชาย");
        }else{
            System.err.println(fullname+"เป็นผู้หญิง");
        }

        String code = "346845TH";

        boolean check = code.endsWith("TH");

        if(check){
            System.out.println("สินค้า "+code+" มาจากประเทศไทย");
        }else{
            System.out.println("สินค้า "+code+" ไม่ได้มาจากประเทศไทย");
        }
    }
}
