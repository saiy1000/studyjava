package tutorial14;

public class Main14 {

		public static void main(String[] args) {
			
			int x = 50;
			int y = 60;
			
			System.out.println("�ִ밪��"+ max(x, y) + "�Դϴ�.");
			
			
			
			
		}
		//��ȯ��, �Լ��̸� , �Ű�����
		static int max(int a, int b) {
			int result = (a > b) ? a : b;
			return result;
			
			
		}
}
