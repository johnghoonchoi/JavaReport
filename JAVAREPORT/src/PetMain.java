interface Pet{ // Pet 인터페이스 총 5개의 interface 구현
	public void wName(String _name);
	public void wAge(int _age);
}
interface Hatching extends Bird{ //Hatching은 Bird 인터페이스 상속
	public void egg();
}
interface Cat extends Pet{ // Cat은 Pet 인터페이스 상속
	public void meow(int mc);
}
interface Dog extends Pet{ //Dog는 Pet 인터페이스 상속
	public void bowwow(int bc);
}
interface Bird extends Pet{ //Bird는 Pet 인터페이스 상속
	public void tweet(int tc);
}
class ACat implements Cat{ //ACat 클래스는 Cat 인터페이스 상속하여 메소드 구현
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
class ADog implements Dog{//ADog 클래스는 Dog 인터페이스 상속하여 메소드 구현
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

class ABird implements Hatching{ //ABird 클래스는 Hatching 인터페이스 상속하여 메소드 구현
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
		int pettype=0;
		String name = null;
		int age = 0;
		try{
			pettype=Integer.parseInt(args[0]); //pettype에 정수형으로 값을 입력받음
		}
		catch(NumberFormatException nfe){ //pettype에 정수가 아니면 예외처리 발생
			System.out.println("예외처리발생 (잘못된입력)");
			System.out.println("타입은 반드시 정수형만 입력하십시오");
			return;
		}
	
		name=String.valueOf(args[1]); //name에 문자열을 입력받음
		
		try{
			age=Integer.parseInt(args[2]); //age에 정수형으로 값을 입력받음
		}
		catch(ArrayIndexOutOfBoundsException aioobe){ //입력이 3개가 안들어오면 예외처리 발생
			System.out.println("예외처리발생 (입력부족)");
			System.out.println("정보를 모두 입력하십시오");
			return;
		}

		switch(pettype){ //pettype에 들어온 1~3으로 제어문 사용하여 해당클래스 객체 생성
		case 1: // pettype 1일경우
			ADog dog = new ADog(); //dog 객체 생성
			dog.wName(name); 
			dog.wAge(age);
			dog.bowwow(age);
			break;
		case 2: //pettype 2일경우
			ACat cat = new ACat(); //cat 객체 생성
			cat.wName(name);
			cat.wAge(age);
			cat.meow(age);
			break;
		case 3: //pettype 3일경우
			ABird bird = new ABird(); //bird 객체 생성
			bird.wName(name);
			bird.wAge(age);
			bird.egg();
			bird.tweet(age);
			break;
		}
	}
}







