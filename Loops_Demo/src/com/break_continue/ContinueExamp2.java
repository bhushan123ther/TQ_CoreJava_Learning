package com.break_continue;

public class ContinueExamp2 {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i % 5 == 0)
				continue;
			System.out.println(i);
		}
	}
}