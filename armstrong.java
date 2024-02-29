import java.util.Scanner;
public class Main{
    static void armstrong(int n){
        int dup = n;
        int sum = 0;
        int reverse  = 0;
        int lastdigit = 0;
        while(n > 0){
            lastdigit = n % 10;
            sum = sum + (lastdigit*lastdigit*lastdigit);
            reverse = (reverse*10) + lastdigit;
            n = n / 10;
        }
        if(sum == dup){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not Armstrong");
        }
    }
    public static void main (String[] args) 
    {
    Scanner s= new Scanner(System.in);
    System.out.print("Enter:");
    int n = s.nextInt();
    armstrong(n);
    }
}


