package bt01;

import Scanner.ScannerAll;

public class Student {
    private String stuName;
    private int stuAge;
    private double stuGrade;

    public Student() {
        this.stuName = null;
        this.stuAge = 0;
        this.stuGrade = 0;
    }

    public Student(String stuName, int stuAge, double stuGrade) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuGrade = stuGrade;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName() {
        do {
            System.out.println("Nhập tên sinh viên: ");
            String stuName = ScannerAll.SCANNER.nextLine();
            if (stuName.isEmpty()){
                System.out.println("Vui lòng không để trống!");
            }else {
                this.stuName = stuName;
                break;
            }
        }while (true);
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge() {
        do {
            try {
                System.out.println("Nhập tuổi sinh viên: ");
                String input = ScannerAll.SCANNER.nextLine();
                if(input.isEmpty()){
                    System.out.println("Vui lòng không để trống!");
                }
                else{
                    int stuAge = Integer.parseInt(input);
                    if(stuAge > 0){
                        this.stuAge = stuAge;
                        break;
                    }else{
                        System.out.println("Vui lòng nhập số > 0!");
                    }
                }

            } catch (NumberFormatException  e){
                System.out.println("Vui lòng nhập số nguyên > 0!");
            }
        }while (true);

    }

    public double getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade() {
        do {
            try {
                System.out.println("Nhập điểm trung bình sinh viên: ");
                String input = ScannerAll.SCANNER.nextLine();
                if(input.isEmpty()){
                    System.out.println("Vui lòng không để trống!");
                }else{
                    double stuGrade = Double.parseDouble(input);
                    if(stuGrade >= 0){
                        this.stuGrade = stuGrade;
                        break;
                    }else{
                        System.out.println("Vui lòng nhập số >= 0!");
                    }
                }

            } catch (Exception e) {
                System.out.println("Vui lòng nhập số >= 0!");
            }
        }while (true);

    }
    public void displayData(){
        System.out.println("Tên: "+stuName+" Tuổi: "+stuAge+" Điểm trung bình: "+stuGrade);
    }
}
