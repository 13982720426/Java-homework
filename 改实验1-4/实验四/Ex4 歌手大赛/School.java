
public class School implements CompurerAverage {
 //【代码 1】重写 public double average(double x[])方法,返回数组 x[]的元素的算术平均
	public double average(double x[]) {
		double sum=0;
		for(double i:x) {
			sum+=i;
		}
		return sum/x.length;
	}
	
}
