package model;
//简单java类,数据表一对多关系映射
class Province{
    private int pnum;
    private String pname;
    private City[] citys;

    public Province(){}
    public Province(int pnum,String pname){
        this.pnum = pnum;
        this.pname = pname;
    }

    public void setCitys(City[] citys){
        this.citys = citys;
    }
    public City[] getCitys(){
        return this.citys;
    }
    public String getInfo() {
        return "省份编号:"+this.pnum+"\n"+"省份名称:"+this.pname+"\n"+"======================================";
    }
}
class City{
    private int cnum;
    private String cname;
    private Province province;

    public City(){}
    public City(int cnum, String cname){
        this.cnum = cnum;
        this.cname = cname;
    }

    public void setProvince(Province province){
        this.province = province;
    }
    public Province getProvince() {
        return this.province;
    }

    public String getInfo() {
        return "城市编号:"+this.cnum+"\n"+"城市名称:"+this.cname+"\n"+"======================================";
    }
}
public class ProCity {
    public static void main (String args[]){
        Province p = new Province(1001,"zhejiang");
        City ca = new City(10001,"quzhou");
        City cb = new City(10002,"ningbo");
        City cc = new City(10003,"hangzhou");

        p.setCitys(new City[]{ca,cb,cc});
        ca.setProvince(p);
        cb.setProvince(p);
        cc.setProvince(p);

        System.out.println(ca.getProvince().getInfo());
        for (int x = 0;x < p.getCitys().length;x++){
            System.out.println(p.getCitys()[x].getInfo());
        }
    }
}
