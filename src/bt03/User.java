package bt03;

import Scanner.ScannerAll;

public class User {
    private String userName;
    private String userEmail;
    private String userPhone;



    public  User(){
        this.userName = null;
        this.userEmail = null;
        this.userPhone = null;
    }
    public User(String userName, String userEmail, String userPhone) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName() {
        do {
            try {
                System.out.print("Nhập tên người dùng: ");
                String input = ScannerAll.SCANNER.nextLine();
                if(userName.isEmpty()){
                    System.out.println("Không để trống!");
                }else{
                    this.userName = input;
                    break;
                }
            }catch (Exception  e){
                System.out.println("Lỗi");
            }
        }while (true);

    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail() {
        do {
            try {
                System.out.print("Nhập tên người dùng: ");
                String input = ScannerAll.SCANNER.nextLine();
                if(userName.isEmpty()){
                    System.out.println("Không để trống!");
                }else if(input.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$\n")){
                    this.userEmail = input;
                    break;
                }else {
                    System.out.println("Vui lòng nhập đúng định dạng email");
                }
            }catch (Exception  e){
                System.out.println("Lỗi");
            }
        }while (true);
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone() {
        do {
            try {
                System.out.print("Nhập tên người dùng: ");
                String input = ScannerAll.SCANNER.nextLine();
                if(userName.isEmpty()){
                    System.out.println("Không để trống!");
                }else if(input.matches("^(0[3|5|7|8|9])+([0-9]{8})$")){
                    this.userPhone = input;
                    break;
                }else {
                    System.out.println("Vui lòng nhập đúng định dạng email");
                }
            }catch (Exception  e){
                System.out.println("Lỗi");
            }
        }while (true);
    }
    public void displayData(){
        System.out.println("Tên: "+userName+", Email: "+userEmail+", SĐT: "+userPhone);
    }
}
