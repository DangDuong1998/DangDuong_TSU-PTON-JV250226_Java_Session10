package bt04;

import Scanner.ScannerAll;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class AttendanceManager implements Manage<Student>{
    public ArrayList<Student> studentArrayList;

    @Override
    public void add(Student item) {
        do {
            try {
                System.out.print("Nhập ID sinh viên: ");
                int input = Integer.parseInt(ScannerAll.SCANNER.nextLine());
                boolean isValid = false;
                for(Student stu : studentArrayList){
                    if(stu.getStuId() == input){
                        isValid=true;
                        System.out.println("ID đã tồn tại!");
                        break;
                    }
                }
                if(!isValid){
                    item.setStuId(input);
                    break;
                }
            }catch (Exception e){
                System.out.print("Hãy chỉ nhập số nguyên!");
            }

        }while (true);

            System.out.print("Nhập tên sinh viên: ");
            String input = ScannerAll.SCANNER.nextLine();
            item.setStuName(input);
        studentArrayList.add(item);
        System.out.println("Đã thêm sinh viên!");
    }

    @Override
    public void update(int index) {
        boolean isFound = false;
        for (Student stu : studentArrayList){
            if(stu.getStuId() == index){
                isFound = true;
                System.out.print("Nhập tên mới cho sinh viên: ");
                String newName = ScannerAll.SCANNER.nextLine();
                stu.setStuName(newName);
                break;
            }
        }
        if(!isFound){
            System.out.println("Không tìm thấy sinh viên!");
        }
    }

    @Override
    public void delete(int index) {
        studentArrayList.remove(index);
    }

    @Override
    public void display() {
        int count = 0;
        if(studentArrayList.size() == 0){
            System.out.println("Dữ liệu trống");
        }else{
            for (Student stu : studentArrayList){
                count += 1;
                System.out.println(count +". ID: "+ stu.getStuId()+", Tên sinh viên: "+ stu.getStuName());
            }
        }


    }
}
