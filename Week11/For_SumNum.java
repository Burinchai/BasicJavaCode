package Week11;

public class For_SumNum {
    public static void main(String[] args) {
        /*int num = 1,sum = 0;
        while(num <= 10){
            sum = sum+num;
            System.out.println("รอบที่ "+num+ " ผลบวกเท่ากับ "+ sum);
            num++;
        }*/
        int sum = 0;
        for(int num = 1; num<=10; num++){
            sum = sum + num;
            System.out.println("รอบ "+num+" ผลบกเท่ากับ "+sum);
        }
        System.out.println("รวมได้ "+sum);
    }
}
