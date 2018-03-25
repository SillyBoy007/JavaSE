package model;
<<<<<<< HEAD
//æƒé™å…³ç³»ç»„ æ•°æ®è¡¨å¤šå¯¹å¤šå…³ç³»æ˜ å°„
class Admin{    //ç®¡ç†è´¦å·
=======
//È¨ÏÞ¹ØÏµ×é Êý¾Ý±í¶à¶Ô¶à¹ØÏµÓ³Éä
class Admin{    //¹ÜÀíÕËºÅ
>>>>>>> 577521bd9d6d3f186b4bd5a7fb371f5b4b02bdb8
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
<<<<<<< HEAD
        return "äººå‘˜ç¼–å·:"+this.rid+"   "+"å§“å:"+this.title;
=======
        return "ÈËÔ±±àºÅ:"+this.rid+"   "+"ÐÕÃû:"+this.title;
>>>>>>> 577521bd9d6d3f186b4bd5a7fb371f5b4b02bdb8
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
<<<<<<< HEAD
        return "ç»„ç¼–å·:"+this.gid+"    "+"ç»„å:"+this.title;
=======
        return "×é±àºÅ:"+this.gid+"    "+"×éÃû:"+this.title;
>>>>>>> 577521bd9d6d3f186b4bd5a7fb371f5b4b02bdb8
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
<<<<<<< HEAD
        return "æƒé™ç¼–å·:"+this.acid+"  "+"æƒé™åç§°:"+this.title+"  "+"url"+this.url;
=======
        return "È¨ÏÞ±àºÅ:"+this.acid+"  "+"È¨ÏÞÃû³Æ:"+this.title+"  "+"url"+this.url;
>>>>>>> 577521bd9d6d3f186b4bd5a7fb371f5b4b02bdb8
    }
}
public class Authority {
    public static void main(String args[]){
        Admin a1 = new Admin("admin","123456");
        Admin a2 = new Admin("mldn","234567");
        Admin a3 = new Admin("add","456789");
<<<<<<< HEAD
        Role  r1 = new Role(1,"ç³»ç»Ÿç®¡ç†å‘˜");
        Role  r2 = new Role(2,"ä¿¡æ¯ç®¡ç†å‘˜");
        Group g1 = new Group(10,"ä¿¡æ¯ç®¡ç†");
        Group g2 = new Group(11,"ç”¨æˆ·ç®¡ç†");
        Group g3 = new Group(12,"æ•°æ®ç®¡ç†");
        Group g4 = new Group(13,"æŽ¥å£ç®¡ç†");
        Group g5 = new Group(14,"å¤‡ä»½ç®¡ç†");
        Action ac1 = new Action(101,"æ–°é—»å‘å¸ƒ","-");
        Action ac2 = new Action(102,"æ–°é—»åˆ—è¡¨","-");
        Action ac3 = new Action(103,"æ–°é—»å®¡æ ¸","-");
        Action ac4 = new Action(104,"å¢žåŠ ç”¨æˆ·","-");
=======
        Role r1 = new Role(1,"ÏµÍ³¹ÜÀíÔ±");
        Role r2 = new Role(2,"ÐÅÏ¢¹ÜÀíÔ±");
        Group g1 = new Group(10,"ÐÅÏ¢¹ÜÀí");
        Group g2 = new Group(11,"ÓÃ»§¹ÜÀí");
        Group g3 = new Group(12,"Êý¾Ý¹ÜÀí");
        Group g4 = new Group(13,"½Ó¿Ú¹ÜÀí");
        Group g5 = new Group(14,"±¸·Ý¹ÜÀí");
        Action ac1 = new Action(101,"ÐÂÎÅ·¢²¼","-");
        Action ac2 = new Action(102,"ÐÂÎÅÁÐ±í","-");
        Action ac3 = new Action(103,"ÐÂÎÅÉóºË","-");
        Action ac4 = new Action(104,"Ôö¼ÓÓÃ»§","-");
>>>>>>> 577521bd9d6d3f186b4bd5a7fb371f5b4b02bdb8

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
