import java.util.Scanner;
public class Java3 {
    public static void main(String[] args)
    {
        Scanner cin= new Scanner(System.in);
        System.out.println("请输入一个大于零的整数：");
        int n= cin.nextInt();
        System.out.println("请输入另一个大于零的整数：");
        int m= cin.nextInt();
        if(n>m) {//取较小数作为除数
            int min=m;
            m=n;
            n=min;
        }
        int num1=Gongyue(m,n);//最大公约数
        int num2=Gongbei(m,n);//最小公倍数为
        System.out.println("最大公约数为："+num1+"\n"+"最小公倍数为："+num2);
    }
    public static int Gongyue(int m,int n)//求公约数
    {
        while(m%n!=0) {
            int min = m % n;
            m=n;
            n=min;
        }
        return n;//递归调用将求余后的值作为下一个除数
    }
    public static int Gongbei(int m,int n)//求最小公倍数
    {
        return m*n/Gongyue(m,n);//最小公倍数=两个数的乘积/它们的最大公约数
    }
}