
public class School implements CompurerAverage {
 //������ 1����д public double average(double x[])����,�������� x[]��Ԫ�ص�����ƽ��
	public double average(double x[]) {
		double sum=0;
		for(double i:x) {
			sum+=i;
		}
		return sum/x.length;
	}
	
}
