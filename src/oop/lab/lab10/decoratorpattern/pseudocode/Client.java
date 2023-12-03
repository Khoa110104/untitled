package oop.lab.lab10.decoratorpattern.pseudocode;

public class Client {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nKhoa, 123456\nHoang, 654321";
        DataSource plain = new FileDataSource("out/OutputDemo.txt");
        DataSourceDecorator encoded = new CompressionDecorator(new EncryptionDecorator(plain));
        encoded.writeData(salaryRecords);


        System.out.println("--------------Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("--------------Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("--------------Decoded --------------");
        System.out.println(encoded.readData());
    }
}
