package bytebank_encapsulado;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 222246);
		
		conta.setAgencia(-50);
		conta.setNumero(-330);
	}
}
