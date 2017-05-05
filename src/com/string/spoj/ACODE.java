package com.string.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;

public class ACODE {

	public static void main(String[] args) throws IOException,
			java.lang.Exception {
		List<String> list = new ArrayList<String>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String bi = (br.readLine());

		while (!bi.equals(String.valueOf(0))) {
			list.add(bi);
			bi = (br.readLine());
		}
		while (!list.isEmpty()) {
			System.out.println(count_fun(list.remove(0)));

		}

	}

	public static long count_fun(String BI) {
		if (BI.contains("00"))
			return 0;
		else {

			int l = BI.length();

			long l1 = (BI.charAt(l - 1) == '0') ? 0 : 1;
			long l2 = 1;
			int i = 2;
			boolean check = true;
			long result = 0;
			long temp;

			while (i <= l) {
				if (BI.charAt(l - i) == '0') {
					result = 0;
					temp = l1;
					l1 = result;
					l2 = temp;
					check = true;
					i++;
					continue;

				}
				result = Long.parseLong(BI.substring(l - i, l - i + 2));
				if (result > 26)
					check = false;
				result = (check) ? l2 : 0;
				result += l1;
				temp = l1;
				l1 = result;
				l2 = temp;
				check = true;
				i++;
			}

			return result;
		}
	}
}
