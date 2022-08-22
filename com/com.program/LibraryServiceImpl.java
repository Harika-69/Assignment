public class LibraryServiceImpl {
    String getBookName(String bookId){
        if(bookId == "101")
            return "The girl in room 105";
        else
            return "Invalid student Id";
    }
}
class BookServiceImpl extends LibraryServiceImpl{
    @Override
    String getBookName(String bookId) {
        String bookName = super.getBookName(bookId);
        return bookName;
    }
}
class Book3Main {
    public static void main(String args[]){
        LibraryServiceImpl libraryServiceImpl = new LibraryServiceImpl();
        System.out.println(libraryServiceImpl.getBookName(bookId:"101"));
          BookServiceImpl bookServiceImpl =new BookServiceImpl();
           System.out.println(bookServiceImpl.getBookName(bookId:"101"));
    }

}