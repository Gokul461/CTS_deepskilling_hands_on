package ff;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		FutureForecasting f = new FutureForecasting();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount: ");
		double principleAmt = sc.nextDouble();
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		System.out.println("Enter the growth rate of interest: ");
		double rate = sc.nextDouble();
		double predictedValue = f.Forecast(principleAmt, rate, year);
		System.out.printf("The Estimated value after %d years: %.2f" ,year,predictedValue);
		sc.close();
	}

}
