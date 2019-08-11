import java.util.Scanner;
class Coffe 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Scanner sc= new Scanner(System.in);
		String S =sc.nextLine();
		String[] str = S.trim().split(" ");
		for(int i=0;i<str.length;i++)
			int arr[i] = Integer.parseInt(str[i]);
		int Y =arr[0];
		double X = (double)Y;
		int Z = arr[1];
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
		System.out.println((int)sum+"\n");
		}
		else
			System.out.println("invalid inputs");
	}
}
