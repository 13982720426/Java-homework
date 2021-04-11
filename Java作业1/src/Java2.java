public class Java2 {
    /**
     * 计算1+1/2!+......+1/20!
     */
    public static void main(String[] args) {
        int i = 1,j=1;
        double sum =0;
        while (i<=20) {
            j = j*i;            //做阶乘（1~20）
            sum = sum+(1.0)/j;   //定义sum为double类型，用1.0除以j
            i++;
        }

        System.out.println("1+1/2!+1/3!...1/20!之和为:"+sum);
    }

}