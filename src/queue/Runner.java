package queue;

public class Runner {

	public static void main(String[] args) {
		Queue q = new Queue();
		/*q.enQueue(5);
		q.enQueue(21);
		q.enQueue(4);
		q.enQueue(7);*/
		//q.enQueue(2);
		
		q.deQueue();
		q.deQueue();
		
		/*q.enQueue(72);
		q.enQueue(31);*/
		/*q.enQueue(34);
		q.enQueue(13);*/
		System.out.println("is empty:"+q.isEmpty());
		System.out.println("is empty:"+q.isFull());
		System.out.println("size:"+ q.size());
		q.show();
	}

}
