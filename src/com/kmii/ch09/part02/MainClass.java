package com.kmii.ch09.part02;



public class MainClass {
	
	public static void operate(Calculator cal) { // 임시 객체가 인수값으로 들어옴
		System.out.println("연산결과 : " + cal.add(10, 20));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//인터페이스를 구현한 익명 객체 예제
		//Greeting greeting = new Greeting(); 인터페이스는 인스턴스 생성불가
		Greeting greeting = new Greeting() {
			
			@Override
			public void sayHi() {
				// TODO Auto-generated method stub
				System.out.println("안녕! 하이!");
			} //임시로 ㅆㅓ주는것..?
		};
		
		greeting.sayHi();
		
		
		System.out.println("---------------------------------------------");
		
		//추상클래스를 상속한 익명 객체
		Animal animal = new Animal() {
			
			@Override
			void sound() {
				// TODO Auto-generated method stub
				System.out.println("짖는 소리");
			}
			
			@Override
			void run() {
				// TODO Auto-generated method stub
				System.out.println("달리기!");
			}
		};
		
		animal.sound();
		animal.run();
		
		System.out.println("---------------------------------------------");
		
		//메서드의 매개변수로 익명 객체 전달
		
		
		//operate 위에 선언
		operate(new Calculator() {   
			
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;  //a와 b의 합 변환하도록 오버라이딩 
			}
		}); //Calculator로 만든 객체만 인수로 넣을 수 있음 -> but Calculator가 인터페이스라 객체 선언 불가! - 인수 넣을 수 없음. -> 익명객체 사용
		
		
		
		
		
	}

}
