import java.util.Scanner;

public class BaggageAndMony {
	public static void main(String args[]) {
		double trainCharge=12; //�����˼Ʒ�:ÿ���� 12 Ԫ
		double carCharge=22; //�������˼Ʒ�:ÿ���� 12 Ԫ
		double planeCharge = 0.062 ;//�ɻ����˼Ʒ�:ÿ�� 0.062 Ԫ

		Scanner reader=new Scanner(System.in);
		double weight,charge;
		int way;
		System.out.printf("�������֣�"
				+ "1 �����ˣ����˼Ʒ�:ÿ���� 12 Ԫ��"
				+ "2 �������ˣ����˼Ʒ�:ÿ���� 12 Ԫ ��"
				+ "3 �ɻ����ˣ����˼Ʒ�:ÿ�� 0.062 Ԫ :");
		way = reader.nextInt();
		switch(way) {
			case 1:
				System.out.printf("������������:");
				weight = reader.nextDouble();
				System.out.printf("��Ҫ�Ʒѵ�����:%d(kg)\n",(int)weight);
				charge=(int)weight*trainCharge;
				System.out.printf("�û�����(%f Ԫ/g),����:%f Ԫ\n", trainCharge,charge);
				break;
			case 2:
				System.out.printf("������������:");
				weight = reader.nextDouble();
				System.out.printf("��Ҫ�Ʒѵ�����:%d(kg)\n",(int)weight);
				charge=(int)weight*carCharge;
				System.out.printf("����������(%f Ԫ/g),����:%f Ԫ\n", carCharge,charge);
				break;
			case 3:
				System.out.printf("������������:");
				weight = reader.nextDouble();
				System.out.printf("��Ҫ�Ʒѵ�����:%d(kg)\n",(int)weight);
				charge=(int)(weight*1000+0.5)*planeCharge;
				System.out.printf("�÷ɻ�����(%f Ԫ/g),����:%f Ԫ\n", planeCharge,charge);
				break;
				default:System.out.printf("�������벻׼ȷ");
		}
		reader.close();
	}
}