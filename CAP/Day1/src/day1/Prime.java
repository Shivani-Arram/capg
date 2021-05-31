package day1;

public class Prime {
	
	public static int isPrime(int n){
		int c=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				c=1;
				break;
			}
			else {
				c=0;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		int n=9,c=1;
		for(int i=2;c<=n;i++){
			if(isPrime(i)==0) {
				System.out.println(i);
				c++;
			}
			
		}

	}

}
