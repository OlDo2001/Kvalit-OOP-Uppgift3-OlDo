import java.util.Scanner;

public class Hotel {
    String name;
    int floors;
    int roomsPerFloor;
    int roomsTotal;

    public static String getName (Hotel h){
        Scanner input = new Scanner(System.in);

        System.out.println("Ange ett hotel namn ");
        h.name = input.nextLine();

        System.out.println("Hotellet heter " + h.name);
        return h.name;
    }
    public static int getFloors (Hotel h){
        Scanner input = new Scanner(System.in);

        System.out.println("Ange antal våningar ");
        String s = input.nextLine();
        h.floors = Integer.parseInt(s);
        System.out.println("Antal våningar är " + h.floors);
        return h.floors;
    }
    public static int getRooms (Hotel h){
        Scanner input = new Scanner(System.in);

        System.out.println("Ange antal rum per en våning ");
        String s = input.nextLine();
        h.roomsPerFloor = Integer.parseInt(s);
        System.out.println("Antal rum per en våning  är " + h.roomsPerFloor);
        return h.roomsPerFloor;

    }
    public static int [] roomsArray (Hotel h) {
        int Numbers [] = new int [h.roomsTotal];
        int x = 0;
        for (int i=1; i<=h.floors; i++){
            for (int j=1; j<=h.roomsPerFloor; j++){
                if (h.roomsPerFloor>=10 && j<10){
                    Numbers [x] = Integer.parseInt(Integer.toString(i*10)+Integer.toString(j));
                } else
                    Numbers [x] = Integer.parseInt(Integer.toString(i)+Integer.toString(j));
                System.out.print(Numbers[x] + " ");
                x++;
            }
            System.out.println();
        }
        return Numbers;

    }
    public static int [] lableArray (int[] array, Hotel h){
        int [] result = new int [10];
        int total = 0;
        for (int i = 0; i<h.roomsTotal; i++){
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
        for (int i = 0; i<10; i++){
            total = total + result [i];
            System.out.println("Antal " + i + ":\t" + result[i]);
        }
        System.out.println("Total antal skyltar är: " + total);
        return result;
    }
}
