package java_example_180528;

public class Ch7_01_DmbCellPhoneExample {

	public static void main(String[] args) {
		// DmbCellPhone에 대한 객체 생성
		Ch7_01_DmbCellPhone dmb = new Ch7_01_DmbCellPhone("아이폰", "제트블랙", 7);
		//생성한 객체의 모델, 컬러 , 채널 값을 각각 출력
		System.out.println("기종 모델 :" + dmb.model);
		System.out.println("기종 색상 :" + dmb.color);
		System.out.println("채널 :" + dmb.channel);
		//부모 클래스 에서 선언한 메소드 각각 호출
		dmb.PowerOn();
		dmb.PowerOff();
		dmb.bell();
		dmb.sendVoice("재바");
		dmb.receiveVoice("휘바");
		dmb.hangUp();
		//자식 클래스에서 선언한 메소드 각각 호출
		dmb.turnOnDmb();
		dmb.changeChannelDmb(7);
		dmb.turnOffDmb();
	}

}
