package j52_stream;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

//MapReduce使用
class ShopCar{
    private String pname;
    private double price; //商品单价
    private int amount; //商品数量

    public ShopCar(){}
    public ShopCar(String pname, double price, int amount) {
        this.pname = pname;
        this.price = price;
        this.amount = amount;
    }


    public String getPname() {
        return pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
public class MapReduceDemo {
    public static void main(String[] args) {
        List<ShopCar> all = new ArrayList<>();
        all.add(new ShopCar("book",23.00,1));
        all.add(new ShopCar("food",12.00,13));
        all.add(new ShopCar("cap",32.00,1));
        all.add(new ShopCar("phone",3232.00,2));

      //  double s = all.stream().map((x)->x.getAmount() * x.getPrice()).reduce((sum,m)->sum+m).get();
      //  System.out.println("花费总金额:"+s);
        DoubleSummaryStatistics dss =  all.stream().mapToDouble((sc)->sc.getPrice() * sc.getAmount()).summaryStatistics();
        System.out.println("商品个数:"+dss.getCount());
        System.out.println("平均花费:"+dss.getAverage());
        System.out.println("最高花费:"+dss.getMax());
        System.out.println("最低花费:"+dss.getMin());
        System.out.println("总花费:"+dss.getSum());
        System.out.println("总花费");

    }
}
