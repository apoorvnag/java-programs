import java.util.Scanner;

public class StringFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            String formattedNumber = String.format("%-15s%03d",s1,x);
            System.out.println(formattedNumber);
        }
        System.out.println("================================");
        sc.close();

	}

}
