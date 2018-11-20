public class Main {
    @SuppressWarnings("Deprecated") //would do this for easy fix//
    public static void main(String[] args) {
        Author author = new Author("Sandi", "Metz");

        author.addBook("Practical Object-Oriented Design in Ruby");
        author.addBook("99 Bottles of OOP");

        for (String book: author.getBooks()) { //changed from getbooks but can just change and supressedwarning de//
            System.out.println(book);
        }
    }
}
