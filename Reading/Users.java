public class Users {
    private String UsersID;
    private String UsersName;
    private String UsersType;

    //Constructors
    public Users() {

    }

    public Users(String UsersID, String UsersName, String UsersType) {
        this.UsersID = UsersID;
        this.UsersName = UsersName;
        this.UsersType = UsersType;
    }

    //Setters and getters
    public String getUsersName() {
        return this.UsersName;
    }

    public void setUsersName(String UsersName) {
        this.UsersName = UsersName;
    }

    public String getUsersID() {
        return this.UsersID;
    }

    public void setUsersID(String UsersID) {
        this.UsersID = UsersID;
    }

    public String getUsersType() {
        return this.UsersType;
    }

    public void setUsersType(String UsersType) {
        this.UsersType = UsersType;
    }

    public String toString() {
        return "{" +
            " UsersID='" + getUsersID() + "'" +
            ", UsersName='" + getUsersName() + "'" +
            ", UsersType='" + getUsersType() + "'" +
            "}";
    }
    

}