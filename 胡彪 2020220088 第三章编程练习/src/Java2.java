public class Java2 {
    public static void main(String[] args) {
        int i, j;
        int sum = 0;        //记录因子之和
        for (i = 1; i <= 1000; i++) {
            for (j = 1; j < i; j++) {
                if (i % j == 0)
                    sum = sum + j;
            }
            if (sum == i)    //如果因子之和等于它本身，就输出
                System.out.println(i);
            sum = 0;
        }
    }
}
