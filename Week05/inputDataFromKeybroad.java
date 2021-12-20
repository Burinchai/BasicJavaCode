package Week05;
import java.util.Scanner;
public class inputDataFromKeybroad {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please input StudenID : ");
        String id = kb.nextLine();
        System.out.print("Please input Name : ");
        String name = kb.nextLine();
        System.out.print("Please input Age : ");
        short age = kb.nextShort();
        System.out.print("Please input GPA : ");
        float gpa =kb.nextFloat();
        System.out.println("Your StudentID\t: "+id);
        System.out.println("Your Name\t: "+name);
        System.out.println("Your Age\t: "+age);
        System.out.println("Your GPA\t: "+gpa);
        kb.close();
    }
}
