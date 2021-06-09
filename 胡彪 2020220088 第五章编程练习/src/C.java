class C {
    public  int f(int a,int b){
        if(b<a) {
            int temp=0;
            temp=a;
            a=b;
            b=temp;
        }
        int r=b%a;
        while (r!=0) {
            b = a;
            a = r;
            r = b % a;
        }
        return a;
    }
}
