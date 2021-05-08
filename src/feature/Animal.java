package feature;

public class Animal {

	private String name;
	private Float lenght;
	private Integer numberLegs;
	private String color;
	private String environment;
	private Float averageSpeed;

	public Animal(String name, Float lenght, Integer numberLegs, String color, String environment, Float averageSpeed) {
		this.name = name;
		this.lenght = lenght;
		this.numberLegs = numberLegs;
		this.color = color;
		this.environment = environment;
		this.averageSpeed = averageSpeed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getLenght() {
		return lenght;
	}

	public void setLenght(Float lenght) {
		this.lenght = lenght;
	}

	public Integer getNumberLegs() {
		return numberLegs;
	}

	public void setNumberLegs(Integer numberLegs) {
		this.numberLegs = numberLegs;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public Float getAverageSpeed() {
		return averageSpeed;
	}

	public void setAverageSpeed(Float averageSpeed) {
		this.averageSpeed = averageSpeed;
	}

	public String data() {
		return "nome: " + getName() + "\n" + "comprimento: " + getLenght() + "\n" + "numero de patas: "
				+ getNumberLegs() + "\n" + "cor: " + getColor() + "\n" + "ambiente: " + getEnvironment() + "\n"
				+ "velocidade média: " + getAverageSpeed();
	}

}
