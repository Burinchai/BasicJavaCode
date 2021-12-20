package Week17;

public class Array_ForEach {
    public static void main(String[] args) {
        String[] name = {"นายสมชาย","นางสมนึก","นางสมพร","นางสาวสมศรี","นายเอก"};
        int k = 1;
        System.out.println("มีรายชื่อทั้งหมด "+name.length+"คน"+" ประกอบด้วย");

        for (String showname : name) {
            System.out.println(k+". "+showname);
            k++;
        }

        int[] num = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int i : num) {
            sum = sum + i ;
        }
        System.out.println(sum);
        /*for (int i = 0; i <= name.length; i++) {
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
        }*/
    }
}
