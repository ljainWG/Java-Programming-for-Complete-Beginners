public class Book {
	private int noOfCopies;

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	void incCopies(int howMuch) {
		this.noOfCopies += howMuch;
	}

	void decCopies(int howMuch) {
		if (this.noOfCopies - howMuch > 0) {
			this.noOfCopies -= howMuch;
		}

	} 
  public static void main(String[] args) {
		Book art_of_CP = new Book();
		Book clean_code = new Book();

		art_of_CP.incCopies(35);
		int copies = art_of_CP.getNoOfCopies();
		System.out.println(copies);
		clean_code.decCopies(50);

	}
}
