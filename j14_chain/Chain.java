
class SingleLink {
    private Node root; //根节点

    public void add(String data) { //添加数据
        Node newNode = new Node(data);
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }

    }

    public void print() {
        if (this.root != null) {
            this.root.printNode();
        }
    }
}

public class Chain {
    public static void main(String args[]) {
        SingleLink l1 = new SingleLink();
        l1.add("wang");
        l1.add("xia");
        l1.add("yun");
        l1.print();
    }
}
