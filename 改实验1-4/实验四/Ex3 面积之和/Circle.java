
public class Circle extends Geometry { 
	double r;
	Circle(double r) {
		this.r = r;
	}

public double getArea(){ //【代码 2】重写 getArea()方法
		return 3.14*r*r;
	}
}