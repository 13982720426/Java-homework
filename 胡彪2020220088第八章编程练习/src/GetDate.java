import java.util.Calendar;
import java.util.Scanner;

public class GetDate {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您要查询的年：");
        int year=sc.nextInt();
        System.out.println("请输入您要查询的月：");
        int month=sc.nextInt();
        calendar.set(year,month-1,1);         //实际Calendar对象所表示的时间多一月(如查找11月，实际输出12月)，所以month-1
        char[] title={'日','一','二','三','四','五','六'};
        int daysArray[][]=new int[6][7];
        int daysInMonth=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int index=calendar.get(Calendar.DAY_OF_WEEK)-1;
        int days=1;
        for(int i=index;i<7;i++){
            daysArray[0][i]=days++;
        }
        for(int i=1;i<6;i++){
            for(int j=0;j<7;j++){
                if(days>daysInMonth){
                    i=6;
                    break;
                }else{
                    daysArray[i][j]=days++;
                }
            }
        }
        System.out.println("---------------------"+year+"年"+month+"月"+"-----------------------");
        for(int i=0;i<title.length;i++){
            System.out.print(title[i]+"\t");
        }
        System.out.println("\n");
        for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                if(daysArray[i][j]==0){
                    if(i!=0){
                        return;
                    }
                    System.out.print("\t");
                    continue;
                }
                System.out.print(daysArray[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}