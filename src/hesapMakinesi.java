import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {

        double n1, n2;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextDouble();

        System.out.print("İkinci sayıyı giriniz : ");
        n2 = input.nextDouble();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("\nYapmak istediğiniz işlemin numarasını giriniz : ");
        select = input.nextInt();

        switch(select){
            case 1:
                System.out.print("Cevabınız : " + (n1 + n2));
                break;
            case 2:
                System.out.print("Cevabınız : " + (n1 - n2));
                break;
            case 3:
                System.out.print("Cevabınız : " + (n1 * n2));
                break;
            case 4:
                System.out.print("Cevabınız : " + (n1 / n2));
                break;

        }

    }
}
