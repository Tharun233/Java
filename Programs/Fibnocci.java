import java.util.Scanner;

public class Fibnocci {

	public static void main(String[] args) 
	{
		int x,n1=0, n2=1, n3;
		
		boolean flag=true;
		
		System.out.println("enter Series number");
		Scanner sc=new Scanner(System.in);
		
		x=sc.nextInt();
		
		System.out.print(n1+" "+n2);
		
		for (int i = 2; i <x; i++) 
		{
			n3= n1+n2;
			
			n1= n2;
			
			n2= n3;
			
			
			System.out.print(" "+n3);
		}
		

	}

}
