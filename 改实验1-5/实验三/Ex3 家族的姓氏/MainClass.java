
public class MainClass {
	public static void main(String args[]) {
	FamilyPerson.surname="��";//������ 1�������� FamilyPerson ���� surname,��Ϊ surname ��ֵ:"��"
    FamilyPerson father,sonOne,sonTwo;
    father = new FamilyPerson();
    sonOne = new FamilyPerson();
    sonTwo = new FamilyPerson();
    father.setName("����");//������ 2��father ���� setName(String s),���� s ����"����"
    sonOne.setName("����");
    sonTwo.setName("��ս");
    System.out.println("����:"+father.surname+father.name);
    System.out.println("�����:"+sonOne.surname+sonOne.name);
    System.out.println("������:"+sonTwo.surname+sonTwo.name); 
    father.setSurName("��");// ������ 3��father ���� setSurName(String s),���� s ����"��"
    System.out.println("����:"+father.surname+father.name);
    System.out.println("�����:"+sonOne.surname+sonOne.name);
    System.out.println("������:"+sonTwo.surname+sonTwo.name);
   }
}
