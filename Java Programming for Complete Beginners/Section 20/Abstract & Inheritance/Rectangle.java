
import java.util.Scanner;

public class Rectangle {

	int length;
	int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int Area() {
		return this.length * this.width;
	}

	public int perimeter() {
		return 2 * (this.length + this.width);
	}

	public void printStatus() {
		String str = String.format("Length = %d, Width = %d, Area = %d, Perimeter = %d", this.length, this.width,
				Area(), perimeter());
		System.out.println(str);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and width of rectangle");
		int length = sc.nextInt();
		int width = sc.nextInt();
		Rectangle obj = new Rectangle(length, width);
		obj.printStatus();

		sc.close();
	}

}
