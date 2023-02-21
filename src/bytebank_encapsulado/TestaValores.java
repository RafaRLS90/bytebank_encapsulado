package bytebank_encapsulado;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 222246);
		
		Conta conta2 = new Conta(1337, 165499);
		
		System.out.println(Conta.getTotal());
	}
}
