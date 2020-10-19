
public class TheQueue {

	private String[] queueArray;

	private int queueSize;

	private int font, rear, numberOfItem = 0;

	TheQueue(int size){
		queueSize = size;
		queueArray = new String[size];

		Arrays.fill(queueArray, "-1");
	}

	public void insert(String input){
		if(numberOfItem + 1 <= queueSize){
			queueArray[rear] = input;

			rear++;

			numberOfItem++;

			System.out.println("INSERT" + input + " Was added to the Queue\n") ;
		}
		else
		{
			System.out.println("Sorry but the Queue is Full");
		}
	}

	public void remove(){
		if(numberOfItem > 0){
			System.out.println("Remove " + queueArray[font] + " was removed");

			queueArray[font] = -1;

			font++;

			numberOfItem++;
		} else{
			System.out.println("Sorry but the Queue is Empty");
		}
	}

	public void peek(){
		System.out.println("The first eliement is " + queuequeueArray[font]);

	}

	public static void main(String[] args) {
		 
		TheQueue theQueue = new TheQueue(10);

		theQueue.insert("10");
		theQueue.insert("15");
		theQueue.insert("11");

		theQueue.displayTheQueue();
		

	}

}
