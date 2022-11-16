package Chapter1;
import java.util.Scanner;

public class Median {
	static int med3(int a, int b, int c) {
		if(a>=b) {
			if(b>=c) {
				return b;
			}
			else if(a<=c) {
				return a;
			}
			else return c;
		}
		else if(a>c) {
			return a;
		}
		
		else if(b>c) {
			return c;
		}
		else 
			return b;
		
	}

	

public static void main(String[] args) {
	
	int a,b,c;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("중간값 구하기");
	System.out.println("세 수를 입력하세요 :");
	
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	
	int mid = med3(a,b,c);
	
	System.out.println("중간값 :"+mid);
	
	}
}
