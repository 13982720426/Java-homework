public class Example {
    public static void main(String[] args) {
        String str = "ABCdef";
        System.out.println(str.toUpperCase());//把当前字母串中的小写字母转换为大写字母
        System.out.println(str.toLowerCase());//把当前字符串中的大写字母转换为小写字母
        System.out.println(str.concat("123"));//字符串调用该方法与参数的字符进行连接
    }
}
