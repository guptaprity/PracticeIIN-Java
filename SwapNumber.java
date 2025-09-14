import java.util.Scanner;
//Without using Third variable swapping
class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number ");
        int a = sc.nextInt();
        System.out.println("Enter Second number ");
        int b = sc.nextInt();
        
        System.out.println("Before Swapping a =  " +a+ " ,"+ "b  = "+b);
        
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping a =  " +a+ " ,"+ "b  = "+b");
        
        
    }
}
