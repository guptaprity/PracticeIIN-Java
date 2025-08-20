import java.util.Scanner;
class  Spy
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter of number");
		int num = sc.nextInt();
		int sum =0;
		int pro =1;
		while(num!=0) {
			int temp=num;
			int ld=num%10;
			sum = sum+ld;
			pro = pro*ld;
			num= num/10;

		}
		
		System.out.println("sum = "+sum);
		System.out.println("pro = "+pro);
		
		if(sum==pro) {
			System.out.println("Its is a spy num ");
		}
		else {
			System.out.println("It is not a spy num ");
		}
	}
}
