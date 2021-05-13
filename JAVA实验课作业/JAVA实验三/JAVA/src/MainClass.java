class FamilyPerson {
    static String surname;
    String name;
    public static void setSurname(String s){
        surname = s;
    }

    public void setName(String s) {
        name = s;
    }
}
public class MainClass {
    public static void main(String args[]) {
        //【代码 1】 //用类名 FamilyPerson 访问 surname,并为 surname 赋值:"李"
        FamilyPerson.setSurname("李");
        FamilyPerson father,sonOne,sonTwo;
        father = new FamilyPerson();
        sonOne = new FamilyPerson();
        sonTwo = new FamilyPerson();
        //【代码 2】 //father 调用 setName(String s),并向 s 传递"向阳"
        father.setName("向阳");
        sonOne.setName("抗日");
        sonTwo.setName("抗战");
        System.out.println("父亲:"+father.surname+father.name);
        System.out.println("大儿子:"+sonOne.surname+sonOne.name);
        System.out.println("二儿子:"+sonTwo.surname+sonTwo.name);
        //【代码 3】// father 调用 setSurName(String s),并向 s 传递"张"
        father.setSurname("张");
        System.out.println("父亲:"+father.surname+father.name);
        System.out.println("大儿子:"+sonOne.surname+sonOne.name);
        System.out.println("二儿子:"+sonTwo.surname+sonTwo.name);
    }
}
