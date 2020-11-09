import java.util.Scanner;

public class HotelDemo {
    /**
     * Main metod som definierar i vilken ordning
     * metoderna anropas så att proggrammet fungerar som det ska.
     *
     */
    public static void main(String[] args) {
        while (true) {  //loop för att proggrammet upprepas
            Hotel h = new Hotel(); // ett ebjekt skapas, h är referensvariable.
            System.out.println(h); //skriver ut objekts egenskaper
            int[] roomsNumbers = h.roomsArray(); //skapa rumsnumeringplan
            int labels = h.totalLables(roomsNumbers);   //råknar total antal skyltar
            Money m = new Money(labels, h); //ett Money objekt skapas, m är referensvariable.
            Scanner input = new Scanner(System.in);
            System.out.println("Vill du räkna igen? tryck j om du vill fortsätta.");
            if (!input.nextLine().startsWith("j")){ //kolla up att användaren vill fortsätta
                System.out.println("Tack och Hej då!");
                break;
            }
        }
    }
}
