
public class BookReview {

	int id;
	String reviewername;
	String review;
	byte rating; // 0 to 5

	@Override
	public String toString() {
		return String.format("[Review Id : %d, Reviewer\'s name : %s, Review : %s, Rating : %d]\n", id, reviewername,
				review, rating);
	}

	public BookReview(int id, String reviewername, String review, byte rating) {
		super();
		this.id = id;
		this.reviewername = reviewername;
		this.review = review;
		this.rating = rating;
	}

}
