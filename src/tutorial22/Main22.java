package tutorial22;

public class Main22 {

	final static int N = 15; 
	
	public static void main(String[] arg) {
		
		// x^2 + y^2  = r^2 
		for(int i = -N; i <= N; i++)
		{
			for(int j = -N; j <= N; j++ )
			{
				if(i * i  + j * j <= N * N)
				{			
					System.out.print("*");			
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
			//반복문 조건문 도형 만들기 
		}
		
	}
}
