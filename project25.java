import java.util.Scanner;

public class project25 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        String name;
        int password, islem, right=3, balance=1500;
        System.out.print("Adınız : ");
        name = input.nextLine();
        System.out.print("Şifreniz : ");
        password= input.nextInt();
        if (name.equals("emir") && password==123456){
            System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
            System.out.print("İstediğiniz işlemi giriniz : ");
            islem= input.nextInt();
            switch(islem){
                case 1:
                System.out.print("Yatırmak istediğiniz miktarı giriniz : ");
                int deposit = input.nextInt();
                balance+=deposit;
                System.out.println("Hesabınızdaki yeni miktar : "+balance);
                break;
                case 2: 
                System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                int draft= input.nextInt();
                if(draft<=1500){
                balance-=draft;
                System.out.println("Hesabınızdaki miktar : "+balance);
                }
                else{
                System.out.println("Hesabınızda yeterli miktarda bulunmamaktadır.");
                }
                break;
                case 3: 
                System.out.print("Bakiyeniz : "+balance);
                break;
                case 4:
                System.out.println("Çıkış Yapıldı. ");
                break;
            }
            System.out.println("Sistemden çıkış yapıldı.");
            if(islem>5){
                System.out.println("Lütfen 1-4 arasıbir sayı giriniz. ");
            }
        }
        else{
            right--;
            System.out.println("Şifreniz veya adınız hatalı. ");
            if(right==0){
                System.out.println("Hesabınız bloke olmuştur.");
            }
        }
        
        
    }
}