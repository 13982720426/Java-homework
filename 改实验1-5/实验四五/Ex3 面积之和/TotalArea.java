
public class TotalArea {
	Geometry[] tuxing;
	double totalArea=0;
	public void setTuxing(Geometry[] t) {
		tuxing=t;
	}
public double computerTotalArea() {
	 //������ 3����ѭ������� tuxing ��Ԫ�ص��� getArea ������ �������ص�ֵ�ۼӵ� totalArea
	for(Geometry i:tuxing)
		totalArea=i.getArea();
		return totalArea;
	}
}