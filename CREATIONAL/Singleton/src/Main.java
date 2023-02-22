public class Main {
    public static void main(String[] args) {
        EagerSingletonClass object= EagerSingletonClass.getInstance();
        object.travelling();
    }
}
//public class Main{
//    public static void main(String[] args){
//        LazySingletonClass object=LazySingletonClass.getInstance();
//        object.travelling();
//    }
//}