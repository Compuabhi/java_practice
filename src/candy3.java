
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.BitSet;

public class candy3 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger t = new BigInteger(br.readLine());
		BigInteger n;
		long i = 0;

		BitSet bs = new BitSet();

		while (i < t.intValue()) {
			System.out.println();
			n = new BigInteger(br.readLine());
			long[] arr = new long[n.intValue()];
			Long sum = (long) 0;

			long j = 0;
			while (j < n.intValue()) {
				arr[(int) j] = Long.parseLong(br.readLine());
				sum =(sum%n.longValue()+ arr[(int) j] % n.longValue())%n.longValue();
				j++;
			}
			if (sum % n.longValue() == 0)
				bs.set((int) i);
			i++;
		}
		for (int k = 0; k < t.intValue(); k++) {
			if (bs.get(k) == true)
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}
}
