
public class HotelDemo {
    public static void main(String[] args) {

        Hotel h = new Hotel(); // h är referensvariable, skapar ett objekt
        System.out.println(h); //skriver ut objekts egenskaper
        int [] roomsNumbers = h.roomsArray(); //skapa rumsnumeringplan
        int labels = h.totalLables(roomsNumbers);   //råknar total antal skyltar
        double summa = Money.summa(labels); //råknar pris före rabbat
        Money.discount(summa,labels); // räknar pris efter rabbat om det är relevant
    }
}
