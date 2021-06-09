
import java.util.Scanner; 
public class MachineSell {
	public static void main(String args[]){
		int money,type;
        int drinkKind;
        boolean YesorNo;
        System.out.printf("投入金额:(回车确认):");
        Scanner reader=new Scanner(System.in);
        money=reader.nextInt();
        while(money>0) {
            System.out.printf("选择那个价位的商品(单位：元)：2 or 3?");
            type=reader.nextInt();
	        if(type==2&&money>=2) {
	        	System.out.printf("选择净净矿泉水(1),甜甜矿泉水(2)和美美矿泉水(3)之一:\n");
	            System.out.printf("输入1,2或3:");
	            drinkKind=reader.nextInt();
	            switch(drinkKind) {
		            case 1 : System.out.printf("得到净净矿泉水\n");
		            break;
		            case 2 : System.out.printf("得到甜甜矿泉水\n");
		            break;
		            case 3 : System.out.printf("得到美美矿泉水\n");
		            break;
		            default: System.out.printf("选择错误");
	            }
	            money-=2;
	        }
	        else if(type==3&&money>=3) {
	        	System.out.printf("选择爽口可乐(1),清凉雪碧(2),和雪山果汁(3)之一:\n");
	            System.out.printf("输入1,2或3:");
	            drinkKind=reader.nextInt();
	            switch(drinkKind) {
		            case 1 : System.out.printf("得到爽口可乐\n");
		            break;
		            case 2 : System.out.printf("得到清凉雪碧\n");
		            break;
		            case 3 : System.out.printf("得到雪山果汁\n");
		            break;
		            default: System.out.printf("选择错误");
	            }
	            money-=3;
	        }
	        else {
	        	System.out.printf("无此价位商品或金额不足!");
	        }
	        System.out.printf("还剩"+money+"元，是否退出：true/false:");
	        YesorNo=reader.nextBoolean();
	        if(YesorNo) {
	        	break;
	        }       		

        } 
        System.out.printf("找零："+money+"元"); 
        
	}
}