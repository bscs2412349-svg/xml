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

    public void display(){
        if(isEmpty()){
            return;
        }
        for(int i = 0; i <= ptr; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public boolean isFull(){
        return ptr == data.length - 1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        stack.push(10);
        stack.push(20);
        stack.pop();
        stack.display();
    }
}
