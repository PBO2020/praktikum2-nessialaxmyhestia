package praktikum2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Praktikum2 {

    String Pilihan;
    ArrayList<getset> kopi = new ArrayList<>();
    getset Praktikum2 = new getset();
    Scanner nes = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public void menupilihan() {
        System.out.println("-----WELCOME IN CAFE COFFEE-----");
        System.out.println("1.Pilihan kopi pada menu ");
        System.out.println("2.pilihan topping pada menu");
        System.out.println("3.pilihan asalkopi pada menu");
        System.out.println("4.EXIT ");
        Pilihan = nes.next();
        switch (Pilihan) {
            case "1":
                kopi();
                break;
            case "2":
                Topping();
                break;
            case "3":
                System.out.println("----- Thank you----");
        }

    }

    public void kopi() {
            try {
                getset satu = new getset();
                satu.setNamakopi("Colombian Milds");
                satu.setAsalkopi("kolombia");
                kopi.add(satu);

                getset dua = new getset();
                dua.setNamakopi("Costa Rican Tarrazu");
                dua.setAsalkopi("San Marcos de Tarrazu valley");
                kopi.add(dua);

                getset tiga = new getset();
                tiga.setNamakopi("Gayo coffee");
                tiga.setAsalkopi("aceh");
                kopi.add(tiga);
                for (int i = 0; i < kopi.size(); i++) {
                    int j = i + 1;
                    System.out.println("\nMenu kopi " + j + " : " + kopi.get(i).getNamakopi() + "berasal dari " + kopi.get(i).getAsalkopi());
                }
                System.out.println("\nPilih Menu kopi :");
                Pilihan = nes.next();
                switch (Pilihan) {
                    case "1":
                        System.out.println("\nPesanan anda adalah kopi" + kopi.get(0).getNamakopi() + "berasal dari" + kopi.get(0).getAsalkopi());
                        break;
                    case "2":
                        System.out.println("\nPesanan anda adalah kopi " + kopi.get(1).getNamakopi() + "berasal dari" + kopi.get(1).getAsalkopi());
                        break;
                    case "3":
                        System.out.println("\nPesanan anda adalah kopi " + kopi.get(2).getNamakopi() + "berasal dari" + kopi.get(2).getAsalkopi());
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println(e);

            }
    }

    public void Topping() {
            try {
                getset empat = new getset();
                empat.setToppingkopi("susu");
                kopi.add(empat);

                getset lima = new getset();
                lima.setToppingkopi("meses");
                kopi.add(lima);

                getset enam = new getset();
                enam.setNamakopi("Gayo coffee");
                enam.setToppingkopi("susu");
                kopi.add(enam);
                for (int i = 0; i < kopi.size(); i++) {
                    int j = i + 1;
                    System.out.println("\nMenu Topping" + j + " : " +kopi.get(i).getToppingkopi());
                }
                 System.out.println("\nPilihmenuTopping :");
                Pilihan = nes.next();
                switch (Pilihan) {
                    case "4":
                        System.out.println("\nPesanan anda adalah kopi" + kopi.get(4).getNamakopi() + "berasal dari" + kopi.get(4).getAsalkopi());
                        break;
                    case "5":
                        System.out.println("\nPesanan anda adalah kopi " + kopi.get(5).getNamakopi() + "berasal dari" + kopi.get(5).getAsalkopi());
                        break;
                    case "6":
                        System.out.println("\nPesanan anda adalah kopi " + kopi.get(6).getNamakopi() + "berasal dari" + kopi.get(6).getAsalkopi());
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("pilihan anda berubah angka");

            }
      
        }
    public void lanjutan(){
        System.out.println("\nIngin lanjut? (ya/tidak)");
        String pilih = new Scanner(System.in).nextLine();
        switch(Pilihan){
            case"ya":
                Topping();
                break;
            case"tidak":
                System.out.println("----Thankyou----");
        }
    }

}
