import java.util.Scanner;
/*
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.

Ödev
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
3^5= 3.3.3.3.3
4^3 = 4.4.4
5^2 = 5.5
 */
public class Prime_Finder {
    public static void main(String[] args) {
        System.out.print("Üslü Sayı Bulma Programına Hoşgeldiniz:\nTaban Değerini giriniz:");
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        System.out.print("Üs Değerini giriniz:");
        int power = input.nextInt();
        int i;
        int total = 1;
        for (i=1; i<=power; total*=base){
            i++;
        }
        System.out.println("Cevap:"+total);

        System.out.println("----------------------------");
        while (i<=power) {
            total *= base;
            i++;
        }
        System.out.println(total);


    }
}
