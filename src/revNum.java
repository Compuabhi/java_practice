









import java.util.Scanner;


public class revNum {
	
	
	private static int[]line1=new int[10000];
	private static int[]line2=new int[10000];
	public static void main(String args[]) throws java.lang.Exception {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int T=0;//doubt
		 T = scan.nextInt();
		
		line1[0]=0;
		int i=1;
		while(i<10000)
		{if(i%2==0){
			line1[i]=line1[i-1]+3;
			i++;
			}
		else
			{line1[i]=line1[i-1]+1;
			i++;
			
			}
			
		}
		i=3;
		line2[2]=2;
		while(i<10000)
		{
			
			if(i%2==0){
				line2[i]=line2[i-1]+3;
				i++;
				}
			else
				{line2[i]=line2[i-1]+1;
				i++;
				
				}
						
		}
		String[] list = new String[T];
		int arr[][] = new int[T][2];
		for ( i = 0; i < T; i++) {
			arr[i][0] = scan.nextInt();
			arr[i][1] = scan.nextInt();
			list[i] = fun(arr[i][0], arr[i][1]);

		}
		for ( i = 0; i < T; i++) {
			System.out.println(list[i]);
		}
	}


	public static String fun(int x, int y) {
if(x==y)
	return String.valueOf(line1[x]);
else if (x-y==2)
	return String.valueOf(line2[x]);
else
	return "No Number";
	
	}
	
}

