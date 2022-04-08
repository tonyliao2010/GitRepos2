public class Hello{
	public static void main(String[] args){
		#System.out.println("Hello World");
		System.out.println("Hello World 2!!");
	}
	//L2Renewal 修改了内容2
	public void test(){
		System.out.println("test");
	}
	
	
	public void test2(){
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = add(a,b,c);
		printSum(sum);
	}
	
	public int add(int a ,int b ,int c){
		int sum = a+b+c;
	}
	
	public void printSum(int sum){
		System.out.println(sum);
	}

	//master修改的内容
	//L2Renewal 修改了内容

}