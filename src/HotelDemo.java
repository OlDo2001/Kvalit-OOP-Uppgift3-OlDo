import java.util.Arrays;
import java.util.Scanner;

public class HotelDemo {
    public static void main(String[] args) {
        //Skapa instanser av klassen Hotel
        Hotel h = new Hotel(); // h1 är referensvariable, skapar ett objekt
    Hotel.getName(h);
    Hotel.getFloors(h);
    Hotel.getRooms(h);
    h.roomsTotal = h.floors * h.roomsPerFloor;
    int [] roomsNumbers = Hotel.roomsArray(h);
    Hotel.lableArray(roomsNumbers, h);
    }
}
