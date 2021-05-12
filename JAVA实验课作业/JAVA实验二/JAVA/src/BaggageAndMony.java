import java.util.Scanner;

public class BaggageAndMony {
	public static void main(String args[]) {
		double trainCharge=12; //火车托运计费:每公斤 12 元
		double carCharge=22; //汽车托运计费:每公斤 12 元
		double planeCharge = 0.062 ;//飞机托运计费:每克 0.062 元

		Scanner reader=new Scanner(System.in);
		double weight,charge;
		int way;
		System.out.printf("输入数字："
				+ "1 火车托运，托运计费:每公斤 12 元，"
				+ "2 汽车托运，托运计费:每公斤 12 元 ，"
				+ "3 飞机托运，托运计费:每克 0.062 元 :");
		way = reader.nextInt();
		switch(way) {
			case 1:
				System.out.printf("输入行李重量:");
				weight = reader.nextDouble();
				System.out.printf("需要计费的重量:%d(kg)\n",(int)weight);
				charge=(int)weight*trainCharge;
				System.out.printf("用火车托运(%f 元/g),费用:%f 元\n", trainCharge,charge);
				break;
			case 2:
				System.out.printf("输入行李重量:");
				weight = reader.nextDouble();
				System.out.printf("需要计费的重量:%d(kg)\n",(int)weight);
				charge=(int)weight*carCharge;
				System.out.printf("用汽车托运(%f 元/g),费用:%f 元\n", carCharge,charge);
				break;
			case 3:
				System.out.printf("输入行李重量:");
				weight = reader.nextDouble();
				System.out.printf("需要计费的重量:%d(kg)\n",(int)weight);
				charge=(int)(weight*1000+0.5)*planeCharge;
				System.out.printf("用飞机托运(%f 元/g),费用:%f 元\n", planeCharge,charge);
				break;
				default:System.out.printf("数字输入不准确");
		}
		reader.close();
	}
}