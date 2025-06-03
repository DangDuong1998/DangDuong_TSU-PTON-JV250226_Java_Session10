package bt02;

import Scanner.ScannerAll;

import java.util.HashMap;

public class Main {
    public static HashMap<String,Book> bookList = new HashMap<>();
    public static void findBook(String input){

        boolean isFound = false;
        for (String bookName : bookList.keySet()){
            if(bookName.equals(input)){
                isFound = true;
                bookList.get(bookName).displayBook();
            }
        }
        if(!isFound){
            System.out.println("Không tìm thấy sách!");
        }
    }
    public static void main(String[] args) {
        do {
            System.out.println("**************MENU QUẢN LÝ SÁCH**************");
            System.out.println("1. Thêm sách");
            System.out.println("2. Tìm kiếm sách");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            byte opt = Byte.parseByte(ScannerAll.SCANNER.nextLine());
            switch (opt){
                case 1:
                    Book book = new Book();
                    do {
                        System.out.print("Nhập tên sách");
                        String inputName = ScannerAll.SCANNER.nextLine();
                        if(!bookList.containsKey(inputName)){
                            book.setBookName(inputName);
                            bookList.put(book.getBookName(), book);
                            System.out.println("Đã thêm sách thành công");
                            break;
                        }else{
                            System.out.print("Sách đã tồn tại");
                            break;
                        }
                    }while (true);
                    break;

                case 2:
                        System.out.print("Nhập tên sách cần tìm: ");
                        String input = ScannerAll.SCANNER.nextLine();
                        Main.findBook(input);
                        break;

                case 3:
                        if(bookList.size() == 0){
                            System.out.println("Dữ liệu trống!");
                        }
                        else{
                            for (String bookName : bookList.keySet()){
                                bookList.get(bookName).displayBook();
                            }
                        }
                        break;


                case 4:
                    System.exit(0);

                default:
                    System.out.println("Nhập từ 1 đến 4");
                    break;
            }
        }while (true);
    }
}
