
public class BeijingPeople extends ChinaPeople {
	 //������ 4����д public void averageHeight()����, ���:"�����˵�ƽ�����:172.5 ����"
	 //������ 5����д public void averageWeight()����,���:"�����˵�ƽ������:70 ����"
	public void averageHeight() {
		height = 172.5;
		System.out.println("�����˵�ƽ�����:"+height+" cm");
	}
	
	public void averageWeight() {
		weight = 70;
		System.out.println("�����˵�ƽ������:"+weight+" kg");
	}
		
	public void beijingOpera() {
		System.out.println("���������¡�����������");
	}
}