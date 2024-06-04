package min.java.lambda;

public class MemberUsing {
class MemberInner{
	int innerField = 20;
	public void use() {
		MemberInterface memberInterface = () ->{
			System.out.println("멤버 변수 :" + innerField);
			System.out.println("참조 멤버 변수 :" + this.innerField);
		};
		memberInterface.call();
	}
}
public static void main(String[] args) {
	MemberUsing  memberUsing= new MemberUsing();
	MemberUsing.MemberInner memberInner = memberUsing.new MemberInner();
	memberInner.use();
}
}
