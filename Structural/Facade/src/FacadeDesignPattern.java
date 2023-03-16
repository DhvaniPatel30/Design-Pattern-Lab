public class FacadeDesignPattern {
    public static void main(String args[]){
        PlaceMaker placeMaker= new PlaceMaker();

        placeMaker.placeGujarat();
        placeMaker.placeMumbai();
        placeMaker.placeVaranasi();
    }
}
