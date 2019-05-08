package hello;

public interface Greet {

	default String sayHello() {
		return "안녕";
	}
	static String sayHello2() {
		return "한국";
	}
}
