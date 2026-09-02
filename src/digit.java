import java.util.Scanner;

public class digit {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = input.nextInt();
    int no=0;
    while (n > 0) {
        no=no+1;
        n=n/10;
    }
    System.out.println(no);


}
}
