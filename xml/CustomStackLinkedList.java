package xml;


public class CustomStackLinkedList {
    private Node head = null;

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
            if(head == null){
                head = nn;
            }
            nn.next = head;
            head = nn;
        }

        public int pop()throws Exception{
            if(head == null){
                throw new Exception("Stack empty");
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
}

