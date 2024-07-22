
import java.util.Scanner;
public class RecipeOnBurner extends AbstractRecipe {
	@Override
	public void prepare() {
		System.out.println("Get raw materials");
		System.out.println("Get utensils");
	}

	@Override
	public void doTheDish() {
		System.out.println("Start the burner");
		System.out.println("Start cooking");
		System.out.println("Stop the burner");
	}

	@Override
	public void cleanUp() {
		System.out.println("Clean the utensils");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RecipeOnBurner recipe = new RecipeOnBurner();
		recipe.execute();

		System.out.println();
		sc.close();
	}

}
