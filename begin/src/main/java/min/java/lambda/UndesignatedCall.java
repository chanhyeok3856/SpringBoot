package min.java.lambda;

public class UndesignatedCall {
public static void main(String[] args) {
	Undesignated undesignated = () -> {
		String string = "매개 변수 없는 추상 메서드를 호출한다.";
		System.out.println(string);
		
	};
	undesignated.call();
}
}
