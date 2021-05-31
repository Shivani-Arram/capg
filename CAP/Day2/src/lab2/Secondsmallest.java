package lab2;

import java.util.Scanner;
public class Secondsmallest {
	public static int getSecondSmallest(int a[],int n) {
		int t;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		return a[1];
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(getSecondSmallest(a,n));

	}

}
