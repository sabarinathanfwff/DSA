import java.util.Scanner;

public class Centered_Full_Pyramid_Star_Pattern {
    public static void main(String[] args) {
        Scanner sd=new Scanner(System.in);
        System.out.print("Enter the number ");
        int n=sd.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=(n-1)-i-1;j++){
                System.out.print("   ");
            }
            for(int j=1;j<i*2;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
