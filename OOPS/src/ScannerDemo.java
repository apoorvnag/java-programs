import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		System.out.println(i);
		float f = scan.nextFloat();
		System.out.println(f);
		scan.nextLine();
		String str = scan.nextLine();
		System.out.println(str);
		scan.close();

	}

}
