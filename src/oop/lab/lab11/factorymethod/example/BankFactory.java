package oop.lab.lab11.factorymethod.example;

public class BankFactory {
     Bank getBank(String bankType) {
        switch (bankType){
            case "TPBANK":
                return new TPBank();

            case "MBBANK":
                return new MBBank();
            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }

}
