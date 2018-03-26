package model;

//权限关系组 数据表多对多关系映射
class Admin{    //管理账号
    private String aid;
    private String password;
    private Role role;

    public Admin(String aid,String password){
        this.aid = aid;
        this.password = password;
    }
    public void setRole(Role role){
        this.role = role;
    }
    public Role getRole(){
        return this.role;
    }
}
class Role{
    private int rid;
    private String title;
    private Admin[] admins;
    private Group[] groups;


    public Role(int rid,String title){
        this.rid = rid;
        this.title = title;
    }

    public void setAdmins(Admin[] admins){
        this.admins = admins;
    }
    public Admin[] getAdmins(){
        return this.admins;
    }
    public void setGroups(Group[] groups){
        this.groups = groups;
    }
    public Group[] getGroups(){
        return this.groups;
    }
    public String getInfo(){

        return "人员编号:"+this.rid+"   "+"姓名:"+this.title;

    }

}
class Group{
    private int gid;
    private String title;
    private Role[] roles;
    private Action[] actions;

    public Group(int gid,String title){
        this.gid = gid;
        this.title = title;
    }
    public void setRoles(Role[] roles){
        this.roles = roles;
    }
    public Role[] getRoles(){
        return this.roles;
    }
    public void setActions(Action[] actions){
        this.actions = actions;
    }
    public Action[] getActions(){
        return this.actions;
    }
    public String getInfo(){

        return "组编号:"+this.gid+"    "+"组名:"+this.title;
    }
}
class Action{
    private int acid;
    private String title;
    private String url;
    private Group group;

    public Action(int acid,String title,String url){
        this.acid = acid;
        this.title = title;
        this.url = url;
    }
    public void setGroup(Group group){
        this.group = group;
    }
    public Group getGroup(){
        return this.group;
    }
    public String getInfo(){

        return "权限编号:"+this.acid+"  "+"权限名称:"+this.title+"  "+"url"+this.url;

    }
}
public class Authority {
    public static void main(String args[]){
        Admin a1 = new Admin("admin","123456");
        Admin a2 = new Admin("mldn","234567");
        Admin a3 = new Admin("add","456789");
        Role  r1 = new Role(1,"系统管理员");
        Role  r2 = new Role(2,"信息管理员");
        Group g1 = new Group(10,"信息管理");
        Group g2 = new Group(11,"用户管理");
        Group g3 = new Group(12,"数据管理");
        Group g4 = new Group(13,"接口管理");
        Group g5 = new Group(14,"备份管理");
        Action ac1 = new Action(101,"新闻发布","-");
        Action ac2 = new Action(102,"新闻列表","-");
        Action ac3 = new Action(103,"新闻审核","-");
        Action ac4 = new Action(104,"增加用户","-");



        g1.setRoles(new Role[]{r1,r2});
        r1.setGroups(new Group[]{g1,g2,g3});
        g1.setActions(new Action[]{ac1,ac2,ac3});
        g2.setActions(new Action[]{ac4});
        g3.setActions(new Action[]{ac1,ac2,ac3,ac4});
        System.out.println(r1.getInfo());
        for (int x=0;x<r1.getGroups().length;x++){
            System.out.println("\t"+"|-"+r1.getGroups()[x].getInfo());
            for (int y=0;y<r1.getGroups()[x].getActions().length;y++){
                System.out.println("\t\t"+"|-"+r1.getGroups()[x].getActions()[y].getInfo());
            }
        }
    }
}
