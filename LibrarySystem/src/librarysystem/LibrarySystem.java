/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarysystem;

/**
 *
 * @author MusaPama
 */

public class LibrarySystem 
{
    public static void main(String[] args) 
    {
        Library library = new Library();

        // Adding some books
        library.addBook(new Book("Programming 731", "Jemina", "123456789", 5));
        library.addBook(new Book("HCI 700", "Jealous", "987654321", 3));
        library.addBook(new Book("AFI 700", "Princess", "456789123", 2));

        
        // Displaying all available books
        library.displayAvailableBooks();
    }
} 