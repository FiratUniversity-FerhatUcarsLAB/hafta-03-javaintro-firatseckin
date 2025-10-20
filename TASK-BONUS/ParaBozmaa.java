public class ParaBozma {
    public static void main(String[] args) {
        int bakiye = 278;

        int yuz = bakiye / 100;
        bakiye %= 100;

        int elli = bakiye / 50;
        bakiye %= 50;

        int yirmi = bakiye / 20;
        bakiye %= 20;

        int bes = bakiye / 5;
        bakiye %= 5;

        int iki = bakiye / 2;
        bakiye %= 2;

        int bir = bakiye;

        System.out.printf("278 TL = %dx100, %dx50, %dx20, %dx5, %dx2, %dx1\n",
                yuz, elli, yirmi, bes, iki, bir);
    }
}
