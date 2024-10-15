package Queue;

public class CircularQueue {
	private int Q[], MaxSize, front,rear,count=0;

    public void create_Queue(int size) {
        MaxSize = size;//init MaxSize
        front = 0;
        count=0;
        rear=-1;
        Q= new int[size];//create queue

    }

    void Enqueue(int e) {
    	
        rear=(rear+1)%MaxSize;
        count++;
        Q[rear]=e;

   System.out.println("Element " + e + " Inserted in Queue");
    }

    boolean is_Full() {
        if (rear == MaxSize - 1)
            return true;
        else
            return false;
    }

    int Dequeue() {
        int temp = Q[front];
    	front=(front+1)%MaxSize;
        count--;
        return (temp);
    }

    boolean is_Empty() {
        if (count==0)
            return true;
        else
            return false;
    }

    void print_Queue() {//lifo print
       int i,c;
       i=front;
       c=0;
       while(c<count) {
    	   System.out.println(Q[i]);
    	   i=(i+1)%MaxSize;
    	   c++;
       }
    }


}
