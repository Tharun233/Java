import java.util.Scanner;

public class c1 {

	public static void main(String[] args)
	{
		int i,res = 1;
		
		System.out.println("Enter factorial number");
		
		Scanner sc=new Scanner(System.in);
		
		i=sc.nextInt();
		while (i>0) 
		{
			res= res*i;
			i--;
		}
		
		System.out.println(res);
	}

}
