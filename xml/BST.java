package xml;

public class BST {
    Node root;
    private static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
        }
    }

    public void insert(int data){
        root = insert(root , data);
    }

    private Node insert(Node root , int data){
        if(root == null){
            return new Node(data);
        }

        if(data < root.data) root.left = insert(root.left, data);
        else root.right = insert(root.right,data);

        return root;
    }

    public void inOrder(){
        inOrder(root);
        System.out.println();
    }
    private void inOrder(Node node){
        if(node == null) return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
        System.out.println();
    }
    private void postOrder(Node node){
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void preOrder(){
        preOrder(root);
        System.out.println();
    }
    private void preOrder(Node node){
        if(node == null) return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void delete(int data){
        root = delete(root , data);
    }

    private Node delete(Node node , int data){
        if(node == null) return null;
        if(data < node.data){
            node.left =delete(node.left, data);
        }else if(data > node.data){
            node.right = delete(node.right,data);
        }else{
            if(node.left == null && node.right == null) {
                return null;
            }
            if(node.left == null) return node.right;
            if(node.right == null) return node.left;

            Node minNode = findMin(node.right);
            node.data = minNode.data;
            node.right = delete(node.right,minNode.data);
        }
        return node;
    }

    private Node findMin(Node node){
        Node current = node;
        while(current.left != null){
            current = current.left;
        }
        return current;
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(50);
        bst.insert(30);
        bst.insert(60);
        bst.insert(15);
        bst.insert(35);
        bst.insert(52);
        bst.insert(70);
        bst.insert(51);
        bst.insert(62);
        bst.insert(72);
        bst.inOrder();

        bst.delete(70);
        bst.inOrder();
    }

}
