package xml;


public class CustomStack {
    public int[] data;

    int ptr = -1;


    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int value){
        if(isFull()){
            System.out.println("Stack is Full!!");
            return false;
        }
        data[++ptr] = value;
        return true;
    }

    public int pop() {
        if(isEmpty()){
           return -1;
        }
        return data[ptr--];
    }

    public int peak(){
        if(isEmpty()){
            return -1;
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length - 1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
}
