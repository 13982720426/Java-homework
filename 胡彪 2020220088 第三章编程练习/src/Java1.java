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
        System.out.println("while循环1+1/2!+1/3!...1/20!之和为:" +x);
         sum=0;
        double j=1;
        for(int i=1;i<=20;i++){
            j=j*(1.0/i);
            sum=sum+j;
        }
        System.out.println("for循环1+1/2!+1/3!...1/20!之和为:"+sum);

    }
}