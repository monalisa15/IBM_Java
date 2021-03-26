public class CastingDemo {
	public static void main(String[] args) {
	Alpha a = new Alpha();
	a.demo();
	//Beta bt = (Beta) a;
	Beta b = new Beta();
	b.test();
	b.demo();
	Alpha ab =b;
	ab.demo();
	//ab.test();//Error
	Beta ba = (Beta) ab;
	ba.demo();
	ba.test();
	
	
	}

}
