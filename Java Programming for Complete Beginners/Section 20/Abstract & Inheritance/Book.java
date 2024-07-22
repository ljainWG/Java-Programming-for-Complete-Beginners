
import java.util.ArrayList;

public class Book {

	int id;
	String author, Title;
	ArrayList<BookReview> reviews = new ArrayList<BookReview>();

	public Book(int id, String author, String title) {
		super();
		this.id = id;
		this.author = author;
		Title = title;
	}

	public void addReview(BookReview... review) {

		for (BookReview r : review) {
			this.reviews.add(r); // review is argument and reviews is class variable
		}

	}

	@Override
	public String toString() {
		return String.format(" Book Id : %d\n Author : %s\n Title : %s\n Reviews of book : \n%s", this.id, this.author,
				this.Title, this.reviews);
	}

	public static void main(String[] args) {
		// Auto-generated method stub
		Book book1 = new Book(101, "Ranga", "OOPS in Java");
		BookReview book1review1 = new BookReview(1, "Lakshay", "Great Course", (byte) 4);
		BookReview book1review2 = new BookReview(2, "Akshay", "Great Course for Beginners", (byte) 3);
		book1.addReview(book1review1, book1review2);
		System.out.println(book1);
	}

}
