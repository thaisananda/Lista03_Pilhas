package ListaPilha03Controller;

import model.Pilha;

public class controllerPilha {
	
	public controllerPilha() {
		super();
	}
	
	public void executarPilhaInt(int[] vetor) {
        try {
            Pilha pilha = new Pilha();

            for (int valor : vetor) {
                if (valor >= 0) {
                    pilha.push(valor);
                } else {
                    if (!pilha.isEmpty()) {
                        int a = pilha.pop();
                        int b = pilha.pop();
                        int soma = a + b;

                        pilha.push(valor);
                        pilha.push(soma);
                    }
                }
            }

            int count = 0;
            while (!pilha.isEmpty()) {
                pilha.pop();
                count++;
            }

            System.out.println("Quantidade de elementos na pilha: " + count);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}