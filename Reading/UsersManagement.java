public class UsersManagement extends Users {
    private String Reading;
    private int finishedReading;
    private boolean isReading = true;
    private boolean isFinishedReading = true;
    private String EBooksID;
    private int PageReached;
    

    //Constructors
    public UsersManagement() {

    }

    public UsersManagement(String Reading, int finishedReading, boolean isReading, boolean isFinishedReading, String EBooksID, int PageReached) {
        this.Reading = Reading;
        this.finishedReading = finishedReading;
        this.isReading = isReading;
        this.isFinishedReading = isFinishedReading;
        this.EBooksID = EBooksID;
        this.PageReached = PageReached;
    }


    //Setters and getters
    public String Reading() {
        return this.Reading;
    }

    public void setReading(String Reading) {
        this.Reading = Reading;
    }

    public int finishedReading() {
        return this.finishedReading;
    }

    public void setFinishedReading(int finishedReading) {
        this.finishedReading = finishedReading;
    }

    public String getEBooksID() {
        return this.EBooksID;
    }

    public void setEBooksID(String EBooksID) {
        this.EBooksID = EBooksID;
    }

    public boolean isReading() {
        if (this.Reading!=null) {
            return this.isReading;  //return yes if user is reading.
        }
        return false;
    }     
    
    public String getReading() {
        return this.Reading;
    }

    public int getFinishedReading() {
        return this.finishedReading;
    }

    public boolean isIsReading() {
        return this.isReading;
    }

    public boolean getIsReading() {
        return this.isReading;
    }

    public void setIsReading(boolean isReading) {
        this.isReading = isReading;
    }

    public boolean isIsFinishedReading() {
        return this.isFinishedReading;
    }

    public void getIsFinishedReading(boolean isFinishedReading) {
        this.isFinishedReading = isFinishedReading;
    }

    public void setIsFinishedReading(boolean isFinishedReading) {
        this.isFinishedReading = isFinishedReading;
    }

    public int getPageReached() {
        return this.PageReached;
    }

    public void setPageReached(int PageReached) {
        this.PageReached = PageReached;
    }

    //toString
    @Override
    public String toString() {
        return super.toString();
    }
}
