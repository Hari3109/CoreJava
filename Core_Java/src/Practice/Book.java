package Practice;

public class Book {
 String title;
 Author author;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public Book(String title, Author author) {
	super();
	this.title = title;
	this.author = author;
}
 
}
