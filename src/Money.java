public class Money {
    /**
     *  En klassmetod som beräknar ett pris för alla skyltar före rabbat
     * @param total antal skyltar
     * @return  pris före rabbat
     */
    public static double summa (int total){
        double unitPrice = 15.9; //pris per 1 skylt i SEK
        System.out.println("Priset är " + total * unitPrice + " SEK.");
    return total * unitPrice;
    }

    /**
     * En klassmetod som beräknar ett pris efter rabbaten
     * @param summa summa före rabbat
     * @param total antal skyltar
     */
    public static void discount (double summa, int total){
        double d = 0.05;
        if (total>=100) {  //tillämpar rabbat d = 5 % om antal skyltar är mer eller lika med 100 styken
            System.out.printf("Du får rabbat. Total pris är: %.2f SEK \n" , summa * (1-d));
        }else
            System.out.println("Inget rabbat gäller. Du betalar fullt pris " + summa + " SEK.");
    }
}
