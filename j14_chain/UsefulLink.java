
//可用链表
class LinkA {
    private class Node { //定义节点类,只能被Link类使用
        private Object data;
        private Node next;

        public Node(Object data) {

            this.data = data;
        }

        public void addNode(Node newNode) {
            if (this.next == null) {
                this.next = newNode;
            } else {
                this.next.addNode(newNode);
            }
        }

        public boolean containsNode(Object str) {


            if (str.equals(this.data)) {
                return true;
            } else {
                if (this.next != null) {
                    return this.next.containsNode(str);
                } else {
                    return false;
                }
            }
        }


        public Object getNode(int num) {

            if (LinkA.this.index++ == num) {  //内部类访问外部类的属性
                return this.data;
            } else {
                return this.next.getNode(num);
            }
        }

        public void setNode(int index, Object str) {

            if (LinkA.this.index++ == index) {
                this.data = str;
            } else {
                this.next.setNode(index, str);
            }
        }

        public void removeNode(Node previous, Object str) {

            if (str.equals(this.data)) {  //如果满足
                previous.next = this.next; //空出当前节点
            } else {
                this.next.removeNode(this, str);
            }
        }

        public void toArrayNode() {
            LinkA.this.retArray[LinkA.this.index++] = this.data;
            if (this.next != null) {
                this.next.toArrayNode();
            }
        }
    }

    //=================================================================================

    private Node root; //根节点
    private int count = 0; //保存元素个数
    private int index = 0; //索引编号
    private Object[] retArray;

    public void add(Object data) {


        if (data == null) {
            return;
        }
        Node newNode = new Node(data);
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }
        this.count++;
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public boolean contains(Object str) {

        if (str == null || this.root == null) {
            return false;
        }
        return this.root.containsNode(str);
    }

    public Object get(int num) {

        if (num > this.count) {
            return null; //没有数据
        }
        this.index = 0;
        return this.root.getNode(num);  //查询交给Node类
    }

    public void set(int index, Object str) {

        if (index > count) {
            return; //结束方法调用
        }
        this.index = 0; //重新设置index
        this.root.setNode(index, str);
    }

    public void remove(Object str) {

        if (this.contains(str)) {
            if (str.equals(this.root.data)) { //判断是否是根节点
                this.root = this.root.next;
            } else {
                this.root.next.removeNode(this.root, str);
            }
        }
        this.count--;
    }


    public Object[] toArray() {

        if (this.root == null) {
            return null;
        }
        this.index = 0;

        this.retArray = new Object[this.count];

        this.root.toArrayNode();
        return this.retArray;
    }

}

public class UsefulLink {
    public static void main(String args[]) {
        LinkA la = new LinkA();

        la.add(2333);
        la.add("wang");
        la.add(new int[]{2, 3, 4, 5, 6});
        Object lb[] = la.toArray();
        for (int x = 0; x < lb.length; x++) {
            System.out.println(lb[x]);
        }

        la.add("wang");
        la.add("xia");
        System.out.println(la.size());
        System.out.println(la.isEmpty());
        System.out.println(la.contains("xia"));
        System.out.println(la.get(0));
        la.set(1, "yun");
        System.out.println(la.get(1));
        la.remove("wang");
        System.out.println(la.size());
        la.add("hah");
        la.add("lal");
        System.out.println("====================================");
        Object[] data = la.toArray();
        for (int x = 0; x < data.length; x++) {
            System.out.println(data[x]);
        }

    }
}