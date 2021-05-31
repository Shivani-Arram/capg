package lab2;
import java.util.Scanner;
public class Reverse_sort {
	public static int reverse(int n) {
		int res=0,rem;
		while(n!=0) {
			rem=n%10;
			res=res*10+rem;
			n=n/10;
		}
		return res;
		
	}
	public static void getSorted(int a[],int n) {
		int t=0;
		for(int i=0;i<n;i++) {
			a[i]=reverse(a[i]);
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		getSorted(a,n);

	}

}
