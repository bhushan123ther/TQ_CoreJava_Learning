package com.company_ask_prg;

public class UncommanEmail {

	public static void findUncommanEmail(String s1[], String s2[]) {
		boolean flag;
		for (int i = 0; i < s2.length; i++) {
			flag = false;
			for (int j = 0; j < s1.length; j++) {
				if (s2[i].equals(s1[j])) {
					flag = true;
				}
			}
			if (!flag) {
				System.out.println(s2[i]);
			}
		}
	}

	public static void main(String[] args) {
		String str1[] = { "bhushan@gmail.com", "ravi@gmail.com", "ram@gmail.com" };
		String str2[] = { "bhushan@gmail.com", "emli@gmail.com", "ravi@gmail.com", "ram@gmail.com", "gita@gmail.com" };

		findUncommanEmail(str1, str2);
	}

}
