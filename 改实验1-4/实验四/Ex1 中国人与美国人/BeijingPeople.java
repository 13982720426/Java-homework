
public class BeijingPeople extends ChinaPeople {
	 //【代码 4】重写 public void averageHeight()方法, 输出:"北京人的平均身高:172.5 厘米"
	 //【代码 5】重写 public void averageWeight()方法,输出:"北京人的平均体重:70 公斤"
	public void averageHeight() {
		height = 172.5;
		System.out.println("北京人的平均身高:"+height+" cm");
	}
	
	public void averageWeight() {
		weight = 70;
		System.out.println("北京人的平均体重:"+weight+" kg");
	}
		
	public void beijingOpera() {
		System.out.println("花脸、青衣、花旦和老生");
	}
}