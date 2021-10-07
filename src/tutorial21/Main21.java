package tutorial21;

public class Main21 {

	final static int N = 30;
	
	public static void main(String[] arg) {
		// for문은 : 초기화 부분 , 조건부분 ,연산부분 , 
		for(int i = N; i > 0; i--)
		{
			for(int j = i; j>0; j-- )
			{
				System.out.print("*");
			}
			System.out.println();
				
			// 이중 for문 , 반복문에 대하여 도형 만들어보기
		}
	}
}
