

public class PlaceMaker {
    private Place Gujarat;
    private Place Mumbai;
    private Place Varanasi;
    public PlaceMaker(){
        Gujarat=new Gujarat();
        Mumbai=new Mumbai();
        Varanasi=new Varanasi();
    }
    public void placeGujarat(){
        Gujarat.destination();
    }
    public void placeMumbai(){
        Mumbai.destination();
    }
    public void placeVaranasi(){
        Varanasi.destination();
    }
}
