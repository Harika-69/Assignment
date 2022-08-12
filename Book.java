class Book
{
 int bookId=240;
 static String bookName="Harry potter";
 int bookPrice=900;
 String Author="j.k.rowling";
 public class Library
{
    public void SearchBook(){
   System.out.println(bookId+"240");
   System.out.println(bookName+"Harry potter");
   System.out.println(Author+"j.k.rowling");
   System.out.println(bookPrice+"900");
}
public static void main(String[]args)
{
  Book b=new Book();
  b.bookId();
  b.bookName();
  b.bookPrice();
  b.Author();
}
}

    private void bookPrice() {
    }

    private void bookId() {

    }

    private void bookName() {
    }

    private void Author() {
    }
}

