package oop.midterm2023.properties.encapsulation;

/*Tính đóng gói trong java là kỹ thuật ẩn giấu thông tin và hiển thị ra thông tin liên quan.Mục đích chính của
đóng gói trong java là giảm thiểu mức độ phức tạp phát triển phần mềm. Đóng gói cũng được sử dụng để
bảo vệ trạng thái bên trong của một đối tượng.
*/

public class TestMain {
    public static void main(String[] args) {
        /*Việc đóng gói đạt được bằng cách khái báo các biến ở dạng private, có nghĩa là chúng chỉ có thể được truy cập
        trong lớp. Để cho phép bên ngoài truy cập vào các biến thể hiện, các phương thức công khai được gọi là getters
        và setters được định nghĩa, được sử dụng để truy xuất và sửa đổi các giá trị của các biến thể hiện tương ứng.
        */
        Person person = new Person("Khoa", 22);
        System.out.println(person);

        person.setName("John");
        // Thay đổi tên của đối tượng thông qua phương thức setName()
        person.setAge(30);
        // Thay đổi tên của đối tượng thông qua phương thức setAge()


        System.out.println("Name: " + person.getName());
        // Lấy ra tên của đối tượng person thông qua phương thức getName()
        System.out.println("Age: " + person.getAge());
        // Lấy ra tuổi của đối tượng person thông qua phương thức getName()

    }
}