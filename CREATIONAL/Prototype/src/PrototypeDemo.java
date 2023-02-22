import java.util.Scanner;

class Customer implements Cloneable {
    String place;
    String transport;
    String hotel;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getHotel() {
        return hotel;
    }

    
    public Customer(String place, String transport, String hotel) {
        this.place = place;
        this.transport = transport;
        this.hotel = hotel;
    }

    public void setHotel(String hotel) {

        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "place='" + place + '\'' +
                ", transport='" + transport + '\'' +
                ", hotel='" + hotel + '\'' +
                '}';
    }

    @Override
    public Customer clone() {

        return new Customer(place, transport, hotel);
    }
}

public class PrototypeDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter place:");
        String place1 = sc.nextLine();
        System.out.println("enter transport:");
        String transport1 = sc.nextLine();
        System.out.println("enter hotel:");
        String hotel1 = sc.nextLine();

        Customer c1 = new Customer(place1,transport1,hotel1);
        System.out.println("customer 1:\n"+c1);

        Customer c2 = c1.clone();


        c2.hotel = "High Provinces";
        System.out.println("customer 2:\n"+c2);

    }
}
