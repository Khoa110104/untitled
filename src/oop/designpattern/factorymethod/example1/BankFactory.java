package oop.designpattern.factorymethod.example1;

public class BankFactory {
    private BankFactory(){

    }
    public static final Bank getBank(String bankType) {
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
