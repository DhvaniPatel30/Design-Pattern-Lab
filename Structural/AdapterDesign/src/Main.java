public class Main {
    public static void main(String[] args) {
        Place p1=new PlaceAdapter();
        travelling t=new travelling();
        t.setP(p1);
        t.destination("Chosen location is Delhi");
    }
}