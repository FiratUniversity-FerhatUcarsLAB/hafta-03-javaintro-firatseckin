public class HesapOzeti {
    public static void main(String[] args) {
        String[] urun = {"Elma", "Ekmek", "Sut"};
        int[] miktar = {2,1,3};
        double[] fiyat = {5.0, 2.5, 3.0};
        System.out.println("Urun\tMiktar\tFiyat");
        for(int i=0;i<urun.length;i++){
            System.out.println(urun[i]+"\t"+miktar[i]+"\t"+fiyat[i]);
        }
    }
}
