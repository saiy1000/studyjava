package tutorial21;

public class Main21 {

	final static int N = 30;
	
	public static void main(String[] arg) {
		// for���� : �ʱ�ȭ �κ� , ���Ǻκ� ,����κ� , 
		for(int i = N; i > 0; i--)
		{
			for(int j = i; j>0; j-- )
			{
				System.out.print("*");
			}
			System.out.println();
				
			// ���� for�� , �ݺ����� ���Ͽ� ���� ������
		}
	}
}
