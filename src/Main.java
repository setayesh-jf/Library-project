public class Main {
    public static void main(String[] args)  {
    Library library = new Library();

    try {
        library.addBook(new Book("The Art Of Thinking Clearly" , 500));
    } catch (InvalidBookException e) {
        System.out.println(e.getMessage());
    }

    try {
        library.addBook(null);
    } catch (InvalidBookException e) {
        System.out.println(e.getMessage());
    }

    try {
        library.listBooks();
    } catch (EmptyLibraryException e) {
        System.out.println(e.getMessage());
    }

    try {
        library.borrowBook("The Dark Side Of the Light Chasers book");
    } catch (BookNotFoundException e) {
        System.out.println(e.getMessage());
    }catch (EmptyLibraryException e){
        System.out.println(e.getMessage());
    }

    try {
        library.borrowBook("The Art Of Thinking Clearly");
    } catch (BookNotFoundException e) {
        System.out.println(e.getMessage());
    }catch (EmptyLibraryException e){
        System.out.println(e.getMessage());
    }

    try {
        library.returnBook("The Dark Side Of the Light Chasers book");
    } catch (BookNotFoundException e) {
        System.out.println(e.getMessage());
    }

    try {
        library.returnBook("The Art Of Thinking Clearly");
    } catch (BookNotFoundException e) {
        System.out.println(e.getMessage());
    }

    }
}