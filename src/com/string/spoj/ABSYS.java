package com.string.spoj;

import java.util.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABSYS {
// method to check whether a string is numeric or not?
//	public static boolean isNumeric(String str) {
//		for (char c : str.toCharArray()) {
//			if (!Character.isDigit(c))
//				return false;
//		}
//		return true;
//	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// Scanner scan=new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int i = 0;
		String[] str = new String[T];
		for (; i < T; i++) {
			System.out.println();
			str[i] = br.readLine();

		}
		i=0;
		String[] splitarr = new String[5];
		for(;i<T;i++)
		{
		for (int k=0; k < T; k++)
			splitarr = str[i].trim().split("\\s+");

		switch (0) {
		case 0:
			if (splitarr[0].contains("machula")) {
				splitarr[0] = String.valueOf((Integer.parseInt(splitarr[4]) - Integer
						.parseInt(splitarr[2])));
				break;
			}
		case 1:
			if (splitarr[2].contains("machula")) {
				splitarr[2] = String.valueOf((Integer.parseInt(splitarr[4]) - Integer
						.parseInt(splitarr[0])));
				break;
			}
		case 2:
			if (splitarr[4].contains("machula")) {
				splitarr[4] = String.valueOf((Integer.parseInt(splitarr[2]) + Integer
						.parseInt(splitarr[0])));
				break;
			}
		}
		System.out.println(splitarr[0]+" "+splitarr[1]+" "+splitarr[2]+" "+splitarr[3]+" "+splitarr[4]);

	}
}

}

