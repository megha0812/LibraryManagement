import java.util.ArrayList;
import java.util.Scanner;
public class Library{
  private static ArrayList<String> books =  new ArrayList<>();
  public static void addBook(String book){
    books.add(book);
    System.out.println("Book added: " + book);
  }
  public static void viewBooks(){
    if (books.isEmpty()){
      System.out.println("No books in Library.");
    } else {
      System.out.println("Books in Library:");
      for (int i=0; i< books.size(); i++){
        System.out.println(i+1) + ". " + books.get(i));
      }
    }
  }

public static void searchBook(String keyword){
  boolean found = false;
  for (String book : books){
    if(book.toLowerCase().contains(keyword.toLowerCase())) {
      System.out.println("Found: " + book);
      found = true;
    }
  }
  if (!found) System.out.println("No matching book found.");
}

public Static void main(String[] args) {
  Scanner sc = new Scanner (System.in);
  int choice;
  do{
    System.out.println("\nLibrary Management System");
    System.out.println("1. Add Book");
    System.out.println("2. View Books");
    System.out.println("3. Search Book");
    System.out.println("4. Exit");
    System.out.println("Enter Choice: ");
    choice = sc.nextInt();
    sc.nextInt();

    switch(choice) {
      case 1: 
        System.out.println("Enter Book Name: ");
        String name = sc.nextLine();
        addBook(name);
        break;
      case 2: 
        viewBooks();
        break;
      case 3: 
        System.out.println("Enter Search keyword: ");
        String keyword = sc.nextLine();
        searchBook(keyword);
        break;
      case 4: 
        System.out.println("Exiting program.");
        break;
      default: 
        System.out.println("Invalid choice. Try Again.");
    }
  } while (choice != 4);
  sc.close();
}
}  
  
  
