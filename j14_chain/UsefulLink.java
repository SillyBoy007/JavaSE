package j14_chain;
//可用链表
class LinkA{
    private class Node{ //定义节点类,只能被Link类使用
<<<<<<< HEAD
        private Object data;
        private Node next;
        public Node(Object data){
=======
        private String data;
        private Node next;
        public Node(String data){
>>>>>>> 577521bd9d6d3f186b4bd5a7fb371f5b4b02bdb8
            this.data = data;
        }
        public void addNode(Node newNode){
            if(this.next == null){
                this.next = newNode;
            }else{
                this.next.addNode(newNode);
            }
        }
<<<<<<< HEAD
        public boolean containsNode(Object str){
=======
        public boolean containsNode(String str){
>>>>>>> 577521bd9d6d3f186b4bd5a7fb371f5b4b02bdb8
            if (str.equals(this.data)){
                return true;
            }else{
                if(this.next != null){
                    return this.next.containsNode(str);
                }else{
                    return false;
                }
            }
        }

<<<<<<< HEAD
        public Object getNode(int num) {
=======
        public String getNode(int num) {
>>>>>>> 577521bd9d6d3f186b4bd5a7fb371f5b4b02bdb8
            if(LinkA.this.index++ == num){  //内部类访问外部类的属性
                return this.data;
            }else{
                return this.next.getNode(num);
            }
        }

<<<<<<< HEAD
        public void setNode(int index,Object str){
=======
        public void setNode(int index,String str){
>>>>>>> 577521bd9d6d3f186b4bd5a7fb371f5b4b02bdb8
            if (LinkA.this.index ++ == index){
                this.data = str;
            }else{
                this.next.setNode(index,str);
            }
        }
<<<<<<< HEAD
        public void removeNode(Node previous,Object str){
=======
        public void removeNode(Node previous,String str){
>>>>>>> 577521bd9d6d3f186b4bd5a7fb371f5b4b02bdb8
            if (str.equals(this.data)){  //如果满足
                previous.next = this.next; //空出当前节点
            }else{
                this.next.removeNode(this,str);
            }
        }
        public void toArrayNode(){
            LinkA.this.retArray[LinkA.this.index ++]=this.data;
            if (this.next != null){
                this.next.toArrayNode();
            }
        }
    }

    //=================================================================================
<<<<<<< HEAD
    private Node root; //根节点
    private int count = 0; //保存元素个数
    private int index = 0; //索引编号
    private Object[] retArray;

    public void add(Object data){
=======


    private Node root; //根节点
    private int count = 0; //保存元素个数
    private int index = 0; //索引编号
    private String[] retArray;

    public void add(String data){
>>>>>>> 577521bd9d6d3f186b4bd5a7fb371f5b4b02bdb8
        if(data == null){
            return;
        }
        Node newNode = new Node(data);
        if(this.root == null){
            this.root = newNode;
        }else{
            this.root.addNode(newNode);
        }
        this.count++;
    }
    public int size(){
        return this.count;
    }
    public boolean isEmpty(){
       return this.count==0;
    }
<<<<<<< HEAD
    public boolean contains(Object str){
=======
    public boolean contains(String str){
>>>>>>> 577521bd9d6d3f186b4bd5a7fb371f5b4b02bdb8
        if(str == null || this.root ==null){
            return false;
        }
        return this.root.containsNode(str);
    }
<<<<<<< HEAD
    public Object get(int num){
=======
    public String get(int num){
>>>>>>> 577521bd9d6d3f186b4bd5a7fb371f5b4b02bdb8
        if(num > this.count){
            return null; //没有数据
        }
        this.index = 0;
        return this.root.getNode(num);  //查询交给Node类
    }
<<<<<<< HEAD
    public void set(int index,Object str){
=======
    public void set(int index,String str){
>>>>>>> 577521bd9d6d3f186b4bd5a7fb371f5b4b02bdb8
        if (index > count){
            return; //结束方法调用
        }
        this.index = 0; //重新设置index
        this.root.setNode(index,str);
    }
<<<<<<< HEAD
    public void remove (Object str){
=======
    public void remove (String str){
>>>>>>> 577521bd9d6d3f186b4bd5a7fb371f5b4b02bdb8
        if (this.contains(str)){
            if(str.equals(this.root.data)){ //判断是否是根节点
                this.root = this.root.next;
            }else{
                this.root.next.removeNode(this.root,str);
            }
        }
        this.count -- ;
    }
<<<<<<< HEAD
    public Object[] toArray(){
=======
    public String[] toArray(){
>>>>>>> 577521bd9d6d3f186b4bd5a7fb371f5b4b02bdb8
        if (this.root == null){
            return null;
        }
        this.index = 0;
<<<<<<< HEAD
        this.retArray = new Object[this.count];
=======
        this.retArray = new String[this.count];
>>>>>>> 577521bd9d6d3f186b4bd5a7fb371f5b4b02bdb8
        this.root.toArrayNode();
        return this.retArray;
    }

}
public class UsefulLink {
    public static void main(String args[]){
        LinkA la = new LinkA();
<<<<<<< HEAD
        la.add(2333);
        la.add("wang");
        la.add(new int[]{2,3,4,5,6});
        Object lb[] = la.toArray();
        for (int x=0;x<lb.length;x++){
            System.out.println(lb[x]);
        }
=======
        la.add("wang");
        la.add("xia");
        System.out.println(la.size());
        System.out.println(la.isEmpty());
        System.out.println(la.contains("xia"));
        System.out.println(la.get(0));
        la.set(1,"yun");
        System.out.println(la.get(1));
        la.remove("wang");
        System.out.println(la.size());
        la.add("hah");
        la.add("lal");
        System.out.println("====================================");
        String [] data = la.toArray();
        for (int x=0;x<data.length;x++){
            System.out.println(data[x]);
        }


>>>>>>> 577521bd9d6d3f186b4bd5a7fb371f5b4b02bdb8
    }
}
