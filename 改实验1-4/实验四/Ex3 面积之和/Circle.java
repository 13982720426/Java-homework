
public class Circle extends Geometry { 
	double r;
	Circle(double r) {
		this.r = r;
	}

public double getArea(){ //������ 2����д getArea()����
		return 3.14*r*r;
	}
}