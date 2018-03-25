package j38_than;

import java.util.Arrays;

//二叉树实现 中序
class BinaryTree{
    private class Node{
        private  Comparable data; //排序的依据
        private Node left;
        private Node right;

        @SuppressWarnings("unused")
        public Node(Comparable data){
            this.data = data;
        }

        public void addNode(Node newNode){
            if (this.data.compareTo(newNode.data)>0){
                if (this.left == null){
                    this.left = newNode;
                }else {
                    this.left.addNode(newNode);
                }
            }else {
                if (this.right == null){
                    this.right = newNode;
                }else {
                    this.right.addNode(newNode);
                }
            }
        }
        public void toArrayNode(){
            if (this.left != null){ //有左节点
                this.left.toArrayNode();
            }
            BinaryTree.this.retData[BinaryTree.this.index++] = this.data;
            if (this.right != null){
                this.right.toArrayNode(); //有右节点
            }
        }
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    private Node root;//根节点
    private int count; //计数
    private Object[] retData;
    private int index;

    public void add(Object obj){
        Comparable com = (Comparable) obj; //必须变为Comparable才能实现
        Node newNode = new Node(com); //添加新的节点
        if (this.root == null){ //根节点不存在
            this.root = newNode;
        }else {
            this.root.addNode(newNode);
        }
        this.count++;
    }


    public Object [] toArray(){
        if (this.root == null){
            return null;
        }
        this.index = 0;
        this.retData = new Object[this.count];
        this.root.toArrayNode();

        return  this.retData;
    }
}
public class TypeC{
    public static void main(String [] args){
        BinaryTree bt = new BinaryTree();
        bt.add(new Book("java",53.00));
        bt.add(new Book("jsp",33.00));
        bt.add(new Book("python",23.00));
        bt.add(new Book("php",43.00));

        Object[] obj = bt.toArray();
        System.out.println(Arrays.toString(obj));
    }
}
