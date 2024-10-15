package Stack_Programs;



	import java.util.Scanner;

	public class TwoStacks {
	    int[] arr;
	    int tos1, tos2;
	    int size;

	    // Constructor to initialize array and two stack pointers
	    public TwoStacks(int n) {
	        size = n;
	        arr = new int[size];
	        tos1 = -1;              // Stack 1 starts from the left end
	        tos2 = size;            // Stack 2 starts from the right end
	    }

	    // Push an element to Stack 1
	    public void push1(int x) {
	        if (tos1 < tos2 - 1) {  // Check for space between top1 and top2
	            arr[++tos1] = x;
	        } else {
	            System.out.println("Stack 1 Overflow!");
	        }
	    }

	    // Push an element to Stack 2
	    public void push2(int x) {
	        if (tos1 < tos2 - 1) {  // Check for space between top1 and top2
	            arr[--tos2] = x;
	        } else {
	            System.out.println("Stack 2 Overflow!");
	        }
	    }

	    // Pop an element from Stack 1
	    public int pop1() {
	        if (tos1 >= 0) {
	            int x = arr[tos1--];
	            return x;
	        } else {
	            System.out.println("Stack 1 Underflow!");
	            return -1;
	        }
	    }

	    // Pop an element from Stack 2
	    public int pop2() {
	        if (tos2 < size) {
	            int x = arr[tos2++];
	            return x;
	        } else {
	            System.out.println("Stack 2 Underflow!");
	            return -1;
	        }
	    }

	    // Peek the top element of Stack 1
	    public int peek1() {
	        if (tos1 >= 0) {
	            return arr[tos1];
	        } else {
	            System.out.println("Stack 1 is empty!");
	            return -1;
	        }
	    }

	    // Peek the top element of Stack 2
	    public int peek2() {
	        if (tos2 < size) {
	            return arr[tos2];
	        } else {
	            System.out.println("Stack 2 is empty!");
	            return -1;
	        }
	    }

	    // Check if Stack 1 is empty
	    public boolean isEmpty1() {
	        return tos1 == -1;
	    }
	    
	    

	    // Check if Stack 2 is empty
	    public boolean isEmpty2() {
	        return tos2== size;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the capacity of the array: ");
	        int capacity = sc.nextInt();
	        TwoStacks ts = new TwoStacks(capacity);

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Push to Stack 1");
	            System.out.println("2. Pop from Stack 1");
	            System.out.println("3. Peek at Stack 1");
	            System.out.println("4. Check if Stack 1 is empty");
	            System.out.println("5. Push to Stack 2");
	            System.out.println("6. Pop from Stack 2");
	            System.out.println("7. Peek at Stack 2");
	            System.out.println("8. Check if Stack 2 is empty");
	            System.out.println("9. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter element to push to Stack 1: ");
	                    int element1 = sc.nextInt();
	                    ts.push1(element1);
	                    break;

	                case 2:
	                    int popped1 = ts.pop1();
	                    if (popped1 != -1) {
	                        System.out.println("Popped from Stack 1: " + popped1);
	                    }
	                    break;

	                case 3:
	                    int peeked1 = ts.peek1();
	                    if (peeked1 != -1) {
	                        System.out.println("Top of Stack 1: " + peeked1);
	                    }
	                    break;

	                case 4:
	                    if (ts.isEmpty1()) {
	                        System.out.println("Stack 1 is empty.");
	                    } else {
	                        System.out.println("Stack 1 is not empty.");
	                    }
	                    break;

	                case 5:
	                    System.out.print("Enter element to push to Stack 2: ");
	                    int element2 = sc.nextInt();
	                    ts.push2(element2);
	                    break;

	                case 6:
	                    int popped2 = ts.pop2();
	                    if (popped2 != -1) {
	                        System.out.println("Popped from Stack 2: " + popped2);
	                    }
	                    break;

	                case 7:
	                    int peeked2 = ts.peek2();
	                    if (peeked2 != -1) {
	                        System.out.println("Top of Stack 2: " + peeked2);
	                    }
	                    break;

	                case 8:
	                    if (ts.isEmpty2()) {
	                        System.out.println("Stack 2 is empty.");
	                    } else {
	                        System.out.println("Stack 2 is not empty.");
	                    }
	                    break;

	                case 9:
	                    System.out.println("Exiting...");
	                    sc.close();
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice! Please try again.");
	            }
	        }
	    }
	}


