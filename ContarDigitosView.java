package view;
import javax.swing.JOptionPane;
import controller.ContarDigitosController;

public class ContarDigitosView {

	public static void main(String[] args) {
		ContarDigitosController dc = new ContarDigitosController();
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        System.out.println("Quantidade de dígitos: " + dc.contaDigitos(Math.abs(n)));
	}
}