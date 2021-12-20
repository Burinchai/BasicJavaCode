package Week15;

public class Array_ShowGender {
    public static void main(String[] args) {
        String[] name = {"นายสมชาย","นางสมนึก","นางสมพร","นางสาวสมศรี","นายเอก"};
        int k = 1;
        System.out.println("มีรายชื่อทั้งหมด "+name.length+"คน"+" ประกอบด้วย");

        
        for (int i = 0; i <= name.length; i++) {
            boolean result = name[i].startsWith("นาย");
                if(result){
                    System.out.println(k+". "+name[i]+"\t==>"+" เป็นผู้ชาย");
                }else{
                    System.out.println(k+". "+name[i]+"\t==>"+" เป็นผู้หญิง");
                }
            k++ ;
            if(k>5){
                break;
            }
        }
    }
}
