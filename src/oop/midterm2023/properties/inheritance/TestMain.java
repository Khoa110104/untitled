package oop.midterm2023.properties.inheritance;

/* Tính kế thừa có bản chất là phát triển lớp mới dựa trên các lớp đã có. Xây dựng
lớp mới có sẵn các thuộc tính và phương thức của lớp cha, đồng thời mở rộng các đặc
tính của nó. Việc này là một kĩ thuật tái sử dụng mã nguồn thông qua lớp.
*/
public class TestMain {
    public static void main(String[] args) {
        /* Kế thừa là sự liên quan của lớp cha với lớp con thông qua từ khóa " extends".Tuy nhiên, lớp chỉ được truy cập
       các thành viên public và protected của lớp cha. Nó không được phép truy cập đến thành viên private của lớp cha.
        */

        Shape shape1 = new Shape();
        System.out.println(shape1);
        Circle circle1 = new Circle(5.5, "red", false);
        /* Trong lớp con không khai báo mà có sẵn các thuộc tính "color" và "filled",
            đồng thời có thêm thuộc tính "radius" nên có hàm dựng gồm 3 thuộc tính đó.
        */
        System.out.println("Colored circle is: " + circle1.getColor());
        // Lớp Circle không có phương thức getColor() nhưng vẫn sử dụng được do kế thừa từ lớp Shape

        System.out.println("The circle has been filled: " + circle1.isFilled());
        // Lớp Circle không có phương thức getFilled() nhưng vẫn sử dụng được do kế thừa từ lớp Shape

        System.out.println("Circle radius is: " + circle1.getRadius());
        // Lớp Circle có thêm phương thức getRadius()

    }
}
