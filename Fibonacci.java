import java.util.Scanner;

public class Fab {
     public static void main(String[] args) {
         int a=0,b=1,c;
         int i , n;


         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Number For Fibonacci");
         n = sc.nextInt();

         for(i=1; i<=n; i++){
             System.out.println(a + " ");
             c=a+b;
             a=b;
             b=c;
         }
     }
}
