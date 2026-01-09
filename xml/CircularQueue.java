package xml;

public class CircularQueue {
    int front = -1;
    int rear = -1;


    int[] arr;

    CircularQueue(int size){
        arr = new int[size];
    }

    public void insert(int data){
        if(isFull()){
            return;
        }
        if(front == -1) front = 0;
        rear = (rear+1) % arr.length;
        arr[rear] = data;

    }

    public int remove(){
        if(isEmpty()){
            return -1;
        }

        int removed = arr[front];
        if(front == rear){
            front = -1;
            rear = -1;
        }else{
            front = (front+1) % arr.length;
        }

        return removed;
    }

    public void print() {
        if (isEmpty()) return;

        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % arr.length;
        }
        System.out.println();
    }



    public boolean isFull(){
        return (rear + 1) % arr.length == front;
    }

    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.insert(5);
        cq.insert(3);
        cq.print();
    }

}
