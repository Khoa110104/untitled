package oop.midterm2023.properties.abstraction;


/* Tính trừu tượng là một tiến trình ẩn các chi tiết trình triển khai và chỉ hiển thị tính năng tới người dùng. Tính
 trừu tượng cho phép bạn loại bỏ tính chất phức tạp của đối tượng bằng cách chỉ đưa ra các thuộc tính và phương thức
 cần thiết của đối tượng trong lập trình.

 */
public class TestMain {

    /* Lớp trừu tượng Animal định nghĩa một phương thức trừu tượng greeting(), nhưng không cung cấp triển khai cho nó.
     Lớp con Cat và Dog kế thừa từ lớp Animal và cung cấp triển khai cho phương thức greeting() theo cách khác nhau.

     */
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.greeting();
        // Phương thức greeting() không được triển khai ở lớp Animal đã được lớp Cat triển khai in ra tiếng kêu của mèo.

        Animal animal1 = new Dog();
        animal.greeting();
        // Phương thức greeting() không được triển khai ở lớp Animal đã được lớp Dog triển khai in ra tiếng kêu của mèo.
    }
}
