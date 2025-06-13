package nested.test;

public class Library {
    private Book[] book;
    public int bookCount;

    public Library(int booksize) {
        book = new Book[booksize];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        if(bookCount >= book.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
        else
        {
            book[bookCount++] = new Book(title, author);
        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for(int i = 0; i < book.length; i++)
        {
            System.out.println("도서 제목: " + book[i].title + ", 저자: " + book[i].author);
        }
    }

    public static class Book {
        public String title;
        public String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
