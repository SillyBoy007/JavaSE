package j30_Annocation;

class BookB<T>{
    private T title;
    public void setTitle(T title){
        this.title = title;
    }

}
//压制警告
public class TypeThree {
    @SuppressWarnings({"rawtypes","unchecked"})  //压制警告
    public static void main(String args[]){
        BookB book = new BookB();
        book.setTitle("wang");
    }
}
