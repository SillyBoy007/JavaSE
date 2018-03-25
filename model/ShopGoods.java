package model;
//3级一对多
class Item{     //父栏目
    private int iid;
    private String name;
    private String desc;
    private ChdItem[] chdItems;
    private Product[] products;

    public Item(){}
    public Item(int iid,String name,String desc){
        this.iid = iid;
        this.name = name;
        this.desc = desc;
    }

    public void setChdItems(ChdItem[] chdItems){
        this.chdItems = chdItems;
    }
    public ChdItem[] getChdItems(){
        return this.chdItems;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return this.products;
    }

    public String getInfo() {
        return "父栏目id:" +this.iid+"\n"+
                "父栏目名称:" +this.name+"\n"+
                "父栏目描述:"+this.desc+"\n"+"==================================================";
    }

}
class ChdItem{  //子栏目
    private int sid;
    private String name;
    private String desc;
    private Item item;
    private Product[] products;

    public ChdItem(){}
    public ChdItem(int sid,String name,String desc){
        this.sid = sid;
        this.name = name;
        this.desc = desc;
    }

    public void setItem(Item item){
        this.item = item;
    }
    public Item getItem(){
        return this.item;
    }
    public void setProducts(Product[] products){
        this.products = products;
    }
    public Product[] getProducts(){
        return this.products;
    }

    public String getInfo() {
        return "子栏目id:" +this.sid+"\n"+
                "子栏目名称:" +this.name+"\n"+
                "子栏目描述:"+this.desc+"\n"+"==================================================";
    }
}
class Product{  //商品
    private int pid;
    private String pname;
    private double price;
    private Item item;
    private ChdItem chdItem;

    public Product(){}
    public Product(int pid,String pname,double price){
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }
    public void setItem(Item item){
        this.item = item;
    }
    public Item getItem(){
        return this.item;
    }
    public void setChdItem(ChdItem chdItem){
        this.chdItem = chdItem;
    }
    public ChdItem getChdItem(){
        return this.chdItem;
    }
    public String getInfo() {
        return "商品id:" +this.pid+"\n"+
                "商品名称:" +this.pname+"\n"+
                "商品价格:"+this.price+"\n"+"==================================================";
    }

}
public class ShopGoods {
    public static void main(String args[]){
        Item item = new Item(101,"书籍","书籍类栏目");
        ChdItem citemA = new ChdItem(1001,"小说","小说类书籍");
        ChdItem citemB = new ChdItem(1001,"历史","历史类书籍");
        ChdItem citemC = new ChdItem(1001,"科幻","科幻类书籍");
        ChdItem citemD = new ChdItem(1001,"人文","人文类书籍");
        Product productA = new Product(10001,"三国演义",33.00);
        Product productB = new Product(10002,"红楼梦",35.00);
        Product productC = new Product(10003,"水浒传",22.00);
        Product productD = new Product(10004,"西游记",29.00);
        Product productE = new Product(10005,"易中天品三国",45.00);
        Product productF = new Product(10005,"三体",55.00);
        Product productG = new Product(10005,"大唐列传",15.00);
        Product productH = new Product(10005,"舌尖上的中国",65.00);


        item.setChdItems(new ChdItem[]{citemA,citemB,citemC,citemD});
        citemA.setItem(item);
        citemB.setItem(item);
        citemC.setItem(item);
        citemD.setItem(item);
        citemA.setProducts(new Product[]{productA,productB,productC,productD});

        productA.setChdItem(citemA);
        productB.setChdItem(citemA);
        productC.setChdItem(citemA);
        productD.setChdItem(citemA);

        for (int x=0;x<citemA.getProducts().length;x++){
            System.out.println(citemA.getProducts()[x].getInfo());
        }

    }
}
