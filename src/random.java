//Sherlock and Anagrams HackerRank doubt ...not correct
//
import java.io.*;
import java.util.*;

class random {
	private static int endpt;
	private static int counter =0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] list = new int[T];
		for (int i = 0; i < T; i++) {
			String A = (br.readLine());

			list[i] = fun(A);
			counter=0;
		}
		for (int i = 0; i < T; i++) {
			System.out.println(list[i]);
		}
	}

	public static int fun(String A) {
		int i, j, k, count = 1;
		endpt = A.length();
		String str = new String();
		String substr = new String();
		//char[] arr = A.toCharArray();
		while (count < A.length()) {
			i = 0;
			while (i <= endpt-1-count) {
				substr = A.substring(i, i + count);
				str = A.substring(i + 1);
				recur(str, rev(substr));
				i++;
			}

			count++;
		}
		return counter;
	}

	public static void recur(String str, String substr) {
		{
			int index = str.indexOf(substr);
			if (index != -1) {
				counter++;
				if ((index + 1) < str.length())
					recur(str.substring(index + 1), substr);

			} else
				return;
		}
	}

	public static String rev(String word) {
		StringBuffer buffer = new StringBuffer(word);
		buffer.reverse();
		return buffer.toString();

	}
}