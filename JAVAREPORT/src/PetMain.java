interface Pet{
	public void wName(String _name);
	public void wAge(int _age);
}
interface Hatching{
	public void egg();
}
interface Cat{
	public void meow(int mc);
}
interface Dog{
	public void bowwow(int bc);
}
interface Bird{
	public void tweet(int tc);
}


class ACat implements Pet,Cat{
	public void meow(int mc){
		for(int i=0; i<mc; i++){
			System.out.print("야옹! ");
		}
	}
	public void wName(String _name) {
		System.out.println("고양이의 이름은 "+ _name);
			
	}
	public void wAge(int _age) {
		System.out.println("고양이의 나이는 "+ _age+"살");
			
	}
}

class ADog implements Pet,Dog{
	public void bowwow(int bc){
		for(int i=0; i<bc; i++){
			System.out.print("멍! ");
		}
	}
	
	public void wName(String _name) {
		System.out.println("강아지의 이름은 "+ _name);
	}
	public void wAge(int _age) {
		System.out.println("강아지의 나이는 "+ _age+"살");
	}	
}

class ABird implements Pet,Bird,Hatching{
	public void tweet(int tc){
		for(int i=0; i<tc; i++){
			System.out.print("짹! ");
		}
	}
	
	public void wName(String _name) {
		System.out.println("새의 이름은 "+ _name);
	}

	public void wAge(int _age) {
		System.out.println("새의 나이는 "+ _age+"살");
	}
	public void egg() {
		System.out.println("새는 알에서 태어났어요.");
		
	}
	
}


public class PetMain {
	 public static void main(String[] args) {
		int pettype;
		String name;
		int age;
		
		pettype=Integer.parseInt(args[0]);
		name=String.valueOf(args[1]);
		age=Integer.parseInt(args[2]);
		
		switch(pettype){
		case 1:
			ADog dog = new ADog();
			dog.wName(name);
			dog.wAge(age);
			dog.bowwow(age);
			break;
		case 2:
			ACat cat = new ACat();
			cat.wName(name);
			cat.wAge(age);
			cat.meow(age);
			break;
		case 3:
			ABird bird = new ABird();
			bird.wName(name);
			bird.wAge(age);
			bird.egg();
			bird.tweet(age);
			break;
	}
		
		
		
		
	//	System.out.println(pettype);
//		System.out.println(name);
//		System.out.println(age);
	}
		//arg 2개 받음 펫타입 이름 나이
		//펫타입 1 은 강아지 2는 고영이 3은 새
		
		//arg 3개 입력 못받으면 예외처리 ㄱ
		//펫종류에 정수가 아닌 숫자 입력 시 예외처리 발생
		
		
	
}







