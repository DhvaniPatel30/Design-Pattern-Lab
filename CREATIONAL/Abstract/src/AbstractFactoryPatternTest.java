package travelling.java;

interface Place{
    void destination();
}
 interface Transport{
    void vehicle();
}

interface Hotel{
    void family();
}

class Mumbai implements Place{
    public void destination(){
        System.out.println("Mumbai is chosen as destination.");

    }
}

class Delhi implements Place{
    public void destination(){
        System.out.println("Delhi is chosen as destination.");

    }
}

class Gujarat implements Place{
    public void destination(){
        System.out.println("Gujarat is chosen as destination.");    }
}

class Bangalore implements Place{
    public void destination(){
        System.out.println("Bangalore is chosen as destination.");
    }
}

class Pune implements Place{
    public void destination(){
        System.out.println("Pune is chosen as destination.");
    }
}

class Car implements Transport{
    public void vehicle(){
        System.out.println("Car is chosen as transport.");
    }
}

 class Train implements Transport{
     public void vehicle(){
        System.out.println("Train is chosen as transport.");
    }
}

class Aeroplane implements Transport{
    public void vehicle(){
        System.out.println("Aeroplane is chosen as transport.");
    }
}
class Individual implements Hotel{
    public void family(){
        System.out.println("Individual ");
    }
}

class Couple implements Hotel{
    public void family(){
        System.out.println("Couple ");
    }
}

class Nuclear_family implements Hotel{
    public void family(){
        System.out.println("Nuclear family");
    }
}

class Joint_family implements Hotel{
    public void family(){
        System.out.println("Joint family");
    }
}

abstract class AbstractFactory{
    abstract Place getPlace(String place);
    abstract Transport getTransport(String transport);
    abstract Hotel getHotel(String hotel);
}
 class PlaceFactory extends AbstractFactory{
    public Place getPlace(String placeType){
        if(placeType==null){
            return null;
        }
        if(placeType.equalsIgnoreCase("Mumbai")){
            return new Mumbai();
        }
        else if(placeType.equalsIgnoreCase("Delhi")){
            return new Delhi();
        }
        else if(placeType.equalsIgnoreCase("Gujarat")){
            return new Gujarat();
        }
        else if(placeType.equalsIgnoreCase("Bangalore")){
            return new Bangalore();
        }
        else if(placeType.equalsIgnoreCase("Pune")){
            return new Pune();
        }
        return null;
    }

     @Override
     Transport getTransport(String transport) {
         return null;
     }

     @Override
     Hotel getHotel(String hotel) {
         return null;
     }
 }
 class TransportFactory extends AbstractFactory{

     public Transport getTransport(String transportType){
        if(transportType==null){
            return null;
        }
        if(transportType.equalsIgnoreCase("Car")){
            return new Car();
        }
        else if(transportType.equalsIgnoreCase("Train")){
            return new Train();
        }
        else if(transportType.equalsIgnoreCase("Aeroplane")){
            return new Aeroplane();
        }
        return null;
    }

     @Override
     Place getPlace(String place) {
         return null;
     }

     @Override
     Hotel getHotel(String hotel) {
         return null;
     }
 }

 class HotelFactory extends AbstractFactory{
     public Hotel getHotel(String hotelType){
        if(hotelType==null){
            return null;
        }
        if(hotelType.equalsIgnoreCase("Individual")){
            return new Individual();
        }
        else if(hotelType.equalsIgnoreCase("Couple")){
            return new Couple();
        }
        else if(hotelType.equalsIgnoreCase("Nuclear_family")){
            return new Nuclear_family();
        }
        else if(hotelType.equalsIgnoreCase("Joint_family")){
            return new Joint_family();
        }
        return null;
    }

     @Override
     Place getPlace(String place) {
         return null;
     }

     @Override
     Transport getTransport(String transport) {
         return null;
     }
 }

class FactoryProducer{
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("place") ){
            return new PlaceFactory();
        }
        else if(choice.equalsIgnoreCase("Transport")){
            return new TransportFactory();        }

        else if(choice.equalsIgnoreCase("Hotel")){
            return new HotelFactory();
        }
        return null;
    }
}

public class AbstractFactoryPatternTest{
    public static void main(String[] args){
        AbstractFactory placeFactory= FactoryProducer.getFactory("Place");
        Place place1=placeFactory.getPlace("Mumbai");
        Place place2= placeFactory.getPlace("Gujarat");
        place1.destination();
        place2.destination();

        AbstractFactory transportFactory= FactoryProducer.getFactory("Transport");
        Transport t1= transportFactory.getTransport("Car");
        Transport t2= transportFactory.getTransport("Aeroplane");
        t1.vehicle();
        t2.vehicle();

        AbstractFactory hotelFactory= FactoryProducer.getFactory("Hotel");
        Hotel h1= hotelFactory.getHotel("Couple");
        Hotel h2= hotelFactory.getHotel("Nuclear_family");
        h1.family();
        h2.family();

    }
}