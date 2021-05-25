
public class TotalArea {
	Geometry[] tuxing;
	double totalArea=0;
	public void setTuxing(Geometry[] t) {
		tuxing=t;
	}
public double computerTotalArea() {
	 //【代码 3】用循环语句让 tuxing 的元素调用 getArea 方法， 并将返回的值累加到 totalArea
	for(Geometry i:tuxing)
		totalArea=i.getArea();
		return totalArea;
	}
}