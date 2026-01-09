package xml;


public class CustomStackLinkedList {
     Node head = null;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


        public void push(int value){
            Node nn = new Node(value);

            nn.next = head;
            head = nn;
        }

        public int pop(){
            if(head == null){
                return -1;
            }
            int removed = head.data;
            head = head.next;
            return removed;
        }

        public void print(){
            if(head == null) return;
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }

    public static void main(String[] args) {
        CustomStackLinkedList stack = new CustomStackLinkedList();
        stack.push(10);
        stack.push(20);
        stack.pop();
        stack.print();
    }
}

