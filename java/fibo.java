import java.util.Scanner;

public class fibo {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter Count number: ");
            int count = input.nextInt();
            int a=0,b=1,c=1;
            for(int i=0;i<count;i++)
            {
                System.out.println(a);
                c=a+b;
                a=b;
                b=c;
            }
        
    }
    
}
