public class TypeOfBooks {
    private String EBookName;
    private String EBookID;
    private int NumberOfType;
    private String TypeOfBooksName;

    public TypeOfBooks() {

    }

    public TypeOfBooks(String EBookName, String EBookID, int NumberOfType, String TypeOfBooksName) {
        this.EBookName = EBookName;
        this.EBookID = EBookID;
        this.NumberOfType = NumberOfType;
        this.TypeOfBooksName = TypeOfBooksName;
    }

    public String getEBooksName() {
        return this.EBookName;
    }

    public void setEBooksName(String EBookName) {
        this.EBookName = EBookName;
    }

    public String getEBooksID() {
        return this.EBookID;
    }

    public void setEBooksID(String EBookID) {
        this.EBookID = EBookID;
    }

    public int getNumberOfType() {
        return this.NumberOfType;
    }

    public void setNumberOfType(int NumberOfType) {
        this.NumberOfType = NumberOfType;
    }

    public String getTypeOfBooksName() {
        return this.TypeOfBooksName;
    }

    public void setTypeOfBooksName(String TypeOfBooksName) {
        this.TypeOfBooksName = TypeOfBooksName;
    }

    public String toString() {
        return "{" +
            " EBookName='" + getEBooksName() + "'" +
            ", EBookID='" + getEBooksID() + "'" +
            ", NumberOfType='" + getNumberOfType() + "'" +
            ", TypeOfBooksName='" + getTypeOfBooksName() + "'" +
            "}";
    }

}
