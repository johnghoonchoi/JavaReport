interface Pet{ // Pet �������̽� �� 5���� interface ����
	public void wName(String _name);
	public void wAge(int _age);
}
interface Hatching extends Bird{ //Hatching�� Bird �������̽� ���
	public void egg();
}
interface Cat extends Pet{ // Cat�� Pet �������̽� ���
	public void meow(int mc);
}
interface Dog extends Pet{ //Dog�� Pet �������̽� ���
	public void bowwow(int bc);
}
interface Bird extends Pet{ //Bird�� Pet �������̽� ���
	public void tweet(int tc);
}
class ACat implements Cat{ //ACat Ŭ������ Cat �������̽� ����Ͽ� �޼ҵ� ����
	public void meow(int mc){ 
		for(int i=0; i<mc; i++){
			System.out.print("�߿�! ");
		}
	}
	public void wName(String _name) {
		System.out.println("������� �̸��� "+ _name);
	}
	public void wAge(int _age) {
		System.out.println("������� ���̴� "+ _age+"��");
	}
}
class ADog implements Dog{//ADog Ŭ������ Dog �������̽� ����Ͽ� �޼ҵ� ����
	public void bowwow(int bc){
		for(int i=0; i<bc; i++){
			System.out.print("��! ");
		}
	}
	public void wName(String _name) {
		System.out.println("�������� �̸��� "+ _name);
	}
	public void wAge(int _age) {
		System.out.println("�������� ���̴� "+ _age+"��");
	}	
}

class ABird implements Hatching{ //ABird Ŭ������ Hatching �������̽� ����Ͽ� �޼ҵ� ����
	public void tweet(int tc){
		for(int i=0; i<tc; i++){
			System.out.print("±! ");
		}
	}
	public void wName(String _name) {
		System.out.println("���� �̸��� "+ _name);
	}

	public void wAge(int _age) {
		System.out.println("���� ���̴� "+ _age+"��");
	}
	public void egg() {
		System.out.println("���� �˿��� �¾���.");

	}

}


public class PetMain {
	public static void main(String[] args) {
		int pettype=0;
		String name = null;
		int age = 0;
		try{
			pettype=Integer.parseInt(args[0]); //pettype�� ���������� ���� �Է¹���
		}
		catch(NumberFormatException nfe){ //pettype�� ������ �ƴϸ� ����ó�� �߻�
			System.out.println("����ó���߻� (�߸����Է�)");
			System.out.println("Ÿ���� �ݵ�� �������� �Է��Ͻʽÿ�");
			return;
		}
	
		name=String.valueOf(args[1]); //name�� ���ڿ��� �Է¹���
		
		try{
			age=Integer.parseInt(args[2]); //age�� ���������� ���� �Է¹���
		}
		catch(ArrayIndexOutOfBoundsException aioobe){ //�Է��� 3���� �ȵ����� ����ó�� �߻�
			System.out.println("����ó���߻� (�Էº���)");
			System.out.println("������ ��� �Է��Ͻʽÿ�");
			return;
		}

		switch(pettype){ //pettype�� ���� 1~3���� ��� ����Ͽ� �ش�Ŭ���� ��ü ����
		case 1: // pettype 1�ϰ��
			ADog dog = new ADog(); //dog ��ü ����
			dog.wName(name); 
			dog.wAge(age);
			dog.bowwow(age);
			break;
		case 2: //pettype 2�ϰ��
			ACat cat = new ACat(); //cat ��ü ����
			cat.wName(name);
			cat.wAge(age);
			cat.meow(age);
			break;
		case 3: //pettype 3�ϰ��
			ABird bird = new ABird(); //bird ��ü ����
			bird.wName(name);
			bird.wAge(age);
			bird.egg();
			bird.tweet(age);
			break;
		}
	}
}







