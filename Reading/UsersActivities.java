import java.util.Scanner;
import java.util.ArrayList;

public class UsersActivities {
    Scanner sc = new Scanner(System.in);
        Users user = new Users();
        String EBookName = sc.nextLine();
        EBooks book = new EBooks();
        TypeOfBooks Types = new TypeOfBooks();
        ArrayList<Users> users = new ArrayList<Users>();
        ArrayList<EBooks> all = new ArrayList<EBooks>(); //Array of all the books in the database.
        ArrayList<EBooks> finished = new ArrayList<EBooks>(); //Array of all the finished reading EBooks.
        ArrayList<TypeOfBooks> TypeNames = new ArrayList<TypeOfBooks>(); //Create an array of the book's type's name.
    
    //Allow readers to share books that they have already read.
    public String ShareEbook() {
        
        //Check if the user is a Reader or not and check the book's name.
        if (user.getUsersType().equals("Reader") && EBookName != book.getEBooksName()) {
            System.out.println("Would you like to share your EBook?"); 
            System.out.println("1.Yes");
            System.out.println("2.No");
            int n = sc.nextInt();
            if (n == 1) {
                return EBookName + "Shared"; //Share the book.
            }
        }
        return "Book haven't been shared";  //Or not.
    }

    //Allow readers to order their favorite books.
    public String favoriteOrdering() {
        ArrayList<EBooks> favoriteOrdering = new ArrayList<EBooks>();
        EBooks book1 = new EBooks();
        //Check to add a new book to the favorites.
        for(int i = 0; i< favoriteOrdering.size();i++) {
            if(!book1.getEBooksName().equals(favoriteOrdering.get(i).getEBooksName())) {
                favoriteOrdering.add(book1);
                return "Favorite Book have been ordered";       //The book has been ordered.
            }
        }
        //The book has been ordered and already in the favorites list.
        return "Favorite Book have been ordered and this book has already been in the favorites list";
    }

    //Book recommend methods.
    public String MostCommonRecommend() {
        for(int i = 0 ;i < finished.size(); i++) {
            //Check if the book that being recommended is already read by the user.
            if(book.getEBooksName().equals(finished.get(i).getEBooksName())) {
                    return "You have already read" + finished.get(i).getEBooksName();
            }
        }
        return  "You might also want to read: " + book.getEBooksName();
        //Recommend if the book haven't been read yet.
    }

    //Method for the manager to get the number and the name for the type of the book.
    public void TypeOfBookManager() {
        int Type = 0;
        int maxType = 1000;
        for(int i = 0; i < maxType; i++) {
            //Check if the type has already exists or not.
            if(!Types.getTypeOfBooksName().equals(TypeNames.get(i).getTypeOfBooksName())) {
                Type++;
                System.out.println("Type number " + i + " is: " + Types.getTypeOfBooksName());
            }
        }
        System.out.println("Total type of book: " + Type);

    }


    //Check the number of readers.
    public void getNumberOfID() {
        int number = 0;
        for(int i = 0 ; i <users.size(); i++) {
                if (users.get(i).getUsersType().equals("Readers")) {
                    number++;
                }
        }
        System.out.println("Number of readers: " + number);

    }
}
