package hus.oop.studentmanager;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class StudentManager {
    // Singleton pattern
    private static StudentManager instance;

    private List<Student> studentList;

    private StudentManager() {
        studentList = new LinkedList<>();
    }

    public static StudentManager getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new StudentManager();
        }
        return instance;
    }

    public List<Student> getStudentList() {
        return this.studentList;
    }

    /**
     * Thêm sinh viên vào cuối danh sách.
     * @param student
     */
    public void append(Student student) {
        /* TODO */
        if (student != null) {
            studentList.add(student);
        }
    }
    private boolean checkBoundaries(int index, int limit) {
        return index <= limit & index >= 0;
    }

    /**
     * Thêm sinh viên vào danh sách ở vị trí index.
     * @param student
     * @param index
     */
    public void add(Student student, int index) {
        /* TODO */
        if (checkBoundaries(index, studentList.size()) & student != null) {
            studentList.add(index, student);
        }else {
            System.out.println("Can't add!!!!");
        }
    }

    /**
     * Bỏ sinh viên ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        if (checkBoundaries(index, studentList.size() - 1)) {
            studentList.remove(index);
        } else {
            System.out.println("Can't remove!!!");
        }
    }

    /**
     * Bỏ sinh viên như tham số truyền vào.
     * @param student
     */
    public void remove(Student student) {
        /* TODO */
        studentList.remove(student);
    }

    /**
     * Lấy ra sinh viên ở vị trí index
     * @param index
     * @return
     */
    public Student studentAt(int index) {
        /* TODO */
        if (checkBoundaries(index, studentList.size()-1)) {
            return studentList.get(index);
        } else {
            System.out.println("Can't put out!!!");
            return null;
        }
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự năm sinh tăng dần.
     * @return
     */
    public List<Student> sortYearOfBirthIncreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                return left.getYearOfBirth() - right.getYearOfBirth();
            }
        });
        return newList;
    }

    /**
     * Sắp xếp sinh viên theo thứ tự năm sinh giảm dần.
     * @return
     */
    public List<Student> sortYearOfBirthDecreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                return right.getYearOfBirth() - left.getYearOfBirth();
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán tăng dần.
     * @return
     */
    public List<Student> sortMathsGradeIncreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (left.getMathsGrade() > right.getMathsGrade()) {
                    return 1;
                } else if (left.getMathsGrade() < right.getMathsGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán giảm dần.
     * @return
     */
    public List<Student> sortMathsGradeDecreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (right.getMathsGrade() > left.getMathsGrade()) {
                    return 1;
                } else if (right.getMathsGrade() < left.getMathsGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm lý tăng dần.
     * @return
     */
    public List<Student> sortPhysicsGradeIncreasing() {
        /* TODO */
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                return Double.compare(left.getPhysicsGrade() , right.getPhysicsGrade());
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm lý giảm dần.
     * @return
     */
    public List<Student> sortPhysicsGradeDecreasing() {
        /* TODO */
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                return Double.compare(right.getPhysicsGrade() , left.getPhysicsGrade());
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm hóa tăng dần.
     * @return
     */
    public List<Student> sortChemistryGradeIncreasing() {
        /* TODO */
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                return Double.compare(left.getChemistryGrade() , right.getChemistryGrade());
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm hóa giảm dần.
     * @return
     */
    public List<Student> sortChemistryGradeDecreasing() {
        /* TODO */
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                return Double.compare(right.getChemistryGrade() , left.getChemistryGrade());
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình tăng dần.
     * @return
     */
    public List<Student> sortAverageGradeIncreasing() {
        /* TODO */
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                return Double.compare(left.getAverageGrade() , right.getAverageGrade());
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình giảm dần.
     * @return
     */
    public List<Student> sortAverageGradeDecreasing() {
        /* TODO */
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                return Double.compare(right.getAverageGrade() , left.getAverageGrade());
            }
        });
        return newList;
    }

    /**
     * Lọc ra howMany sinh viên có điểm lý cao nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestPhysicsGrade(int howMany) {
        /* TODO */
        List<Student> list = sortPhysicsGradeDecreasing();
        return list.subList(0,Math.min(list.size(), howMany));
    }

    /**
     * Lọc ra những sinh viên có điểm lý cao hơn lowerBoundGrade.
     * @param lowerBoundGrade
     * @return
     */
    public List<Student> filterStudentsHigherThanPhysicsGrade(double lowerBoundGrade) {
        /* TODO */
        List<Student> list = sortPhysicsGradeIncreasing();
        for (Student i : list) {
            if (i.getPhysicsGrade()<=lowerBoundGrade) {
                list.remove(i);
            }
        }
        return list;
    }

    /**
     * Lọc ra howMany sinh viên có điểm lý thấp nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestPhysicsGrade(int howMany) {
        /* TODO */
        List<Student> list = sortPhysicsGradeIncreasing();
        return list.subList(0,Math.min(list.size(), howMany));
    }

    /**
     * Lọc ra howMany sinh viên có điểm lý thấp hơn upperBoundGrade.
     * @param upperBoundGrade
     * @return
     */
    public List<Student> filterStudentsLowerThanPhysicsGrade(double upperBoundGrade) {
        /* TODO */
        List<Student> list = sortPhysicsGradeIncreasing();
        for (Student i : list) {
            if (i.getPhysicsGrade()>=upperBoundGrade) {
                list.remove(i);
            }
        }
        return list;
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán cao nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestMathsGrade(int howMany) {
        /* TODO */
        List<Student> list = sortMathsGradeDecreasing();
        return list.subList(0,Math.min(list.size(), howMany));
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán cao thấp hơn lowerBoundGrade.
     * @param lowerBoundGrade
     * @return
     */
    public List<Student> filterStudentsHigherThanMathsGrade(int lowerBoundGrade) {
        /* TODO */
        List<Student> list = sortMathsGradeIncreasing();
        for (Student i : list) {
            if (i.getMathsGrade()<=lowerBoundGrade) {
                list.remove(i);
            }
        }
        return list;
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán thấp nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestMathsGrade(int howMany) {
        /* TODO */
        List<Student> list = sortMathsGradeIncreasing();
        return list.subList(0,Math.min(list.size(), howMany));
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán thấp hơn upperBoundGrade.
     * @param upperBoundGrade
     * @return
     */
    public List<Student> filterStudentsLowerThanMathsGrade(double upperBoundGrade) {
        /* TODO */
        List<Student> list = sortMathsGradeIncreasing();
        for (Student i : list) {
            if (i.getMathsGrade()>=upperBoundGrade) {
                list.remove(i);
            }
        }
        return list;
    }

    /**
     * Lọc ra howMany sinh viên có điểm hóa cao nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestChemistryGrade(int howMany) {
        /* TODO */
        List<Student> list = sortChemistryGradeDecreasing();
        return list.subList(0,Math.min(list.size(), howMany));
    }

    /**
     * Lọc ra howMany sinh viên có điểm hóa cao hơn lowerBoundGrade.
     * @param lowerBoundGrade
     * @return
     */
    public List<Student> filterStudentsHigherThanChemistryGrade(int lowerBoundGrade) {
        /* TODO */
        List<Student> list = sortChemistryGradeIncreasing();
        for (Student i : list) {
            if (i.getChemistryGrade()<=lowerBoundGrade) {
                list.remove(i);
            }
        }
        return list;
    }

    /**
     * Lọc ra howMany sinh viên có điểm hóa thấp nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestChemistryGrade(int howMany) {
        /* TODO */
        List<Student> list = sortChemistryGradeIncreasing();
        return list.subList(0,Math.min(list.size(), howMany));
    }

    /**
     * Lọc ra howMany sinh viên có điểm hóa thấp hơn upperBoundGrade.
     * @param upperBoundGrade
     * @return
     */
    public List<Student> filterStudentsLowerThanChemistryGrade(int upperBoundGrade) {
        /* TODO */
        List<Student> list = sortChemistryGradeIncreasing();
        for (Student i : list) {
            if (i.getChemistryGrade()>=upperBoundGrade) {
                list.remove(i);
            }
        }
        return list;
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình cao nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestAverageGrade(int howMany) {
        /* TODO */
        List<Student> list = sortAverageGradeDecreasing();
        return list.subList(0,Math.min(list.size(), howMany));
    }

    /**
     * Lọc ra howMany sinh viên có điểm bình cao hơn lowerBoundGrade.
     * @param lowerBoundGrade
     * @return
     */
    public List<Student> filterStudentsHigherThanAverageGrade(int lowerBoundGrade) {
        /* TODO */
        List<Student> list = sortAverageGradeIncreasing();
        for (Student i : list) {
            if (i.getAverageGrade()<=lowerBoundGrade) {
                list.remove(i);
            }
        }
        return list;
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình thấp nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestAverageGrade(int howMany) {
        /* TODO */
        List<Student> list = sortAverageGradeIncreasing();
        return list.subList(0,Math.min(list.size(), howMany));
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình thấp hơn upperBoundGrade.
     * @param upperBoundGrade
     * @return
     */
    public List<Student> filterStudentsLowerThanAverageGrade(int upperBoundGrade) {
        /* TODO */
        List<Student> list = sortAverageGradeIncreasing();
        for (Student i : list) {
            if (i.getAverageGrade()>=upperBoundGrade) {
                list.remove(i);
            }
        }
        return list;
    }

    public static String idOfStudentsToString(List<Student> studentList) {
        StringBuilder idOfStudents = new StringBuilder();
        idOfStudents.append("[");
        for (Student student : studentList) {
            idOfStudents.append(student.getId()).append(" ");
        }
        return idOfStudents.toString().trim() + "]";
    }

    public static void print(List<Student> studentList) {
        StringBuilder studentsString = new StringBuilder();
        studentsString.append("[\n");
        for (Student student : studentList) {
            studentsString.append(student.toString()).append("\n");
        }
        System.out.print(studentsString.toString().trim() + "\n]");
    }
}
