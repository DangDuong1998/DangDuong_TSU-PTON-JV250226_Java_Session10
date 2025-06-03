package bt01;
import Scanner.ScannerAll;
import bt01.Student;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Student> arrStudents = new ArrayList<>();
    public static void main(String[] args) {
        do {
            Student stu = new Student();

            stu.setStuName();
            stu.setStuAge();
            stu.setStuGrade();
            Main.addToArray(stu);
            System.out.print("Bạn có muốn thêm sinh viên khác? (y/n): ");
            String opt = ScannerAll.SCANNER.nextLine();
            if (opt.equals("n")){
                Main.studentList(arrStudents);
                break;
            }

        }while (true);



    }
    public static void studentList(ArrayList<Student> arr){
        if(arr.size() == 0){
            System.out.println("Dữ liệu trống!");
        }else{
            for(Student stu : arr){
                stu.displayData();
            }
        }
    }
    public static void addToArray(Student stu){
        arrStudents.add(stu);
    }
}

