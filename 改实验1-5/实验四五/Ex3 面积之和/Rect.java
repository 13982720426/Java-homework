
public class Rect extends Geometry {
	double a,b;
	Rect(double a,double b) {
		this.a = a;
		this.b = b;
	}
	public double getArea(){ //������ 1����д getArea()����
	
		return a*b;
	}
}