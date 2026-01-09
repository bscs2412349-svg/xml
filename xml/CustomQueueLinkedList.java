package xml;


public class CustomQueueLinkedList {
    Node front = null;
    Node rear = null;

    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    public void enqueue(int data){
        Node nn = new Node(data);
        if(front == null){
            front = nn;
            rear = nn;
        }else {
            rear.next = nn;
            rear = nn;
        }
    }


    public int dequeue(){
        if(front == null){
            System.out.println("Empty Queue");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return value;
    }

    public void print(){
        if(front == null) return;
        Node temp = front;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
