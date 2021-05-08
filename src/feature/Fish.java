package feature;

public class Fish extends Animal {
	private String feature;

	public Fish(String name, Float lenght, Integer numberLegs, String color, String environment, Float averageSpeed,
			String feature) {
		super(name, lenght, numberLegs, color, environment, averageSpeed);
		this.feature = feature;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	@Override
	public String data() {
		return "nome: " + getName() + "\n" + "caracteristica: " + getFeature() + "\n" + "comprimento: " + getLenght() + "\n"
				+ "numero de patas: " + getNumberLegs() + "\n" + "cor: " + getColor() + "\n" + "ambiente: "
				+ getEnvironment() + "\n" + "velocidade média: " + getAverageSpeed();
	}

}
