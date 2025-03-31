package viewPilha03;

import ListaPilha03Controller.controllerPilha;

public class Principal {
	
    public static void main(String[] args) {
        int[] vetor = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};

        controllerPilha controller = new controllerPilha();
        controller.executarPilhaInt(vetor);  // Passa o vetor como argumento
    }
}
