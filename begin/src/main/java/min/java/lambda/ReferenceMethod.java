package min.java.lambda;

public class ReferenceMethod {
public static int plu(int x, int y) {
	return x + y;
}
public int mul(int x, int y) {
	return x*y;
	
}
public static void main(String[] args) {
	MethodInterface methodInterface = null;
	methodInterface = (x,y) -> ReferenceMethod.plu(x, y);
	System.out.println("람다식 더하기 결괏값 : " + methodInterface.call(7, 7));
	
}
}
