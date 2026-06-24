//class 1
class Book{
    String name;
    int pages;
    Book(String name, int pages){
        this.name = name;
        this.pages=pages;
        this.display();
    }
    void display(){
        System.err.printf("%s is the book with the no of %d pages \n",this.name,this.pages);
    }
}
//class 2 but is using the obj of class 1
class Library{
       Book books;
       Library(Book books){
        this.books = books;
        books.display();
       }
}

public class Aggregation {
    public static void main(String[] args){
        Book books = new Book("Java",12); 
        Library library = new Library(books);
    }
}
/*
Aggregation
--> It shows the relationship between objects
--> One object contains another object 
but can exist independently 
*/