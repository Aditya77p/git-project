import java.util.Scanner;
public class SumAvg {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the first number: ");
		        int num1 = sc.nextInt();

		        System.out.print("Enter the second number: ");
		        int num2 = sc.nextInt();

		        System.out.print("Enter the third number: ");
		        int num3 = sc.nextInt();

		        int large = num1;
		        if (num2 > large) {
		            large = num2;
		        }
		        if (num3 > large) {
		            large = num3;
		        }

		        int sum = num1 + num2 + num3 - large;

		        System.out.println("The sum of the largest number is: " + sum);
				
        		double average = (num1 + num2 + num3) / 3;

        		System.out.println("The average of the three numbers is: " + average); 

        		
	}

}
