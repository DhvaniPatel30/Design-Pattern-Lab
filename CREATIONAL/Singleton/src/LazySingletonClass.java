import java.util.Scanner;
public class LazySingletonClass {
    private static LazySingletonClass instance;
    private LazySingletonClass(){}
    public static LazySingletonClass getInstance(){
        if (instance==null){
            instance=new LazySingletonClass();
        }
        return instance;
    }
    public void travelling(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Place:");
        String p1= sc.nextLine();
        System.out.println("Enter Transport:");
        String t1= sc.nextLine();
        System.out.println("Enter Hotel:");
        String h1= sc.nextLine();
        System.out.println("Place: "+ p1 + " Transport: "+t1+" Hotel:"+ h1);
    }
}
