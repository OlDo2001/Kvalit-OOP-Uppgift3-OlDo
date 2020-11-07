import java.util.Scanner;

public class Hotel {
    private String name;
    private int floors;
    private int roomsPerFloor;
    private int roomsTotal;

    //Konstruktor
    public Hotel (){
        setName();
        setFloors();
        setRooms();
    }
    public void setName (){
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Ange ett hotel namn ");
            this.name = input.nextLine();
            if (this.name!= null)
                break;
            else {
                System.out.println("Namnet är tomt. Försök igen!");
            }
        }
    }
    public void setFloors (){

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Ange antal våningar ");
            String s = input.nextLine();
            try {
                this.floors = Integer.parseInt(s);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ej heltal! Försök igen!");
            }
        }

    }
    public void setRooms (){

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Ange antal rum per en våning ");
            String s = input.nextLine();
            try {
                this.roomsPerFloor = Integer.parseInt(s);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ej heltal! Försök igen!");
            }
        }
        this.roomsTotal = this.floors * this.roomsPerFloor;

    }
    public int[] roomsArray() {

        int[] numbers = new int [this.roomsTotal];
        int x = 0;
        System.out.println("Rumsnumeringplan:");
        for (int i=1; i<=this.floors; i++){
            for (int j=1; j<=this.roomsPerFloor; j++){
                if (this.roomsPerFloor>=10 && j<10){
                    numbers [x] = Integer.parseInt(Integer.toString(i*10)+Integer.toString(j));
                } else
                    numbers [x] = Integer.parseInt(Integer.toString(i)+Integer.toString(j));
                System.out.print(numbers[x] + " ");
                x++;
            }
            System.out.println();
        }
        return numbers;

    }
    public int totalLables (int[] array){
        int [] result = new int [10];
        int total = 0;

        for (int i = 0; i<this.roomsTotal; i++){
            for (int j=0; j < Integer.toString(array[i]).length(); j++) {
                if (Integer.toString(array[i]).charAt(j) == '0') result[0]++;
                if (Integer.toString(array[i]).charAt(j) == '1') result[1]++;
                if (Integer.toString(array[i]).charAt(j) == '2') result[2]++;
                if (Integer.toString(array[i]).charAt(j) == '3') result[3]++;
                if (Integer.toString(array[i]).charAt(j) == '4') result[4]++;
                if (Integer.toString(array[i]).charAt(j) == '5') result[5]++;
                if (Integer.toString(array[i]).charAt(j) == '6') result[6]++;
                if (Integer.toString(array[i]).charAt(j) == '7') result[7]++;
                if (Integer.toString(array[i]).charAt(j) == '8') result[8]++;
                if (Integer.toString(array[i]).charAt(j) == '9') result[9]++;
            }
        }
        System.out.println("Antal siffror specifikation:");
        for (int i = 0; i<10; i++){
            total = total + result [i];
            System.out.println("Antal " + i + ":\t" + result[i]);
        }
        System.out.println("Total antal skyltar är: " + total);
        return total;
    }
    @Override
    public String toString() {
        return " Hotel '" + this.name + '\'' +
                " har " + this.floors + " våningar och " +
                this.roomsPerFloor + " rum per våning.";
    }
}
