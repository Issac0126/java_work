package chop3;

public class MainClass {

	public static void main(String[] args) {
		
		
		MyCart myca = new MyCart(1400); //초기금액은 2100원
		
		Product newRadio = new Radio(); // 라디오 구매
		Product newTv = new Tv(); // 라디오 구매
		Product newCompu = new Computer(); // 컴퓨터 구매
		
		myca.buy(newRadio);
		myca.buy(newTv);
		myca.buy(newCompu); 
		

	}

}
