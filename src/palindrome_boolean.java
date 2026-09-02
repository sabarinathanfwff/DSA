import java.util.Scanner;

public class palindrome_boolean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=input.nextInt();
        int temp=n;
        int rev=0;
        while(temp!=0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        if(rev==n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }

}
