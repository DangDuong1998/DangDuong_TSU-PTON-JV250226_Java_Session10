package bt04;

import Scanner.ScannerAll;

public class Main {
    public static void main(String[] args) {
        do {
            System.out.println("*************MENU QUẢN LÝ ĐIỂM DANH*************");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            Byte opt = Byte.parseByte(ScannerAll.SCANNER.nextLine());
            AttendanceManager aM = new AttendanceManager();
            switch (opt){
                case 1:
                    Student stu = new Student();
                    aM.add(stu);
                    break;
                case 2:
                    System.out.print("Nhập id của sinh viên cần update: ");
                    int checkId = Integer.parseInt(ScannerAll.SCANNER.nextLine());
                    aM.update(checkId);
                    break;
                case 3:
                    System.out.print("Nhập id sinh viên cần xóa: ");
                    int removeId = Integer.parseInt(ScannerAll.SCANNER.nextLine());
                    boolean isFound = false;
                    for (Student stu03 : aM.studentArrayList){

                        if (stu03.getStuId() == removeId){
                            isFound = true;
                            aM.delete(removeId);
                            break;
                        }
                    }if(!isFound){
                    System.out.println("Không tìm thấy sinh viên!");
                    }else{
                        aM.delete(removeId);
                    }
                    break;

                case  4:
                    aM.display();
                    break;
                case 5:
                    System.exit(0);

            }
        }while (true);
    }
}
