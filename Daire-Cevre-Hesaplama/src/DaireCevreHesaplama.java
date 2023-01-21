import java.util.Scanner;

public class DaireCevreHesaplama {
    public static void main(String[] args) {
        double pi=3.14,alan,cevre;
        int r;

        //değer alma
        Scanner input=new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz:");
        r=input.nextInt();

        cevre=(2*pi)*r;
        alan=pi*r*r;

        System.out.println("Daierenin alanı:"+alan);
        System.out.print("Dairenin çevresi:"+cevre);

    }
}
