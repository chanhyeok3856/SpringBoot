package min.java.lambda;

public class LocalUsing {
	public void use() {
		final int localVar = 40;
		LocalInterface localInterface = () -> {
			System.out.println("로컬 변숫값" + localVar);
		};
		localInterface.call();
	}

}
