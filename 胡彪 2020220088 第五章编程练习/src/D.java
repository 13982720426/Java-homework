class D extends C {
    public int f(int a,int b) {
        int division=super.f(a,b);
        return (a*b)/division;
    }
}
