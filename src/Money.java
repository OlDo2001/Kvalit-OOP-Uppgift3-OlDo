public class Money {
    // Privata instansvariabler

    private double price;
    private double discountPrice;
    private final Hotel name;
    /**
     * Konstruktor som definerar värderna av objekts egenskaper med hjälp av följande instansmetoder.
     */
    public Money (int lables, Hotel h ){
        this.name = h;//kopplar instansvariabel name till objekt h
        discount(summa (lables), lables);
    }
    /**
     *  En instansmetod som beräknar ett pris för alla skyltar före rabatt
     * @param total är antal skyltar
     * @return  pris före rabbat
     */
    public double summa (int total){
        double unitPrice = 15; //pris per 1 skylt i SEK
        this.price = total * unitPrice;
    return this.price;
    }

    /**
     * En instansmetod som beräknar ett pris efter rabatten om detta är relevant. Skriver ut resultat.
     * @param summa summa före rabatt
     * @param total antal skyltar
     */
    public void discount (double summa,int total){
        double d = 0.1;
        if (total>=200) {  //tillämpar rabatt d = 10 % om antal skyltar är mer eller lika med 200 styken
            this.discountPrice = summa * (1-d);
            System.out.println("Rabatt gäller för " + this.name);
            System.out.printf("Priset före rabatt är %.2f SEK.", this.price);
            System.out.printf(" Priset med rabatt är %.2f SEK. \n", this.discountPrice);
        }else {
            System.out.println("Ingen rabatt gäller för " + this.name);
            System.out.printf("Priset är %.2f SEK.\n", this.price);
        }
    }
}
