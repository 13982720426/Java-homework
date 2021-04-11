public class Java1{
    /**
     * 计算1+1/2!+......+1/20!
     */
    public static void main(String[] args) {
        double x =0,a =1,sum =1;
        while(a <=20){
            sum =sum/a;
            x =x +sum;
            a++;
        }
        System.out.println("1+1/2!+1/3!...1/20!之和为:" +x);
    }
}