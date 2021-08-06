package ds99.dataStructure.allLevel.stackAndQueue;

public class SQ2 {
    int[] queue;
    int size;
    int capacity;
    int front = -1, rear = -1;

    SQ2(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
    }

    boolean isFull() {
        return (front == 0 && rear == capacity - 1);
    }

    boolean isEmpty() {
        return (rear == -1);
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is already full");
        } else if (isEmpty()) {
            rear = front = 0;
            queue[rear] = data;
            size++;
            System.out.println(data + " is added in queue");
        } else {
            rear = rear + 1;
            queue[rear] = data;
            size++;
            System.out.println(data + " is added in queue");
        }

    }

    int dequeue() {
        int element;
        if (isEmpty()) {
            System.out.println("noting to deQueue because Queue is already empty");
            return -1;
        } else {
            element = queue[front];


            //if queue has only 1 element
            if (front >= rear) {
                front = 1;
                rear = -1;
            } else {
                front++;
            }
            size--;
        }
        System.out.println(element + " removed from Queue");
        return element;
    }

    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            // display the front of the queue
            System.out.println("\nFront index-> " + front);

            // display element of the queue
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(queue[i] + "  ");

            // display the rear of the queue
            System.out.println("\nRear index-> " + rear);
        }
    }

    public static void main(String[] args) {
        SQ2 Queue = new SQ2(5);
        Queue.enqueue(1);
        Queue.enqueue(2);
        Queue.enqueue(3);
        Queue.enqueue(4);
        System.out.println(Queue.size);
        Queue.enqueue(5);
        Queue.enqueue(6);
        Queue.dequeue();

        System.out.println(Queue.size);
        Queue.display();


    }

}
