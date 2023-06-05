import java.util.Scanner;

public class project7 {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, toplam;
        Scanner kg = new Scanner(System.in);
        System.out.print("Armut : ");
        armut = kg.nextDouble();
        System.out.print("Elma : ");
        elma = kg.nextDouble();
        System.out.print("Domates : ");
        domates = kg.nextDouble();
        System.out.print("Muz : ");
        muz = kg.nextDouble();
        System.out.print("Patlıcan : ");
        patlican = kg.nextDouble();
        double tarmut = armut*2.14;
        System.out.println("Armut toplam : "+tarmut);
        double telma = elma*3.67;
        System.out.println("Elma toplam : "+telma);
        double tdomates = domates*1.11;
        System.out.println("Domates toplam : "+tdomates);
        double tmuz = muz*0.95;
        System.out.println("Muz toplam : "+tmuz);
        double tpatlican = patlican*5.0;
        System.out.println("Patlıcan toplam : "+tpatlican);
        toplam = tarmut+telma+tdomates+tmuz+tpatlican;
        System.out.println("Toplam : "+toplam);

    }
}
