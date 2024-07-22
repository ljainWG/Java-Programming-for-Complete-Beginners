
import java.util.Scanner;

public class RecipeOnOven extends AbstractRecipe {
	@Override
	public void prepare() {
		System.out.println("Get raw materials");
		System.out.println("Get utensils");
	}

	@Override
	public void doTheDish() {
		System.out.println("Start oven");
		System.out.println("Start baking");
		System.out.println("Stop oven");
	}

	@Override
	public void cleanUp() {
		System.out.println("Clean the utensils and oven");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RecipeOnOven recipe = new RecipeOnOven();
		recipe.execute();

		System.out.println();
		sc.close();
	}

}
