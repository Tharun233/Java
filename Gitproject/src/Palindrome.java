import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		int n,r,res=0;
		
		boolean flag=true;
		
		System.out.println("enter Number");
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		int temp =n;
		while (n>0) 
		{
			r = n%10;
			n = n/10;
			res =(res*10) + r;
		}
		
		if(res==temp)
			System.out.println("palindrome NUMBER");
		else
			System.out.println("Not palindrome Number");

	}

}
