
public class MainClass3{
	public static void main(String args[]) {
		Geometry [] tuxing=new Geometry[29]; //�� 29 �� Geometry ����
		for(int i=0;i<tuxing.length;i++) { //29 �� Geometry ����ֳ�����
			if(i%2==0)
			tuxing[i]=new Rect(16+i,68);
			else if(i%2==1)
			tuxing[i]=new Circle(10+i);
		}
		TotalArea computer=new TotalArea();
		computer.setTuxing(tuxing);
		System.out.printf("����ͼ�ε����֮��:\n%f",computer.computerTotalArea());
	}
}