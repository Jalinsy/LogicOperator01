public class LogicOperator01 {
	public static void main(String[] args) {
		// '&&' 和 '&' 的区别
		int age = 50;
		if(age > 50 && age < 90) {
			System.out.println("OK");
		}
		
		int a = 4;
		int b = 9;
		if(a < 1 &  ++b < 50) {
			System.out.println("OK2");
		}
		System.out.println("a = " + a + "b = " + b);
  }
}