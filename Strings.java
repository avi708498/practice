import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Name");
        String Name = sc.nextLine();
        System.out.println("Last Name");
        String Lastname = sc.nextLine();
        String Fullname = Name+Lastname;
        System.out.println(Fullname);
        System.out.println(Fullname.length());
        for(int i = 0; i<Fullname.length();i++ ){
            System.out.println(Fullname.charAt(i));
            
        }
        if (Name.compareTo(Lastname)==0) {
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        // This is only for the substring
        String Middlename = Fullname.substring(8,18);
        System.out.println(Middlename);
    }
}
