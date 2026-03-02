package controller;

public class ContarDigitosController {

	public ContarDigitosController() {
		super();
	}
	
	public int contaDigitos(int n) {
        //CONDIÇÃO DE PARADA
        if (n < 10) {
            return 1;
        }
        //CHAMADA RECURSIVA
        return 1 + contaDigitos(n / 10);
    }
}