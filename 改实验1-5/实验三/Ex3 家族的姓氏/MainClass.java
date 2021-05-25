
public class MainClass {
	public static void main(String args[]) {
	FamilyPerson.surname="李";//【代码 1】用类名 FamilyPerson 访问 surname,并为 surname 赋值:"李"
    FamilyPerson father,sonOne,sonTwo;
    father = new FamilyPerson();
    sonOne = new FamilyPerson();
    sonTwo = new FamilyPerson();
    father.setName("向阳");//【代码 2】father 调用 setName(String s),并向 s 传递"向阳"
    sonOne.setName("抗日");
    sonTwo.setName("抗战");
    System.out.println("父亲:"+father.surname+father.name);
    System.out.println("大儿子:"+sonOne.surname+sonOne.name);
    System.out.println("二儿子:"+sonTwo.surname+sonTwo.name); 
    father.setSurName("张");// 【代码 3】father 调用 setSurName(String s),并向 s 传递"张"
    System.out.println("父亲:"+father.surname+father.name);
    System.out.println("大儿子:"+sonOne.surname+sonOne.name);
    System.out.println("二儿子:"+sonTwo.surname+sonTwo.name);
   }
}
