package program;

import feature.Animal;
import feature.Fish;
import feature.Mammal;

public class application {

	public static void main(String[] args) {
		String name = "Camelo";
		float lenght = 150;
		Integer numberLegs = 4;
		String color = "Amarelo";
		String environment = "Terra";
		float averageSpeed = 2;
		Animal camelo = new Mammal(name, lenght, numberLegs, color, environment, averageSpeed, "Cacto");
		name = "Tubarão";
		lenght = 300;
		numberLegs = 0;
		 color = "Cinzento";
		environment = "Mar";
		averageSpeed = (float)1.5;
		Animal tubarao = new Fish(name, lenght, numberLegs, color, environment, averageSpeed, "Barbatanas e cauda");
		
		System.out.println(camelo.data() + "\n");
		System.out.println(tubarao.data() + "\n");
		
		
		

	}

}
