package j29_enum;

class Color{
    private String title;
    private static final Color RED = new Color("红色");
    private static final Color YELLOW = new Color("黄色");
    private static final Color BLUE = new Color("蓝色");
    private Color(String title){
        this.title = title;
    }
    public static Color getInstance(int ch){
        switch (ch){
            case 1:
                return RED;
            case 2:
                return YELLOW;
            case 3:
                return BLUE;
                default:
                    return null;
        }

    }
    @Override
    public String toString() {
        return this.title;
    }
}
public class TypeOne {
    public static void main(String args[]){
        Color red = Color.getInstance(1);
        System.out.println(red);
    }
}
