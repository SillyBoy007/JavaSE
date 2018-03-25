package model;

class LinkA{        //链表
    private class Node{ //定义节点类,只能被Link类使用
        private Object data;
        private LinkA.Node next;
        public Node(Object data) {
            this.data = data;
        }

        public void addNode(LinkA.Node newNode){
            if(this.next == null){
                this.next = newNode;
            }else{
                this.next.addNode(newNode);
            }
        }

        public boolean containsNode(Object str){
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

        public Object getNode(int num) {
            if(LinkA.this.index++ == num){  //内部类访问外部类的属性
                return this.data;
            }else{
                return this.next.getNode(num);
            }
        }

        public void setNode(int index,Object str){
            if (LinkA.this.index ++ == index){
                this.data = str;
            }else{
                this.next.setNode(index,str);
            }
        }
        public void removeNode(LinkA.Node previous, Object str){
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
    private LinkA.Node root; //根节点
    private int count = 0; //保存元素个数
    private int index = 0; //索引编号
    private Object[] retArray;

    public void add(Object data){
        if(data == null){
            return;
        }
        LinkA.Node newNode = new LinkA.Node(data);
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
    public boolean contains(Object str){
        if(str == null || this.root ==null){
            return false;
        }
        return this.root.containsNode(str);
    }
    public Object get(int num){
        if(num > this.count){
            return null; //没有数据
        }
        this.index = 0;
        return this.root.getNode(num);  //查询交给Node类
    }
    public void set(int index,Object str){
        if (index > count){
            return; //结束方法调用
        }
        this.index = 0; //重新设置index
        this.root.setNode(index,str);
    }
    public void remove (Object str){
        if (this.contains(str)){
            if(str.equals(this.root.data)){ //判断是否是根节点
                this.root = this.root.next;
            }else{
                this.root.next.removeNode(this.root,str);
            }
        }
        this.count -- ;
    }
    public Object[] toArray(){
        if (this.root == null){
            return null;
        }
        this.index = 0;
        this.retArray = new Object[this.count];
        this.root.toArrayNode();
        return this.retArray;
    }
}

interface Pet{ //定义宠物接口
    public String getName();
    public int getAge();
}

class PetShop {
    private LinkA pets = new LinkA(); //保存的宠物信息
    public void add(Pet pet){  //上架
        this.pets.add(pet);
    }
    public void delete(Pet pet){ //下架
        this.pets.remove(pet);
    }
    public LinkA search(String keyWord){  //模糊查询
        LinkA result = new LinkA();
        Object obj [] = this.pets.toArray(); //将集合变为对象数组的形式返回
        for (int x=0;x<obj.length;x++){
            Pet pet =(Pet) obj[x]; //向下转型
            if(pet.getName().contains(keyWord)){ //查询到了
                result.add(pet);
            }
        }
        return result;
    }
}

class Cat implements Pet{
    private String name;
    private int age;
    public Cat(String name,int age){
        this.name = name;
        this.age=age;
    }
    public String toString(){
        return "猫的名字:"+this.name+"\n"+"猫的年龄:"+this.age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        if(obj == null){
            return false;
        }
        if (!(obj instanceof  Cat)){
            return false;
        }
        Cat c = (Cat) obj;
        if (this.name.equals(c.name) && this.age == c.age){
            return true;
        }
        return false;
    }
}

class Dog implements Pet{
    private String name;
    private int age;
    public Dog(String name,int age){
        this.name = name;
        this.age=age;
    }
    public String toString(){
        return "狗的名字:"+this.name+"\n"+"狗的年龄:"+this.age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        if(obj == null){
            return false;
        }
        if (!(obj instanceof  Dog)){
            return false;
        }
        Dog c = (Dog) obj;
        if (this.name.equals(c.name) && this.age == c.age){
            return true;
        }
        return false;
    }
}

public class PetShopShow {
    public static void main(String args[]){
        PetShop shoop = new PetShop();
        shoop.add(new Cat("猫A",2));
        shoop.add(new Dog("狗A",3));
        shoop.add(new Dog("狗B",7));
        shoop.add(new Cat("猫B",3));
        shoop.add(new Dog("狗C",1));
        shoop.add(new Dog("狗D",4));

        shoop.delete(new Dog("狗B",7));
        LinkA all = shoop.search("狗");
        Object [] obj = all.toArray();
        for (int x = 0;x<obj.length;x++){
            System.out.println(obj[x]);
        }
    }
}
