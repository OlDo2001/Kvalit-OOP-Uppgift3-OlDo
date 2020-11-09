public class Money {
    // Privata instansvariabler

    private double price;
    private double discountPrice;
    private final Hotel name;
    /**
     * Konstruktor som definerar värderna av objekts egenskaper med hjälp av följande instansmetoder.
     */
    public Money (int lables, Hotel h ){ //
        this.name = h;
        discount(summa (lables), lables);
    }

    /**
     *  En instansmetod som beräknar ett pris för alla skyltar före rabbat
     * @param total är antal skyltar
     * @return  pris före rabbat
     */
    public double summa (int total){
        double unitPrice = 15; //pris per 1 skylt i SEK
        this.price = total * unitPrice;
        //System.out.print("Priset för hotel " + this.name.name);
       // System.out.printf(" är %.2f SEK \n", this.price);
    return this.price;
    }

    /**
     * En instansmetod som beräknar ett pris efter rabbaten om detta är relevant. Skriver ut resultat.
     * @param summa summa före rabbat
     * @param total antal skyltar
     */
    public void discount (double summa,int total){
        double d = 0.1;
        if (total>=100) {  //tillämpar rabbat d = 5 % om antal skyltar är mer eller lika med 100 styken
            this.discountPrice = summa * (1-d);
            System.out.println("Rabbat gäller för " + this.name);
            System.out.printf("Priset före rabbat är %.2f SEK.", this.price);
            System.out.printf(" Priset med rabbat är %.2f SEK. \n", this.discountPrice);
        }else {
            System.out.println("Ingen rabbat gäller för " + this.name);
            System.out.printf("Priset är %.2f SEK.\n", this.price);
        }
    }
}
