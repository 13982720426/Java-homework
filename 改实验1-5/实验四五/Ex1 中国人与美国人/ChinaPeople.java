
public class ChinaPeople extends People {
	public void speakHello() {
		System.out.println("����");
	}
	public void averageHeight() {
		height = 168.78;
		System.out.println("�й��˵�ƽ�����:"+height+" ����");
	}
	public void averageWeight() { //������ 1����д public void averageWeight()���������:"�й��˵�ƽ������:65 ����"
		weight = 65;
		System.out.println("�й��˵�ƽ������:"+height+" ����");
	}
	public void chinaGongfu() {
		System.out.println("������,վ����,˯�繭");
	}
}