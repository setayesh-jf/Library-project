import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(){
       books = new ArrayList<>();
    }

    public void addBook(Book book) throws InvalidBookException {
        if (book == null) {
            throw new InvalidBookException("Book should not be null.");
        }

        books.add(book);
    }

        private Book findBook(String title){
            for (Book book : books){
                if (book.getTitle().equals(title)){
                    return book;
                }
            }
            return null;
        }

    public void borrowBook(String title) throws BookNotFoundException,EmptyLibraryException {
        if (books == null || books.isEmpty()) {
            throw new EmptyLibraryException("Library is empty, no books to borrow");
        }

        Book bookLent = findBook(title);
        if (bookLent == null) {
            throw new BookNotFoundException("Book with title \" + title + \" not found.");
        }

        System.out.println("The book was successfully lent" + bookLent.toString());
    }

    public void returnBook(String title) throws BookNotFoundException{
        Book bookReturn = findBook(title);
        if (bookReturn == null){
            throw new BookNotFoundException("Cannot return. Book with title \"+ title + \" not found.");
        }

        System.out.println("The book has been successfully returned" + bookReturn.toString());
    }

    public void listBooks() throws EmptyLibraryException{
        if (books.isEmpty()){
            throw new EmptyLibraryException("Library is empty");
        }

        System.out.println("Books in the library:");
        for (Book book : books){
            System.out.println(book.toString());
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

}
