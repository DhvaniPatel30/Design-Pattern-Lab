public class CompositeTest {
    public static void main(String[] args) {

        Component Ahmedabad=new Leaf("Ahmedabad","Plane");
        Component Surat =new Leaf("Surat","Car");
        Component Mumbai=new Leaf("Mumbai","Car");
        Component Varanasi =new Leaf("Varanasi","Train");

        Composite Gujarat=new Composite("Gujarat");
        Composite Maharashtra=new Composite("Maharashtra");
        Composite UttarPradesh =new Composite("UttarPradesh");

        Gujarat.addComponent(Ahmedabad);
        Gujarat.addComponent(Surat);

        Maharashtra.addComponent(Surat);

        UttarPradesh.addComponent(Varanasi);
    }
}