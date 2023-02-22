public class Factory {
    public void Place getInstance(String str){
        if(str.equals("Delhi")){
            return new Delhi();
        }
        else if(str.equals("Mumbai")){
            return new Mumbai();
        }
    }
    public void Transport getInstance(String str){
        if(str.equals("Car")){
            return new Car();
        }
        else if(str.equals("Plane")){
            return new Plane();
        }
    }
}
