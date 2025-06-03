package bt04;

public class Student {
    private int stuId;
    private String stuName;

    public Student(){
        stuId = -1;
        stuName = null;
    }
    public Student(int stuId, String stuName) {
        this.stuId = stuId;
        this.stuName = stuName;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName( ) {

        return stuName;
    }

    public void setStuName(String stuName) {
        do {
            if(stuName.isEmpty()){
                System.out.println("Không được để trống!");
            }else{
                this.stuName = stuName;
                break;
            }
        }while (true);

    }
}
