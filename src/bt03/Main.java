package bt03;

import Scanner.ScannerAll;

import java.util.LinkedList;

public class Main {
    public static LinkedList<User> userList = new LinkedList<>();
    public static void addUserToList (User user){
        userList.add(user);
    }
    public static void removeUser (String searchEmail){
        boolean isFound = false;
        for(User user : userList){
            if(user.getUserEmail().equals(searchEmail)){
                isFound = true;
                userList.remove(user);
                System.out.println("Đã xóa User");
                break;
            }
        }
        if(!isFound){
            System.out.println("Không tìm thấy User");
        }
    }
    public static void main(String[] args) {
        do {
            System.out.println("**************MENU QUẢN LÝ NGƯỜI DÙNG");
            System.out.println("1. Thêm người dùng");
            System.out.println("2. Xóa người dùng");
            System.out.println("3. Hiển thị danh sách người dùng");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            byte opt = Byte.parseByte(ScannerAll.SCANNER.nextLine());

            switch (opt){
                case 1:
                    User user = new User();
                        user.setUserName();
                        user.setUserEmail();
                        user.setUserPhone();
                        Main.addUserToList(user);
                        System.out.println("Đã thêm User");
                    break;
                case 2:
                    System.out.print("Nhập email của User cần xóa: ");
                    String searchEmail = ScannerAll.SCANNER.nextLine();
                    Main.removeUser(searchEmail);
                    break;
                case 3:
                    if(userList.size() != 0){
                        for(User userCase03 : userList){
                            userCase03.displayData();
                        }
                    }else{
                        System.out.println("Dữ liệu trống!");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Nhập từ 1 đến 4 nhé!");
                    break;


            }
        }while (true);
    }
}
