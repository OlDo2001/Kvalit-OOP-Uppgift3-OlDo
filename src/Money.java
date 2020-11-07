public class Money {
    /**
     *  En klassmetod som beräknar ett pris för alla skyltar före rabbat
     * @param total antal skyltar
     * @return summa före rabbat
     */
    public static double summa (int total){
        double summa;
        double unitPrice = 15.9;
        summa = total * unitPrice;
        System.out.println("Priset är " + summa + " SEK.");
    return summa;
    }

    /**
     * En klassmetod som beräknar ett pris efter rabbaten
     * @param summa summa före rabbat
     * @param total antal skyltar
     */
    public static void discount (double summa, int total){
        double d = 0.05;
        double finalsumma;
        if (total>=100) {
            finalsumma = summa * (1-d);
            System.out.printf("Du får rabbat. Total pris är: %.2f SEK \n" , finalsumma);
        }else
            System.out.println("Inget rabbat gäller. Du betalar fullt pris " + summa + " SEK.");

    }
}
