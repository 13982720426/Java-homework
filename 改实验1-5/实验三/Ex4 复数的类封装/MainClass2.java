
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fushu r1=new Fushu(1,2);
		Fushu r2=new Fushu(1,-2);
		System.out.println("复数加法");
		Fushu Result=r1.add(r2);
		Result.shuChu();
		System.out.println("\n复数减法");
		Result=r1.sub(r2);
		Result.shuChu();
		System.out.println("\n复数乘法");
		Result=r1.muti(r2);
		Result.shuChu();
		System.out.println("\n复数除法");
		Result=r1.div(r2);
		Result.shuChu();
	}

}
