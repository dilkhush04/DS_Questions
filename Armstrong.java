import java.util.*;
class Armstrong
{
	public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
	System.out.println("enter the num:");
	int num =sc.nextInt();
	int temp =num;
	int sum=0,res=0;
	while(temp!=0)
	{
		res=temp%10;
		sum=sum+res*res*res;
		temp=temp/10;
	}
	if(sum==num)
	{
	System.out.println("is armstrong number:");	
	}
	else
	{
		System.out.println(" not aarmstrong number:");
	}

 }
}

