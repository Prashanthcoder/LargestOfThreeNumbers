import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("enter second number:");
        int b=sc.nextInt();
        System.out.println("enter three number");
        int c=sc.nextInt();

        int largest;
        if(a>=b && a>=c) {
            largest=a;
        }else if(b>=a && b>=c) {
            largest=b;
        }else {
            largest=c;
        }
        System.out.println("largest among these three number is :"+ largest);

        sc.close();

    }

}
