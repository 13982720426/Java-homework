
public class User {
	public static void main(String args[]) {
		CD dataCD = new CD();
	    int b[] ={1,2,3,4,5,6,7,8};
	    dataCD.setSize(b.length);
	    dataCD.setContent(b);
	    int a[]=dataCD.getContent();
	    System.out.println("dataCD �ϵ����ݣ� ");
	    for(int i=0;i<a.length;i++)
	    	System.out.printf("%3d",a[i]); 
	    Computer computerIMB = new Computer();
	    computerIMB.putCD(dataCD);//������ 1��computerIMB ���� putCD(CD cd)����,�� dataCD �����ô��ݸ� cd
	    System.out.println("\n �� dataCD �����ݸ��Ƶ������:computerIMB.");
	    computerIMB.copyToComputer();//������ 2��computerIMB ���� copyToComputer()����
	    System.out.println("computerIMB �ϵ����ݣ� ");
	    computerIMB.showData();
	    int m=12;
	    System.out.println("\ncomputerIMB ��ÿ����������"+m);
	    computerIMB.addData(m);
	    System.out.println("computerIMB ����ֵ������ݸ��Ƶ� CD:dataCD");
	    computerIMB.copyToCD();//������ 3��computerIMB ���� copyToCD()����
	    System.out.println("dataCD �ϵ����ݣ� ");
	    a=dataCD.getContent();
	    for(int i=0;i<a.length;i++)
	     System.out.printf("%3d",a[i]);
    }
}