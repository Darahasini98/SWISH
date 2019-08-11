import java.util.Scanner;
class Coffe 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Scanner sc= new Scanner(System.in);
		int Y =sc.nextInt();
		double X = (double)Y;
		int Z = sc.nextInt();
		double P = (double)Z;
		//double X = sc.nextDouble();
		//double P =sc.nextDouble();
		double sum=0.0;
		if(X>= 0 && X<=10000 && P >=1 && P<=100)
		{
		while(X>1.0)
		{


			double D = (P*X)/100;
			sum= sum+ X;
			X=X-D;
		}
		sum =sum+1.0;
		System.out.println((int)sum);
		}
		else
			System.out.println("invalid inputs");
	}
}
