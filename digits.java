import java.util.*;

public class digits
{
	public static void main(String[] args)
	{
		Scanner br = new Scanner(System.in);
		int n,sum=0,digit;
		n=br.nextInt();
		while(n!=0){
			digit=n%10;
			sum=sum*10+digit;
			n=n/10;
		}
		System.out.println(sum);
	}
}
