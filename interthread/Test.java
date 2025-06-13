package interthread;

@FunctionalInterface
public interface Test {
	void m1();
	default void m2() {
		System.out.println("heeloo");
	}
	static void m3() {
		System.out.println("jjjjjjjj");
	}
	
}
