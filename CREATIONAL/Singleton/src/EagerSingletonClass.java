import java.util.Scanner;
import java.util.*;
public class EagerSingletonClass {
    private static final EagerSingletonClass instance =new EagerSingletonClass();
    private EagerSingletonClass(){}
    public static EagerSingletonClass getInstance(){
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
