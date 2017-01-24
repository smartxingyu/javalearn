package Showproperties;

/**
 * Created by xingyu on 2017/1/24.
 */
/** A class comment*/
public class ShowProperies {
    /** A unit*/
    public int i ;
    /** A function*/
    public void f(){}

    public static void main(String[] args){
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(
                System.getProperty("java.library.path")
        );
    }
}///:~
