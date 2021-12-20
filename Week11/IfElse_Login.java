package Week11;

import java.util.Scanner;

public class IfElse_Login {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        
        String username_Db = "Admin", password_Db = "123456";
        
        System.out.print("Enter Username : ");
        String username = kb.nextLine();
        System.out.print("Enter Password : ");
        String password = kb.nextLine();

        if((username.equals(username_Db))  && (password.equals(password_Db))){
            System.out.println("You are Logim");
        }else{
            System.out.println("You not admin");
        }
        kb.close();

    }
}
