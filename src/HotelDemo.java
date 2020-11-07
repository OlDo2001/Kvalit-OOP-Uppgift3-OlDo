import java.util.Scanner;

public class HotelDemo {
    public static void main(String[] args) {
        while (true) {  //loop för att proggrammet upprepas
            Hotel h = new Hotel(); // h är referensvariable, skapar ett objekt
            System.out.println(h); //skriver ut objekts egenskaper
            int[] roomsNumbers = h.roomsArray(); //skapa rumsnumeringplan
            int labels = h.totalLables(roomsNumbers);   //råknar total antal skyltar
            double summa = Money.summa(labels); //råknar pris före rabbat
            Money.discount(summa, labels); // räknar pris efter rabbat om det är relevant
            Scanner input = new Scanner(System.in);
            System.out.println("Vill du räkna igen? tryck j om du vill fortsätta.");
            if (!input.nextLine().startsWith("j")){ //kolla up att användaren vill fortsätta
                System.out.println("Tack och Hej då!");
                break;
            }

        }
    }
}
