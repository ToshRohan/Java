import java.util.Scanner;
public class practice2 {
    public static void main(String  args[]){
        String name;
        int age;
        
        
        Scanner me=new Scanner(System.in);
        System.out.println("Enter your name");
        name=me.nextLine();
        System.out.println("Enter your age");
        age=me.nextInt();
        System.out.println("My name is "+name);
        System.out.println("\nAge is "+age);
    }
    
}
