
import java.util.Scanner; 
public class MachineSell {
	public static void main(String args[]){
		int money,type;
        int drinkKind;
        boolean YesorNo;
        System.out.printf("Ͷ����:(�س�ȷ��):");
        Scanner reader=new Scanner(System.in);
        money=reader.nextInt();
        while(money>0) {
            System.out.printf("ѡ���Ǹ���λ����Ʒ(��λ��Ԫ)��2 or 3?");
            type=reader.nextInt();
	        if(type==2&&money>=2) {
	        	System.out.printf("ѡ�񾻾���Ȫˮ(1),�����Ȫˮ(2)��������Ȫˮ(3)֮һ:\n");
	            System.out.printf("����1,2��3:");
	            drinkKind=reader.nextInt();
	            switch(drinkKind) {
		            case 1 : System.out.printf("�õ�������Ȫˮ\n");
		            break;
		            case 2 : System.out.printf("�õ������Ȫˮ\n");
		            break;
		            case 3 : System.out.printf("�õ�������Ȫˮ\n");
		            break;
		            default: System.out.printf("ѡ�����");
	            }
	            money-=2;
	        }
	        else if(type==3&&money>=3) {
	        	System.out.printf("ѡ��ˬ�ڿ���(1),����ѩ��(2),��ѩɽ��֭(3)֮һ:\n");
	            System.out.printf("����1,2��3:");
	            drinkKind=reader.nextInt();
	            switch(drinkKind) {
		            case 1 : System.out.printf("�õ�ˬ�ڿ���\n");
		            break;
		            case 2 : System.out.printf("�õ�����ѩ��\n");
		            break;
		            case 3 : System.out.printf("�õ�ѩɽ��֭\n");
		            break;
		            default: System.out.printf("ѡ�����");
	            }
	            money-=3;
	        }
	        else {
	        	System.out.printf("�޴˼�λ��Ʒ�����!");
	        }
	        System.out.printf("��ʣ"+money+"Ԫ���Ƿ��˳���true/false:");
	        YesorNo=reader.nextBoolean();
	        if(YesorNo) {
	        	break;
	        }       		

        } 
        System.out.printf("���㣺"+money+"Ԫ"); 
        
	}
}