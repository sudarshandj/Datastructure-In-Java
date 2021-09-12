package stack;

public class Runner {
	
	public static void main(String args[]) {
		//Stack nums = new Stack();
		DStack nums = new DStack();
		nums.push(20);
		nums.display();
		nums.push(10);
		nums.display();
		nums.push(20);
		nums.display();
		nums.push(410);
		nums.display();
		nums.push(240);
		nums.display();
		nums.push(100);
		/*System.out.println(nums.peek());
		System.out.println(nums.pop());
		System.out.println("Empty:"+nums.isEmpty());*/
		nums.display();
		
		/*System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.pop());System.out.println(nums.pop());*/
		
		nums.pop();
		nums.display();
		nums.pop();
		nums.display();
		nums.pop();
		nums.display();
		nums.pop();
		nums.display();
		nums.pop();
		nums.display();
		nums.pop();
		nums.display();
		nums.pop();
		nums.display();
		/*System.out.println("\nsize:"+nums.size());
		System.out.println(nums.pop());
		System.out.println("Empty:"+nums.isEmpty());*/
	}

}
