import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int age=sc.nextInt();
        System.out.println(age>18?"Eligible":"Not Eligible");
    }

}
