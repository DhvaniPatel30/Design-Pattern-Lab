public class Leaf implements Component{
    String name;
    String transport;
    public Leaf(String name,String transport){
        super();
        this.name=name;
        this.transport=transport;
    }
    public void showDetails(){
        System.out.println(name+" : "+transport);
    };

}
