package feature;

public class Mammal extends Animal {
	private String food;

	public Mammal(String name, Float lenght, Integer numberLegs, String color, String environment, Float averageSpeed,
			String food) {
		super(name, lenght, numberLegs, color, environment, averageSpeed);
		this.food = food;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	@Override
	public String data() {
		return "nome: " + getName() + "\n" + "alimento: " + getFood() + "comprimento: " + getLenght() + "\n"
				+ "numero de patas: " + getNumberLegs() + "\n" + "cor: " + getColor() + "\n" + "ambiente: "
				+ getEnvironment() + "\n" + "velocidade média: " + getAverageSpeed();
	}
}
