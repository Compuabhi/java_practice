import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

public class prac {
	public static void main(String args[]) throws IOException {
		// Scanner scan = new Scanner(System.in);
		// int T = scan.nextInt();
		// BigInteger[] list = new BigInteger[T];

		String exp = new String("((a+b)*(z+x))");
		String temp = new String(exp);
		Stack st = new Stack();
		String rpn = new String("");
		int i = 0;
		while (i < exp.length()) {

			if (((int) temp.charAt(i) <= 122) && ((int) temp.charAt(i) >= 97)) {
				rpn = rpn + temp.charAt(i);
				i++;
			} else if (temp.charAt(i) != ')') {
				st.push(temp.charAt(i));
				i++;
			} else if (temp.charAt(i) == ')') {
				while (!st.empty()) {
					char x = (char) st.pop();
					if (x != '(')
						rpn += x;
					else
						break;
				}
				i++;
			}

		}

		System.out.println(rpn);

	}
}
