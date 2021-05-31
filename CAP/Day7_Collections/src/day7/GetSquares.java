package day7;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class GetSquares {
	static void getSquares(int[] a) {
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i:a) {
			m.put(i, i*i);
		}
		for(Map.Entry e:m.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		getSquares(a);

	}

}
