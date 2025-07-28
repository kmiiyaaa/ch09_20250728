package com.kmii.ch09.part01;

public class A {

	public A() { //생성자
		
	System.out.println("A객체가 생성됨");
	}
	
	
	// 인스턴스 멤버클래스 B 
	public class B {  
		
		public B() { //생성자
			System.out.println("B객체가 생성됨");
			
		}
		
		int field1;
		public void method1() {
			
		}
		
	}
	
	
	// 정적 멤버클래스 C
	public static class C {
		public C() {
		System.out.println("C객체가 생성됨");
		}
		int field1;
		static int field2;
		void method1() {
		
		}
		static void method2() {
			
		}
	}
		
	// 로컬클래스
		public void methodLocal() {
			class D {
				D() {
					System.out.println("D객체가 생성됨");
				}
				int field1;
				void method1() {
					
				}
			}
			D d = new D();
			d.field1 = 30;
			d.method1();
		
		}
		
		


	
}
