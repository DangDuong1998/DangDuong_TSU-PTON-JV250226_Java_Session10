package bt02;

import Scanner.ScannerAll;

public class Book {
    private String bookName;
    private String bookAuthor;
    private int bookYear;

    public Book(){
        this.bookName = null;
        this.bookAuthor = null;
        this.bookYear = 0;
    }

    public Book(String bookName, String bookAuthor, int bookYear) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        do {
            try {

                if (bookName.isEmpty()){
                    System.out.println("Vui lòng không để trống!");
                }else{
                    this.bookName = bookName;
                    break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }while (true);

    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    public  void displayBook(){
        System.out.println("Thông tin sách tìm thấy: "+bookName+", Tác giả: "+bookAuthor+", Năm xuất bản: "+bookYear);
    }

}
