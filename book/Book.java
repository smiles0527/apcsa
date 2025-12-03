package book;

/**
 * Chapter 2 Book Lab - Book class implementation.
 *
 * Answers to the reflection questions from the lab instructions are provided
 * in the comments located next to the relevant code.
 */
public class Book {

    // Q: What should the name of this class be?
    // A: The class should be named Book so that it matches the file name Book.java
    //    and clearly represents the object this class models.

    // Q: What access do these variables require (private or public)? Why?
    // A: private - to keep the fields encapsulated so that outside classes must
    //    use the public methods to interact with the data in a controlled way.
    // Q: Do you need to assign default values when declaring these variables? Why?
    // A: No - Java will assign default values (null for objects, 0 for ints) and
    //    our constructors will set meaningful defaults or specific values later.
    private String name;
    private int isbn;

    // Q: What name did you use for the constructor?
    // A: Book - constructors must match the class name.
    // Q: What should happen inside the default constructor?
    // A: Assign safe default values to the fields so the object starts in a known state.
    // Q: What are good default values for these two variables?
    // A: An empty String and 0 work well to show "no name" / "no ISBN" yet.
    public Book() {
        this.name = "";
        this.isbn = 0;
    }

    // Q: What should happen inside the initialization constructor?
    // A: Use the parameter values to initialize the fields.
    // Q: Remember to put the instance variables on the left side of the assignment operator,
    //    and the values being passed in as parameters on the right side.
    // Q: What is the difference in values assigned when you call the different constructors?
    // A: The default constructor uses the safe defaults above; this constructor uses the
    //    caller-provided values so that every new Book can start with real data.
    public Book(String name, int isbn) {
        this.name = name;
        this.isbn = isbn;
    }

    // Q: What is the return type for a modifier (mutator) method?
    // A: void - the method changes state but does not return a value.
    // Q: How many arguments should you pass into each method?
    // A: Exactly one argument for each field we want to modify.
    // Q: What is the datatype of the argument passed in?
    // A: It matches the field type (String for name, int for isbn).
    public void setName(String newName) {
        this.name = newName;
    }

    public void setIsbn(int newIsbn) {
        this.isbn = newIsbn;
    }

    // Q: What is the return type for an accessor method?
    // A: The accessor returns the datatype of the field it accesses.
    // Q: How many arguments should be passed into an accessor method?
    // A: Zero - accessors do not require extra data.
    public String getName() {
        return name;
    }

    public int getIsbn() {
        return isbn;
    }

    // Q: What is the return type of the toString() method?
    // A: String - it should return a textual summary of the object.
    // Q: What is the purpose of the toString() method?
    // A: Provide a readable description of the object, useful for printing or logging.
    @Override
    public String toString() {
        return "Book{name='" + name + "', isbn=" + isbn + "}";
    }
}


