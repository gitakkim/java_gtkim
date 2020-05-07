package app;
import lib.Woman;

public class Girl extends Woman {
	
	public void set(int a,int b,int c) {
		 iq=a;
		 weight=b;
		 height=c;
		 System.out.print("처음 iq는 "+iq+"이고, ");
		 System.out.print("몸무게는 "+weight+"이고, ");
		 System.out.println("키는"+height+"입니다" );
	}
	public void chat() {
		 iq+=5;
	}
	public void study() {
		iq+=10;
	}

	public void eat() {
		weight+=5;
		height+=4;
	}
	public void fight() {
		weight-=4;
		height-=2;
	}
	public void output() {
		System.out.print("나중 iq는 "+iq+"이고, ");
		System.out.print("몸무게는 "+weight+"이고, ");
		System.out.println("키는"+height+"입니다" );
	}
	public static void main(String [] args) {
		Woman wm = new Girl();
		wm.set(100,50,165);
		wm.chat();
		wm.study();
		wm.eat();
		wm.fight();
		wm.output();
	}
}