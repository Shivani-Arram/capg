package day7;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;
import java.util.Scanner;
public class SecondSMallest {
	public static void secondsmallest(Integer[] a) {
		List<Integer> l=Arrays.asList(a);
		Collections.sort(l);
		System.out.println(l.get(1));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer[] a=new Integer[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		secondsmallest(a);
	}

}
