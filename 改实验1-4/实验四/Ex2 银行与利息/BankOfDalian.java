
public class BankOfDalian extends Bank {
	double year;
	public double computerInterest() {
		super.year=(int)year;
		double r = year-(int)year;
		int day=(int)(r*1000);
		double yearInterest = super.computerInterest(); //������ 2�� super �������ص� computerInterest()����
		double dayInterest = day*0.00012*savedMoney;
		interest= yearInterest+dayInterest;
		System.out.printf("%d Ԫ���ڴ�������%d ����%d �����Ϣ:%f Ԫ\n",
		savedMoney,super.year,day,interest);
		return interest;
	}
}