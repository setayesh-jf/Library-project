public class Book {
    private String title;
    private int pageCount;

    public Book(String title, int pageCount){
        if (title == null || title.isEmpty()){
            var exception = new IllegalArgumentException("Title cannot be empty");
            throw exception;
        }

        if (pageCount <= 0){
            var exception = new IllegalArgumentException("Page count must be positive");
            throw exception;
        }

        this.title = title;
        this.pageCount = pageCount;
    }

    public String getTitle(){
        return title;
    }

    public int getPageCount(){
        return pageCount;
    }

    @Override
    public String toString(){
        return  title + " (" + pageCount + " pages)";
    }
}
