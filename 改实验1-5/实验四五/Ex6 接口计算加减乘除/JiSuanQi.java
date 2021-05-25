
interface	ICompute{
	double compute(double n,double m);
}
class UseCompute{
	public void UseCom(ICompute com,double n,double m){
		com.compute(n,m);
	}
}
class Add implements ICompute{
	double ret;
	public double compute(double n,double m){
		ret=n+m;
		System.out.println(n+"+"+m+"="+ret);
		return ret;
	}
}
class Minus implements ICompute{
	double ret;
	public double compute(double n,double m){
		ret=n-m;
		System.out.println(n+"-"+m+"="+ret);
		return ret;
	}
}
class Mul implements ICompute{
	double ret;
	public double compute(double n,double m){
		ret=n*m;
		System.out.println(n+"*"+m+"="+ret);
		return ret;
	}
}
class Div implements ICompute{
	double ret;
	public double compute(double n,double m){
		ret=n/m;
		System.out.println(n+"/"+m+"="+ret);
		return ret;
	}
}

public class JiSuanQi{
	public static void main(String []args){
		UseCompute fun=new UseCompute();
		double m=8,n=2;
		fun.UseCom(new Add(),m,n);		
		fun.UseCom(new Minus(),m,n);
		fun.UseCom(new Mul(),m,n);
		fun.UseCom(new Div(),m,n);
	}
}
