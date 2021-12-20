package Week13;

public class StringMethod {
    public static void main(String[]arg){
        String name = "Burinchai";
        String city = new String ("Ratchaburi");
       
        System.out.println(name);
        System.out.println(city);
        

        System.out.println(name+city);

        String result = name+city;
        System.out.println(result);

        String result2 = name+city+".com";
        System.out.println(result2);

        //การต่อสตริง .concat
        System.out.println(result2.concat(".ac.th"));

        //หาความยาวของสตริง  .length()
        System.out.println(name.length());

        int count = name.length();
        System.out.println(count);

        //หาตำแหน่งตัวอักษร .charAt()
        System.out.println(name.charAt(0));

        char characters = name.charAt(0);
        System.out.println(characters);
    }
}
