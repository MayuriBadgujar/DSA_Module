package Queue;

import java.util.Scanner;

public class CircularMain {
	public static void main(String main[]) {
	CircularQueue obj=new CircularQueue();
    Scanner in=new Scanner(System.in);
    int ch;
    System.out.println("Enter size of queue:");
    int size=in.nextInt();
    obj.create_Queue(size); //creating stack
    do
    {
        System.out.println("\n1.Enqueue\n2.Dequeue\n3.Print:\n0.Exit :");
        ch=in.nextInt();
        switch(ch)
        {
            case 1:
                if(obj.is_Full()!=true)// !obj.isFull()
                {
                    System.out.println("Enter element:");
                    int e=in.nextInt();
                    obj.Enqueue(e);
                }
                else
                    System.out.println("Queue is Full");
                break;

            case 2:
                if(obj.is_Empty()!=true)// !obj.isEmpty()
                {

                    int e=obj.Dequeue();
                    System.out.println("Element Dequeued:"+e);
                }
                else
                    System.out.println("queue Empty");
                break;

            case 3:
                if(obj.is_Empty()!=true)// !obj.isEmpty()
                {
                    System.out.println("Elements in queue:");
                    obj.print_Queue();
                }
                else
                    System.out.println("Queue Empty");
                break;

            case 0:
                System.out.println("Exiting thank for using code");
                break;
            default:
                System.out.println("Wrong option selected");
                break;

        }

    }while(ch!=0);


}

}
