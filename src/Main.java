import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws java.lang.Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map m1=new HashMap();
		m1.put(1, "abhi");
		m1.put(2, "raj");
		m1.put(3, "pooja");
		m1.put(4, "ankita");
		m1.put(5, "abcdef");
		Vector v1=new Vector();
		v1.addAll(m1.values());
		for(Object o:v1)
		System.out.println(o);
			
		
		
	}


}
