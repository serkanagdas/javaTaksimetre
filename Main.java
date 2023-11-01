import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        int km, acilis;
        double perKm= 2.20, total=10;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Lütfen KM değerini giriniz= ");
        km= girdi.nextInt();

        total+=km*perKm;
        //Açıklaması: Total eğer 20 den küçük ise total=20, değil sie total=total
        total= (total<20) ? 20 : total;
        System.out.println("Topam Ödecenek Tutar= "+total);

    }
}