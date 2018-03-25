package j14_chain;

//递归实现链表

public class LinkB {
    public static void main(String args[]){
        Node root = new Node("火车头");
        Node n1 = new Node("车厢a");
        Node n2 = new Node("车厢b");

        Node currentNode = root;
        root.setNext(n1);
        n1.setNext(n2);

        print(root);

    }
    public static void print(Node current){
        if (current == null){
            return;
        }
        System.out.println(current.getData());
        print(current.getNext());  //递归
    }
}
