package Chapter2Labs.BookLab;
public class BookRunner {

    public static void main(String[] args) {
        // Create a book with the default constructor.
        Book textBook = new Book();
        // Q: What does this line do?
        // A: It implicitly calls textBook.toString() and prints that String to the console.
        System.out.println(textBook);

        // Change the name using a mutator method.
        textBook.setName("Default Constructor Book");
        // Q: What method did you use to change the name? What type of method is this?
        // A: setName is a mutator (modifier) method because it updates the object's state.
        textBook.setIsbn(111111111);

        // Q: Call the getName() method after changing the name of the book.
        textBook.getName();
        // Q: Did anything print in the output screen? Why or why not?
        // A: Nothing printed because getName() returns a String but we did not print or store it.
        // Q: What do you want to keep in mind when calling a return method if you want to see what it returns?
        // A: Capture the return value in a variable or print it directly.
        // Q: What type of method is getName()?
        // A: An accessor method because it returns information without changing the object.
        System.out.println("Accessor check -> name: " + textBook.getName());

        // Create a new book using the initialization constructor.
        Book novel = new Book("Initialization Constructor Book", 222222222);
        System.out.println(novel); // explicit toString() call is optional here

        // Change the name and ISBN for both books, then display the updated information using accessors.
        textBook.setName("Java Fundamentals");
        textBook.setIsbn(333333333);
        novel.setName("Creative Coding");
        novel.setIsbn(444444444);
        System.out.println("Updated via accessors -> name: " + textBook.getName() + ", isbn: " + textBook.getIsbn());
        System.out.println("Updated via accessors -> name: " + novel.getName() + ", isbn: " + novel.getIsbn());

        // In the BookRunner main() method create a local String variable and a local int variable.
        // Use TakeInput twice to initialize these variables and then create a new Book with these variables.
        String userBookName = TakeInput.getString("Enter the name of a book: ");
        int userBookIsbn = TakeInput.getInt("Enter the ISBN number for that book: ");
        Book userBook = new Book(userBookName, userBookIsbn);

        // Q: Can you create the new Book using TakeInput without using a local variable?
        // A: Yes, but using local variables makes the code easier to read and reuse.
        Book directBook = new Book(
                TakeInput.getString("Enter another book name (constructed directly): "),
                TakeInput.getInt("Enter the ISBN for the direct book: ")
        );

        // Call the toString() method for all the books.
        // Q: What are the two ways to call a toString() method?
        // A: (1) Call System.out.println(book); (implicit). (2) Call System.out.println(book.toString()); (explicit).
        System.out.println(textBook);
        System.out.println(novel.toString());
        System.out.println(userBook);
        System.out.println(directBook.toString());

        // Show the output using SimpleOutput as well.
        SimpleOutput.show(textBook.toString());
        SimpleOutput.show(novel.toString());
        SimpleOutput.show(userBook.toString());
        SimpleOutput.show(directBook.toString());
    }
}
