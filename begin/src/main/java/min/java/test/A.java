package min.java.test;

public class A {
int age;
String name;
public int getAge() {
	return age;
}
public String getName() {
	return name;
}
public A setAge(int age) {
	return this;
}
public A setName(String name) {
	return this;
}
@Override
public String toString() {
	return "A [age=" + age + ", name=" + name + "]";
}

}
