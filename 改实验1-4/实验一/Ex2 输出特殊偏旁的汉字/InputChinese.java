
public class InputChinese {
	public static void main (String args[ ]){
		char ch='��',zifu=0;
		int p=22920,count=5,position=0;
		System.out.printf("���%d ��ʯ���Եĺ���:\n",count);
		for(char c=ch;c<=ch+count;c++) {
			//������ 1�� //c ���� int ��ת�������㣬���������ֵ�� position
			 position=(int)c;
			
			System.out.printf("%c(%d)",c,position);
		}
		System.out.printf("\n ���%d ��Ů���Եĺ���:\n",count);
		
		for(int n=p;n<=p+count;n++) {
	//	������ 2�� // n �� char ��ת�����㣬���������ֵ�� zifu
			zifu=(char)n;
			System.out.printf("%c(%d)",zifu,n);
		}
	}
}
