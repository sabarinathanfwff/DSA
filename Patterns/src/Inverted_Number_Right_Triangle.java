import java.util.Scanner;

public class Inverted_Number_Right_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        for(int i=0;i<num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
