package hus.oop.candidatemanager;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        System.out.println("===============================");
        testOriginalData();
        System.out.println("===============================");
        testSortAverageGradeDecreasing();
        System.out.println("===============================");
        testSortAverageGradeIncreasing();
        System.out.println("===============================");
        testSortMathsGradeDecreasing();
        System.out.println("===============================");
        testSortMathsGradeIncreasing();
        System.out.println("===============================");
        testFilterStudentsHighestAverageGrade();
        System.out.println("===============================");
        testFilterStudentsLowestAverageGrade();
        System.out.println("===============================");
        testFilterStudentsHighestMathsGrade();
        System.out.println("===============================");
        testFilterStudentsLowestMathsGrade();

        /*
        TODO

        - Viết code để test cho tất cả các hàm bên dưới.
        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
        là <TenSinhVien_MaSinhVien_CandidateManager>.txt (Ví dụ, NguyenVanA_123456_CandidateManager.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
        <TenSinhVien_MaSinhVien_CandidateManager>.zip (Ví dụ, NguyenVanA_123456_CandidateManager.zip),
        nộp lên classroom.
         */
    }

    public static void init() {
        String filePath = "src/hus/oop/candidatemanager/students.csv";
        readListData(filePath);
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 7) {
                    continue;
                }

                if (dataList.get(0).equals("id")) {
                    continue;
                }

                /*
                TODO

                Đọc được dữ liệu, tạo ra các đối tượng sinh viên ở đây, và cho vào StudentManager để quản lý.
                */
                Student newStudent = new Student.StudentBuilder(dataList.get(0))
                        .withLastname(dataList.get(1))
                        .withFirstname(dataList.get(2))
                        .withYearOfBirth(Integer.parseInt(dataList.get(3)))
                        .withMathsGrade(Double.parseDouble(dataList.get(4)))
                        .withPhysicsGrade(Double.parseDouble(dataList.get(5)))
                        .withChemistryGrade(Double.parseDouble(dataList.get(6)))
                        .build();
                StudentManager.getInstance().append(newStudent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void testOriginalData() {
        init();
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().getStudentList());
        System.out.print(studentIds);
    }

    public static void testSortMathsGradeIncreasing() {
        /* TODO */
       MyList students = StudentManager.getInstance().sortMathsGradeIncreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.println(studentIdsString);
    }

    public static void testSortMathsGradeDecreasing() {
        /* TODO */
        MyList students = StudentManager.getInstance().sortMathsGradeDecreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.println(studentIdsString);
    }

    public static void testSortAverageGradeIncreasing() {
        /* TODO */
        MyList students = StudentManager.getInstance().sortAverageGradeIncreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.println(studentIdsString);
    }

    public static void testSortAverageGradeDecreasing() {
        /* TODO */
        MyList students = StudentManager.getInstance().sortAverageGradeDecreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.println(studentIdsString);
    }

    public static void testFilterStudentsHighestMathsGrade() {
        /* TODO */
        MyList students = StudentManager.getInstance().filterStudentsHighestMathsGrade(5);
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.println(studentIdsString);
    }

    public static void testFilterStudentsLowestMathsGrade() {
        /* TODO */
       MyList students = StudentManager.getInstance().filterStudentsLowestMathsGrade(5);
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.println(studentIdsString);
    }

    public static void testFilterStudentsHighestAverageGrade() {
        /* TODO */
       MyList students = StudentManager.getInstance().filterStudentsHighestAverageGrade(5);
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.println(studentIdsString);
    }

    public static void testFilterStudentsLowestAverageGrade() {
        /* TODO */
       MyList students = StudentManager.getInstance().filterStudentsLowestAverageGrade(5);
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.println(studentIdsString);
    }
}
