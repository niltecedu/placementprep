import java.util.Scanner;
public class scanner {
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");
    int sum=0,count=0;
    //String name="";
    aa:
    while(sc.hasNextInt()){
        int num=sc.nextInt();
        sum+=num;
        count++;
    }
    System.out.printf("%d %d",sum,count);
  }
    
}
