package Lecture04;

public class myTest {
	
	static Elevator2 elev1;
	static Elevator2 elev2;
	static Elevator2 elev3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		elev1 = new Elevator2(); // ±‚∫ª ø§∏Æ∫£¿Ã≈Õ
		elev2 = new Elevator2(20, 1, 8); // ∏¬√„ ø§∏Æ∫£¿Ã≈Õ1
		elev3 = new Elevator2(50, -3, 5); // ∏¬√„ ø§∏Æ∫£¿Ã≈Õ2
		
		for (int i = 0; i < 20; i++) {
			elev1.up();
			elev1.msg("1π¯ ø§∫£ «—√˛ ø¿∏£±‚");
//			elev2.up();
//			elev2.msg("2π¯ ø§∫£ «—√˛ ø¿∏£±‚");
//			elev3.up();
//			elev3.msg("3π¯ ø§∫£ «—√˛ ø¿∏£±‚");
		}
		
		for (int i = 0; i < 20; i++) {
//			elev1.up(2);
//			elev1.msg("1π¯ ø§∫£ 2√˛æø ø¿∏£±‚");
			elev2.up(2);
			elev2.msg("2π¯ ø§∫£ 2√˛æø ø¿∏£±‚");
//			elev3.up(2);
//			elev3.msg("3π¯ ø§∫£ 2√˛æø ø¿∏£±‚");
		}
		
		for (int i = 0; i < 20; i++) {
//			elev1.down(3);
//			elev1.msg("1π¯ ø§∫£ 3√˛æø ø¿∏£±‚");
//			elev2.down(3);
//			elev2.msg("2π¯ ø§∫£ 3√˛æø ø¿∏£±‚");
			elev3.down(3);
			elev3.msg("3π¯ ø§∫£ 3√˛æø ø¿∏£±‚");
		}
		
		

	}

}
