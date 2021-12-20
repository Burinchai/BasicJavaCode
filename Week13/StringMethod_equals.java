package Week13;

public class StringMethod_equals {
    public static void main(String[] args) {
        String lastname1 = "Sukon";
        String lastname2 = "sukon";

        //เปรียบเทียบเท่ากัน    .equals()
        boolean result = lastname1.equals(lastname2);
        //System.out.println(result);
        
        //เปรียบเทียบเท่ากันไม่สนอักษรเล็กใหญ่  .equals()
        boolean result2 = lastname1.equalsIgnoreCase(lastname2);

        if(result2){
            System.out.println(lastname1+" same "+lastname2);
        }else{
            System.out.println(lastname1+" not same "+lastname2);
        }
    }
}
