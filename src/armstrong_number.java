import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int digit=Integer.toString(temp).length();
        while(temp!=0){
            int rem=temp%10;
            sum+=(int)Math.pow(rem,digit);
            temp=temp/10;

        }
        if(sum==n){
            System.out.println("Armstrong Number :"+sum);
        }
        else{
            System.out.println("Not Armstrong Number :"+sum);
        }

    }
}
