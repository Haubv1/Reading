import java.util.*;
public class EBooks {
    private String EBooksName;
    private String Author;
    private Date PublishDate;
    private String HireCost;
    private int NumberOfReaders;

    //Constructors

    public EBooks() {
    }

    public EBooks(String EBooksName) {
        this.EBooksName = EBooksName;
    }
    public EBooks(String EBooksName, String Author, Date PublishDate, String HireCost, int NumberOfReaders) {
        this.EBooksName = EBooksName;
        this.Author = Author;
        this.PublishDate = PublishDate;
        this.HireCost = HireCost;
        this.NumberOfReaders = NumberOfReaders;
    }

    //Setters and getters
    public String getEBooksName() {
        return this.EBooksName;
    }

    public void setEBooksName(String EBooksName) {
        this.EBooksName = EBooksName;
    }

    public String getAuthor() {
        return this.Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public Date getPublishDate() {
        return this.PublishDate;
    }

    public void setPublishDate(Date PublishDate) {
        this.PublishDate = PublishDate;
    }

    public String getHireCost() {
        return this.HireCost;
    }

    public void setHireCost(String HireCost) {
        this.HireCost = HireCost;
    }

    public int getNumberOfReaders() {
        return this.NumberOfReaders;
    }

    public void setNumberOfReaders(int NumberOfReaders) {
        this.NumberOfReaders = NumberOfReaders;
    }

    @Override
    public String toString() {
        return "{" +
            " EBooksName='" + getEBooksName() + "'" +
            ", Author='" + getAuthor() + "'" +
            ", PublishDate='" + getPublishDate() + "'" +
            ", HireCost='" + getHireCost() + "'" +
            "}";
    }

}
