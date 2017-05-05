

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

public class ByteGold {
	private static Vector<Integer> v1 = new Vector<Integer>(100000000);
	
	public static void main(String[] args) throws java.lang.Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] arr = new long[10];
		int i = 0;
		int num,j;
		for( j=0;j<100000000;j++)
		{
			v1.add(j,0);
		}
		j=0;
		while (i < 10) {
			num = Integer.parseInt(br.readLine());

			arr[i] = fun(num);

			i++;
		}

		for (long res : arr) {
			System.out.println(res);
		}
	}

	public static long fun(int num) {
		if (num == 0)
			return 0;
		if (num == 1)
			return 1;
		if (v1.get(num) != 0)
			return v1.get(num);
		else {
			return (Math.max(
					fun(num / 2) + fun(num / 3) + fun(num / 4), num));
		}

	}
}
