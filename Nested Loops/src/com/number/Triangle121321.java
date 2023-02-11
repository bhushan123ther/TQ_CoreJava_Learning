package com.number;

public class Triangle121321 {

	public static void main(String[] args) {
		int n;
		for(int i=1; i<=5; i++)
		{
			n = i;
			for(int j=1; j<=i; j++)
			{
				System.out.print(n);
				n--;
			}
			System.out.println();
		}

	}

}
