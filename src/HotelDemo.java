import java.util.Arrays;
import java.util.Scanner;

public class HotelDemo {
    public static void main(String[] args) {
        //Skapa instanser av klassen Hotel
        Hotel h = new Hotel(); // h1 är referensvariable, skapar ett objekt
    h.setName();
    h.setFloors();
    h.setRooms();
    h.roomsTotal = h.floors * h.roomsPerFloor;
    int [] roomsNumbers = h.roomsArray();
    //h.total(roomsNumbers);
    Money.discount(Money.summa(h.total(roomsNumbers)),h.total(roomsNumbers));
    }
}
