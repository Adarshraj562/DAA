import java.util.Random;
import java.util.Scanner;

public class Selectionsort 
{
static int max=30000;
public static void main(String[] args) 
{
int a[]=new int[max];
long start, end;
Scanner sobj=new Scanner(System.in);
System.out.println("selection sort algorithm");
System.out.println("Enter the no of element to be sorted");
int n=sobj.nextInt();
Random rand=new Random();
for(int i=0;i<=n-1;i++)
{
	a[i]=rand.nextInt(100);
}
System.out.println("array element to be sorted");
for(int i=0;i<=n-1;i++)
{
System.out.println(a[i]+" ");
}
a[n]=9999;
start=System.nanoTime();
qsort(a,n);
end=System.nanoTime();
System.out.println("\n the shorted element are");
for(int i=0;i<=n-1;i++)
{
	System.out.println(a[i]+"");
}
System.out.println("\n the time taken to sort is"+(end-start)+"ns");
System.out.println("************");
}
static void qsort(int a[],int n)
{
	int i,j,temp,min;
	for(i=0;i<=n;i++)
	{
		min =i;
		for(j=i+1;j<=n;j++)
		{
			if(a[j]<a[min])
				min=j;
				
		}
		temp=a[i];
		a[i]=a[min];
		a[min]=temp;
	}
}
}
