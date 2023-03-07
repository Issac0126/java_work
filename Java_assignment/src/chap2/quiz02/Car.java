package chap2.quiz02;

public class Car {
	
	private String model; //차 모델명 
	private int speed; //현재 속도
	private char mode; //변속모드 (P, R, N, D)
	private boolean start; //시동 온/오프 상태 여부
	
	public Car(String name) {	
		model = name;
		System.out.printf("나는 %s를 구매했습니다.\n", model);
	}
	
	
	void setSpeed (int speed) {
		if(speed<0 || speed>200) { // 속도는 0 미만, 200 이상일 수 없습니다.
			System.out.println("유효한 속도가 아닙니다. (0~200Km)");
			return;
		} else if (!start){ //시동이 걸려있지 않은 상태라면 속도를 지정할 수 없습니다.
			System.out.println("시동이 걸려있지 않으면 속도를 지정할 수 없습니다.");
			return;
		} else if(mode != 'D' && mode != 'R') { //D나 R모드가 아니라면 속도를 지정할 수 없습니다.
			System.out.println("변속모드를 'D'나 'R'로 설정해주세요.");
			return;
		} else if(mode=='R'&& speed>40) { //R모드는 속도를 40 초과해서 지정할 수 없습니다.
			System.out.println("'R'모드인 상태에서는 40Km을 초과할 수 없습니다.");
			return;
		} else { //다 통과했다면 스피드 지정해주기
			this.speed=speed;
		}
	}//set speed end!!
	
	
	void setMode (char mode) {
		if(mode!='R' && mode!='N' && mode!='D'){
			this.mode = 'P';
		} else {
			this.mode = mode;
		} //R N D면 그것으로 설정하고, 그 외 값(P포함이면 P로 설정한다.) 
	}//setMode end
	
	
	public char getMode() { 
		return mode;
	}
	
	void engineStart() { //시동 걸기
		System.out.println("시동버튼을 눌렀습니다."); //1
		injectGasoline(); //2
		injectOil(); //3
		start = true; //4
		moveCylinder(); //5
		System.out.println("시동이 걸렸습니다.");
	}
	
	private void injectGasoline() { //엔진에 연료가 주입되는 기능
		System.out.println("연료가 엔진에 주입됩니다.");
	} 
	
	//엔진오일이 주입되는 기능
	private void injectOil() { 
		System.out.println("엔진오일이 순환합니다.");
	} 
	
	private void moveCylinder() { //실린더가 움직이는 기능
		if(start) {
			System.out.println("실런더가 움직입니다.");
		} else {
			System.out.println("실린더가 움직이지 않습니다.");	return;
		}
	}//실린더 end
	
	void engineStop() { //시동을 끄는 기능입니다.
		if(speed > 0) {
			System.out.println("주행 중에는 시동을 끌 수 없습니다.");
			return;
		} else if(mode!='P') {
			System.out.println("P 모드로 먼저 변속기를 변경하세요.");
			return;
		} else {
			start = false;
			System.out.println("시동이 꺼졌습니다.");
		}
	}//시동 끄기 end!!

	public boolean isStart() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
	}

	
	
	
	
	
	
}
