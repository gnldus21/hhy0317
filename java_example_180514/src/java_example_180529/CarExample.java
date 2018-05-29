package java_example_180529;

public class CarExample {

	public static void main(String[] args) {
		/*4.Main 클래스
		a.sedan,  Truck에 대한 객체 각각 생성
		b.sedan의 속도를 200. Truck의 속도를 100으로 올림.
		c.sedan의 좌석수를 5, truck의 적재량을 5로 설정
		d.출력문
		i 빨강색 승용차의 속도는 200이고 좌수석은 5개입니다.
		ii. 검정색 트럭의 속도는 100이고 적재량은 5톤입니다.
		*/
		Car ca = new Car();
		Sedan sa = new Sedan();
		Truck tr = new Truck();
		
		sa.Sspeed(200);
		tr.Sspeed(100);
		sa.seat(5);
		tr.upup(5);
		sa.Ccolor("빨강색");
		tr.Ccolor("검정색");
		
		System.out.println(sa.color+"승용차의 속도는 ["+sa.speed+"]이고 좌석수는 ["+sa.capa+"]좌석 입니다.");
		System.out.println(tr.color+"트럭의 속도는 ["+tr.speed+"]이고 적재량은 ["+tr.fullup+"]톤 입니다.");

	}

}
