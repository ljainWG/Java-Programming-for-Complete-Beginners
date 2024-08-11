
abstract public class AbstractRecipe {
	public void execute() {
		prepare();
		doTheDish();
		cleanUp();
	}

	abstract public void prepare();

	abstract public void doTheDish();

	abstract public void cleanUp();
}
