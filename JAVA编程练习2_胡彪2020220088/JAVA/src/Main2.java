import java.util.Scanner;

public class Main2 {
    public int total;           // 总运费
    public int dest1;           // 首重费用
    public int dest2;           // 续重费用


    public void calc(int dest1, int dest2) {			// 计算 1 公斤内，和超出 1 公斤费用的方法
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入货物的重量 <公斤>:");
        Scanner wi = new Scanner(System.in);
        int weight = sc.nextInt();
        if (weight <= 1) {
            total = dest1;
        }
        else {
            total = dest1 + (weight -1) * dest2;
        }
    }

    public static void main(String[] args) {
        Main2 total = new Main2();

        Scanner sc = new Scanner(System.in);

        System.out.println("------ 计算运费 ------");				// 页面结构
        System.out.println("1.重庆市内");
        System.out.println("2.江苏、浙江、上海、北京、广东、福建");
        System.out.println("3.天津、安徽、广西、贵州、海南、河北、河南、湖北、湖南、江西、山东、山西、陕西、四川、云南");
        System.out.println("4.甘肃、黑龙江、吉林、辽宁、内蒙古、宁夏、青海、西藏、新疆");
        System.out.println("5.香港、澳门、台湾");

        System.out.print("请选择目的城市 <序号>：");
        int local = sc.nextInt();

        System.out.println("--------输出---------");

        switch (local) {
            case 1:
                System.out.println("您送货的城市为：重庆市内");
                System.out.println("首重：12  " + "续重：2");
                total.calc(12,2);

                break;
            case 2:
                System.out.println("您送货的城市为：江苏、浙江、上海、北京、广东、福建");
                System.out.println("首重：22  " + "续重：13");
                total.calc(22,13);
                break;
            case 3:
                System.out.println("您送货的城市为：天津、安徽、广西、贵州、海南、河北、河南、湖北、湖南、江西、山东、山西、陕西、四川、云南");
                System.out.println("首重:22 " + "续重：14");
                total.calc(22,14);
                break;
            case 4:
                System.out.println("您送货的城市是：甘肃、黑龙江、吉林、辽宁、内蒙古、宁夏、青海、西藏、新疆");
                System.out.println("首重：22  " + "续重：18");
                total.calc(22,18);
                break;
            case 5:
                System.out.println("您送货的城市是：香港、澳门、台湾");
                System.out.println("首重：30  " + "续重：20");
                total.calc(30,20);
                break;
            default:
                System.out.println("输入错误！");
                break;
        }
        System.out.print("总费用是："+ total.total);
    }
}
