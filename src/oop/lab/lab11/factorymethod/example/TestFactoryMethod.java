package oop.lab.lab11.factorymethod.example;

public class TestFactoryMethod {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String type = sc.nextLine();
//        Bank bank = BankFactory.getBank(type);
//        System.out.println(bank.getBankName());
        BankFactory factory = new BankFactory();
        Bank bank = factory.getBank("TPBANK");
        System.out.println(bank.getBankName());
        System.out.println("---------------------------");
        bank = factory.getBank("MBBANK");
        System.out.println(bank.getBankName());
    }
}
