import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public String classify() {
        if (gpa >= 8.5) {
            return "Xuất sắc";
        } else if (gpa >= 7.0) {
            return "Giỏi";
        } else if (gpa >= 5.5) {
            return "Khá";
        } else {
            return "Trung bình/Yếu";
        }
    }

    @Override
    public String toString() {
        return String.format("Mã sinh viên: %s | tên: %s | GPA: %.2f | xếp loại: %s", id, name, gpa, classify());
    }
}

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int choice;
        do {
            System.out.println("\n===== QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo tên");
            System.out.println("4. Phân loại sinh viên theo GPA");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = getValidIntegerInput(scanner);
            switch (choice) {
                case 1:
                    addStudents(scanner, students);
                    break;
                case 2:
                    displayStudents(students);
                    break;
                case 3:
                    searchStudentByName(scanner, students);
                    break;
                case 4:
                    classifyStudents(students);
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
            }
        } while (true);
    }

    private static void addStudents(Scanner scanner, ArrayList<Student> students) {
        System.out.print("Nhập số lượng sinh viên: ");
        int count = getValidIntegerInput(scanner);

        for (int i = 0; i < count; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Mã sinh viên: ");
            String id = scanner.nextLine();
            System.out.print("Họ và tên: ");
            String name = scanner.nextLine();
            System.out.print("Điểm GPA: ");
            double gpa = getValidDoubleInput(scanner);
            students.add(new Student(id, name, gpa));
        }
    }

    private static void displayStudents(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
            return;
        }
        System.out.println("\nDanh sách sinh viên:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void searchStudentByName(Scanner scanner, ArrayList<Student> students) {
        System.out.print("Nhập tên sinh viên cần tìm: ");
        String keyword = scanner.nextLine().toLowerCase();
        ArrayList<Student> foundStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.getName().toLowerCase().contains(keyword)) {
                foundStudents.add(student);
            }
        }

        if (foundStudents.isEmpty()) {
            System.out.println("Không tìm thấy sinh viên có tên chứa: " + keyword);
        } else {
            System.out.println("Kết quả tìm kiếm:");
            for (Student student : foundStudents) {
                System.out.println(student);
            }
        }
    }

    private static void classifyStudents(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
            return;
        }
        System.out.println("Phân loại sinh viên:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static int getValidIntegerInput(Scanner scanner) {
        while (true) {
            try {
                int value = Integer.parseInt(scanner.nextLine());
                if (value >= 0) {
                    return value;
                }
                System.out.print("Giá trị không hợp lệ! Vui lòng nhập số nguyên dương: ");
            } catch (NumberFormatException e) {
                System.out.print("Định dạng không hợp lệ! Vui lòng nhập số nguyên: ");
            }
        }
    }

    private static double getValidDoubleInput(Scanner scanner) {
        while (true) {
            try {
                double value = Double.parseDouble(scanner.nextLine());
                if (value >= 0.0 && value <= 10.0) {
                    return value;
                }
                System.out.print("Điểm GPA phải từ 0 đến 10. Nhập lại: ");
            } catch (NumberFormatException e) {
                System.out.print("Định dạng không hợp lệ! Vui lòng nhập số thực: ");
            }
        }
    }
}