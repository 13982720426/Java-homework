
public class WeatherForecast { //����
	public static void main(String args[]) {
		Weather weatherBeijing =new Weather();
		System.out.print("\n �������:");
		weatherBeijing.setState(new CloudyDayState());
		weatherBeijing.show();
		System.out.print("\n ����ҹ��:");
		weatherBeijing.setState(new LightRainState());
		weatherBeijing.show();
		System.out.print("ת:");
		weatherBeijing.setState(new HeavyRainState());
		weatherBeijing.show();
		System.out.print("\n �������:");
		weatherBeijing.setState(new LightRainState());
		weatherBeijing.show();
		System.out.print("\n ����ҹ��:");
		weatherBeijing.setState(new CloudyLittleState());
		weatherBeijing.show();
	}
}
