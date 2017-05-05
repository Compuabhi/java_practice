



import java.io.BufferedReader;
import java.io.InputStreamReader;


public class LastDigit {

	public static void main(String[] args) throws java.lang.Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		byte i = 0;
		String str = new String();
		String []strarr=new String[2];
		byte a;
		int b;
		byte t = Byte.parseByte(br.readLine());
		byte[]arr=new byte[t];
		while (i < t) {
			str = br.readLine();
			strarr = str.trim().split("\\s+");
			a = Byte.parseByte(strarr[0]);
			b = Integer.parseInt(strarr[1]);
			arr[i]=fun(a,b);
			i++;
		}
		
		for (byte res : arr) {
			System.out.println(res);
		}
	}


	public static byte fun(byte a, int b) {

		byte[] ar={0,0,0,0,1,1,1,1,6,2,4,8,1,3,9,7,6,4,6,4,5,5,5,5,6,6,6,6,1,7,9,3,6,8,4,2,1,9,1,9};
		if(b==0)
			return 1;
		else
			return ar[(((a%10)<<2)+ (b&3))];
			
	}
}



/*
 * another concept by right to left binary method
(a*b)mod m=((a mod m)*(b*mod m))mod m;
byte res= 1;
while(b>0)
{if(b%2==1)
	res=(byte) ((res*a) %10 );
     b=b>>1;
     a=(byte) ((a*a)%10);
	
}
return res;*/
