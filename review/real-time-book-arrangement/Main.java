public class Main {
    public static void main(String[] args) {
        Book[] books = { // adding the sample books to the array
            new Book("One indian girl", "Chetan Bhagat", 2016),
            new Book("Atomic Habits", "James Clear", 2018),
            new Book("The monk who sold his ferrari", "Robin Sharma", 1997),
            new Book("The subtle art of not giving a f*ck", "Mark Manson", 2016),
        };
        SmartShelf.insertionSort(books); // calling the insertion sort method to sort the books by title.

        System.out.println("Books sorted by title:");
        for(Book book : books) { // for each loop to print the sorted books.
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getYear() + ")");
        }
    }
}
