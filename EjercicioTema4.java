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
    }
}
