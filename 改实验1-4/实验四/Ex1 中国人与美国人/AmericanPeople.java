
public class AmericanPeople extends People {
	public void speakHello() {
		System.out.println("How do you do");
	} //������ 2����д public void speakHello()���������"How do you do"
	public void averageHeight() {//������ 3����д public void averageHeight()���������"American's average height:176 cm"
		height = 176;
		System.out.println("American's average height:"+height+" cm");
	}
	
	public void averageWeight() {
		weight = 75;
		System.out.println("American's average weight:"+weight+" kg");
	}
	public void americanBoxing() {
		System.out.println("ֱȭ����ȭ�����ȭ");
	}
}