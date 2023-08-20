import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Artık Yıl Hesaplama Programı");
        int yil;
        Scanner imp = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        yil = imp.nextInt();
        if (((yil%4==0)&&((yil%100)!=0))||(yil%400==0)){
            System.out.println(yil+" bir artık yıldır.");
        }else{
            System.out.println(yil+" bir artık yıl değildir.");
        }
    }
}