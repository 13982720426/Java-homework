
public class Fushu {
double shibu,xubu;
Fushu(){
	
}
Fushu(double a,double b){
	shibu=a;
	xubu=b;
}
double getShibu() {
	return shibu;
}
double getXubu() {
	return xubu;
}

void shuChu() {
	if(shibu==0&&xubu!=0) 
		System.out.print(xubu+"i");	
	else if(xubu==0)
		System.out.print(shibu);	
	else if(xubu<0)
		System.out.print("("+shibu+""+xubu+"i"+")");	
	else
	System.out.print("("+shibu+"+"+xubu+"i"+")");
}

Fushu add(Fushu r) {//加法运算
	double x=r.getShibu();
	double y=r.getXubu();
	double newShibu=shibu+x;
	double newXubu=xubu+y;
	Fushu result=new Fushu(newShibu,newXubu);
	shuChu();
	System.out.print("+");
	r.shuChu();
	System.out.print("=");
	return result;
}

Fushu sub(Fushu r) {//减法运算
	double x=r.getShibu();
	double y=r.getXubu();
	double newShibu=shibu-x;
	double newXubu=xubu-y;
	Fushu result=new Fushu(newShibu,newXubu);
	shuChu();
	System.out.print("-");
	r.shuChu();
	System.out.print("=");
	return result;
}

Fushu muti(Fushu r) {//乘法运算
	double x=r.getShibu();
	double y=r.getXubu();
	double newShibu=shibu*x-xubu*y;
	double newXubu=xubu*x+shibu*y;
	Fushu result=new Fushu(newShibu,newXubu);
	shuChu();
	System.out.print("*");
	r.shuChu();
	System.out.print("=");
	return result;
}

Fushu div(Fushu r) {//除法运算
	double x=r.getShibu();
	double y=r.getXubu();
	double newShibu=(shibu*x+xubu*y)/(x*x+y*y);
	double newXubu=(xubu*x-shibu*y)/(x*x+y*y);
	Fushu result=new Fushu(newShibu,newXubu);
	shuChu();
	System.out.print("/");
	r.shuChu();
	System.out.print("=");
	return result;
}

}