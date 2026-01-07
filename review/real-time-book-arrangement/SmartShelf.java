public class SmartShelf {
    public static void insertionSort(Book[] books) {
        for(int i = 1; i < books.length; i++) { // for loop to select each book one by one
            Book num = books[i]; // the book that is to be positioned correctly
            int j = i - 1; // the index of the previous book
            while(j >= 0 && books[j].getTitle().compareTo(num.getTitle()) > 0) { //comparing the titles to sort alphabetically.
                books[j + 1] = books[j]; // moving the book one position ahead.
                j--; // decrement j to continue checking previous books.
            }
            books[j + 1] = num; // inserting the book at its correct position.
        }
    }
}
