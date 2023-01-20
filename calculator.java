package swethapractice;


public class calculator {
	long firstNumber;
	long secondNumber;
	long result;
	
	
	public void add(int a, int b) {
		firstNumber = a;
		secondNumber =b;
		result = firstNumber+secondNumber;
		System.out.println("fistnumber= "+firstNumber);
		System.out.println("secondNumber= "+secondNumber);
		System.out.println("result= "+result);
	}
	
	public void sub(int a, int b) {
		firstNumber = a;
		secondNumber =b;
		result = firstNumber-secondNumber;
		System.out.println("fistnumber= "+firstNumber);
		System.out.println("secondNumber= "+secondNumber);
		System.out.println("result= "+result);
	}
	
	public void mul(int a, int b) {
		firstNumber = a;
		secondNumber =b;
		result = firstNumber*secondNumber;
		System.out.println("fistnumber= "+firstNumber);
		System.out.println("secondNumber= "+secondNumber);
		System.out.println("result= "+result);
	}
	
	public void div(int a,int b) {
		firstNumber = a;
		secondNumber =b;
		result = firstNumber/secondNumber;
		System.out.println("fistnumber= "+firstNumber);
		System.out.println("secondNumber= "+secondNumber);
		System.out.println("result= "+result);
	}
	
	public void prcntg(int a, int b) {
		firstNumber = a;
		secondNumber =b;
		result = firstNumber%secondNumber;
		System.out.println("fistnumber= "+firstNumber);
		System.out.println("secondNumber= "+secondNumber);
		System.out.println("result= "+result);
	}

}
