package j14_chain;
//循环实现单链表
class Node{
    private String data;//要保存的数据
    private Node next; //要保持的下一节点
    public Node(String data){
        this.data = data;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node getNext(){
        return this.next;
    }
    public String getData(){
        return this.data;
    }
    public void addNode(Node newNode){
        if (this.next == null){
            this.setNext(newNode);
        }else{
            this.next.addNode(newNode);
        }
    }

    public void printNode() {
        System.out.println(this.data);
        if (this.next != null){
            this.next.printNode();
        }
    }
}
public class Link
{
    public static void main(String args[]){
        Node root = new Node("火车头");
        Node n1 = new Node("车厢a");
        Node n2 = new Node("车厢b");

        Node currentNode = root;
        root.setNext(n1);
        n1.setNext(n2);


        while (currentNode != null){
            System.out.println(currentNode.getData()+" ");
            //将下一个节点设置为当前节点
            currentNode = currentNode.getNext();
        }
    }

}
