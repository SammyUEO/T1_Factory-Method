package factorymthoddemo;

//Main.java
public class Main {
 public static void main(String[] args) {
     LegoFactory classicFactory = new ClassicLegoFactory();
     LegoFactory duploFactory = new DuploLegoFactory();

     LegoBrick classic = classicFactory.createLego(2, 4);
     LegoBrick duplo = duploFactory.createLego(2, 4);

     classic.printInfo();
     duplo.printInfo();
 }
}
