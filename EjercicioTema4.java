public class EjerciciosTema4 {
    public static void main(String[] args) {
	// primera parte
	int numeroIf = 3;
	if (numeroIf > 0) {
	    System.out.println("Es positivo");
	} else if (numeroIf < 0) {
	    System.out.println("Es negativo");
	} else {
	    System.out.println("Es nulo (0)");
	}

	// segunda parte
	int numeroWhile = -1;
	while (numeroWhile < 3) {
	    numeroWhile++;
	    System.out.println(numeroWhile);
	}

	// tercera parte
	int numeroDoWhile = -1;
	do {
	    numeroDoWhile++;
	    System.out.println(numeroDoWhile);
	} while (numeroDoWhile > 3);

	// cuarta parte
	for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
	    System.out.println(numeroFor);
	}

	// quinta parte
	var estacion = "invierno";

	switch(estacion) {
	    case "invierno":
		System.out.println("Qué bueno, es Invierno!");
		break;
	    case "otoño":
		System.out.println("Es Otoño!");
		break;
	    case "verano":
		System.out.println("Qué mal, es Verano");
		break;
	    case "primavera":
		System.out.println("Qué mal, es Primavera");
		break;
	    default:
		System.out.println("El valor de la variable no es una estación");
	}
    }
}
