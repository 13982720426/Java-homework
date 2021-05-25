
public class Rect extends Geometry {
	double a,b;
	Rect(double a,double b) {
		this.a = a;
		this.b = b;
	}
	public double getArea(){ //【代码 1】重写 getArea()方法
	
		return a*b;
	}
}