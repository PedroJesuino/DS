import javax.swing.JOptionPane;

public class Soma {

	public static void main(String[] args) {
		int numero1, numero2, somar;
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1�n�mero:"));
		
		numero2= Integer.parseInt(JOptionPane.showInputDialog("Digite o 2�n�mero: "));
		
		somar= numero1+numero2;
		
		JOptionPane.showMessageDialog(null, ("A somatoria dos n�meros ")+somar);
		

	}

}
