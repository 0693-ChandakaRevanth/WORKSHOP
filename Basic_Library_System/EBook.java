package Basic_Library_System;
interface Book{
    String getTitle();
    String getAuthor();
    String getType();
}
class EBook implements Book {
    private String title, author, type = "EBook";
    public EBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getTitle() { return title; }

    @Override
    public String getAuthor() { return author; }

    @Override
    public String getType() { return type; }
    @Override
    public String toString() {
        return title + " by " + author + " (" + type + ")"; }
}
class PrintedBook implements Book {
    private String title, author, type = "PrintedBook";
    public PrintedBook(String title, String author) {
        this.title = title;
        this.author = author;
    }
    @Override
    public String getTitle() { return title; }
    @Override
    public String getAuthor() { return author; }
    @Override
    public String getType() { return type; }
    @Override
    public String toString() { return title + " by " + author + " (" + type + ")"; }
}