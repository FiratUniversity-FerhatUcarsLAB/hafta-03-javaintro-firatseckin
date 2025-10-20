public class MilKm {
    public static void main(String[] args){
        int[] mil = {1,5,10,20,50};
        System.out.println("Mil -> Km");
        for(int m: mil){
            System.out.println(m + " -> " + (m*1.609));
        }
    }
}
