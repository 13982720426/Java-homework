
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fushu r1=new Fushu(1,2);
		Fushu r2=new Fushu(1,-2);
		System.out.println("�����ӷ�");
		Fushu Result=r1.add(r2);
		Result.shuChu();
		System.out.println("\n��������");
		Result=r1.sub(r2);
		Result.shuChu();
		System.out.println("\n�����˷�");
		Result=r1.muti(r2);
		Result.shuChu();
		System.out.println("\n��������");
		Result=r1.div(r2);
		Result.shuChu();
	}

}
