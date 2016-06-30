package lesson09;

/**
 * Created by lapte on 21.05.2016.
 */
public class Book5 {
    private int id;
    private String title;
    private String author;
    private String publishingOffice;
    private int yearOfPublishing;
    private int numberOfPages;
    private int price;
    private boolean hardCover;


    public Book5(int id, String title,
                 String author, String publishingOffice,
                 int yearOfPublishing, int numberOfPages,
                 int price, boolean hardCover) {
        setId(id);
        setTitle(title);
        setAuthor(author);
        setPublishingOffice(publishingOffice);
        setYearOfPublishing(yearOfPublishing);
        setNumberOfPages(numberOfPages);
        setPrice(price) ;
        setHardCover(hardCover);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingOffice() {
        return publishingOffice;
    }

    public void setPublishingOffice(String publishingOffice) {
        this.publishingOffice = publishingOffice;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isHardCover() {
        return hardCover;
    }

    public void setHardCover(boolean hardCover) {
        this.hardCover = hardCover;
    }


    @Override
    public String toString() {
        return "Book5{" +
                " id=" + getId() +
                ", title= " + getTitle() +
                ", author= " + getAuthor() +
                ", publishingOffice= " + getPublishingOffice() +
                ", yearOfPublishing= " + getYearOfPublishing() +
                ", numberOfPages= " + getNumberOfPages() +
                ", price= " + getPrice() +
                ", hardCover= " + isHardCover() +
                '}';
    }
}
