package xml;

public class SimpleQueue {
     int[] data;

    int end = 0;

    public SimpleQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int value){
        if(isFull()){
            System.out.println("Queue is Full!!");
            return false;
        }
        data[end++] = value;
        return true;
    }

    public int remove() {
        if(isEmpty()){
            System.out.println("Queue is Empty!!");
            return -1;
        }
        int removedItem = data[0];
        for(int i = 0 ; i < end -1; i++){
            data[i] = data[i+1];
        }
        end--;
        return removedItem;
    }

    public int front() {
        if(isEmpty()){
            System.out.println("Queue is Empty!!");
            return -1;
        }
        return data[0];
    }

    public void display(){
        for(int i = 0 ; i < end; i++){
            System.out.print(data[i] + " <-");
        }
        System.out.println("End");
    }

    public boolean isFull(){
        return end == data.length ;
    }
    public boolean isEmpty(){
        return end == 0;
    }

    public static void main(String[] args) {
        SimpleQueue queue = new SimpleQueue(5);
        queue.insert(10);
        queue.insert(20);
        queue.remove();
        queue.display();
    }
}
