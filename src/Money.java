public class Money {
    public static double summa (int total){
        double summa =  0;
        double unitPrice = 15.9;
        summa = total * unitPrice;
        System.out.println("Summa att betala är " + summa + "SEK.");
    return summa;
    }
    public static void discount (double summa, int total){
        double d = 0.05;
        double finalsumma = 0;
        if (total>=100) {
            finalsumma = summa * d;
            System.out.printf("Du får rabbat. Total pris är: %.2f SEK", finalsumma);
        }else
            System.out.println("Inget rabbat gäller. Du betalar fullt pris " + summa + " SEK.");

    }
}
