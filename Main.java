import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner br = new Scanner(System.in);
		int n,i,fact=1;
		n=br.nextInt();
		for(i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
