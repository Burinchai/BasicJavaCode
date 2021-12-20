package Week11;

public class While_SumNum {
    public static void main(String[] args) {
        int num = 1,sum = 0;
        while(num <= 10){
            sum = sum+num;
            System.out.println("รอบที่ "+num+ " ผลบวกเท่ากับ "+ sum);
            num++;
        }
        System.out.println(sum);
    }
}
