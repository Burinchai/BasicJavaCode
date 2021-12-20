package Week11;

public class WhileTrue_01 {
    public static void main(String[] args) {

        int count = 0;
        while (true) {
            count++;
            System.out.println("รอบ " + count + " java");
            if (count == 1000)
                break;

        }
    }
}
