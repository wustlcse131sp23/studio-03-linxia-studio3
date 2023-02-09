package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Please input n (n >= 2):");
		int n;
		n = in.nextInt();
		in.close();
		
		int a;
		int deleteIndex;
		
		int[] prime = new int[n-1];
		for (int i = 0; i <= n-2; i++) {
			prime[i] = i + 2;
		}
		
		for (int i = 0; i <= n-2; i++) {
			if (prime[i] != 0) {
				a = prime[i];
				deleteIndex = i + a;
				while (deleteIndex <= n-2) {
					prime[deleteIndex] = 0;
					deleteIndex += a;
				}
			}
		}
		
		for (int i = 0; i <= n-2; i++) {
			if (prime[i] != 0) {
				System.out.println(prime[i]);
			}
		}
		
	}

}
