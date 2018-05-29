package java_example_180514;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		/*
		 * 실수형 변수를 선언하는 타입  double(8 byte), float(4byte)
		 * 자바는 기본 실수값을  double  타입으로 인지하기 떄문에 float 타입의변수에
		 * 실수를 담기위해선 값의 끝에  F를 붙혀야함. 
		 * 
		 */ // e의 용도는 10의 지수
         double var1 = 3.14;
         //int var2 = 3.14;
         float var2 = 3.14f;
         
         double var7 = 3e6;
         float var8 = 3e6f;
         double var9 = 2e-3;
         
         System.out.println("var1   :" + "더 연결하면" + var1);
         System.out.println("var2   :" + var2);
         System.out.println("var2   :" + var7);
         System.out.println("var2   :" + var8);
         System.out.println("var2   :" + var9);
        
	}

}
