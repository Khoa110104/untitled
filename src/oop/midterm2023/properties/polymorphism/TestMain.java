package oop.midterm2023.properties.polymorphism;

/* Tính đa hình cho phép các đối tượng có thể có nhiều hình dạng hoặc cách thức hoạt động khác nhau,tùy thuộc vào ngữ
   cảnh mà chúng được sử dụng.Ví dụ về tính đa hình trong Java là sử dụng phương thức ghi đè (method overriding) và
   phương thức nạp chồng(method overloading).Phương thức ghi đè cho phép một lớp con định nghĩa lại một phương thức được
   định nghĩa trong lớp cha, và sử dụng chức năng khác nhau tùy thuộc vào lớp con đó.
*/

public class TestMain {
    public static void main(String[] args) {
/* Trong ví dụ này lớp Shape định nghĩa một phương thức getArea() tính diện trả về giá trị. Lớp con Circle và Rectangle
kế thừa từ lớp Shape và định nghĩa lại phương thức getArea() theo cách khác nhau và in ra kết quả khác nhau.
 */
        Shape shape;
        shape = new Circle(2);
        System.out.println("area is: " + shape.getArea());
        // Đối tượng shape ra đã định nghĩa lại phương thức getArea() tính diện tích theo lớp con Circle

        shape = new Rectangle(3, 4);
        System.out.println("area is: " + shape.getArea());
        // Đối tượng shape ra đã định nghĩa lại phương thức getArea() tính diện tích theo lớp con Rectangle

        System.out.println("============Overloading============");
        /*  Đây là khả năng cho phép một lớp có nhiều thuộc tính, phương thức cùng tên nhưng với các tham số khác nhau
        về loại cũng như về số lượng. Khi được gọi, dựa vào tham số truyền vào, phương thức tương ứng sẽ được thực hiện.
         */
        Sum s = new Sum();
        System.out.println(s.sum(10, 20));
        //Khi truyền vào 2 tham số kiểu int thì phương thức sum(int x, int y) sẽ được thực hiện.

        System.out.println(s.sum(10, 20, 30));
        //Thay đổi số lượng tham số
        //Khi truyền vào 3 tham số kiểu int thì phương thức sum(int x, int y, int z) sẽ được thực hiện.
        System.out.println(s.sum(10.5, 20.5));

        //Thay đổi kiểu dữ liệu của tham số
        //Khi truyền vào 2 tham số kiểu double thì phương thức sum(double x, double y) sẽ được thực hiện.

    }
}
