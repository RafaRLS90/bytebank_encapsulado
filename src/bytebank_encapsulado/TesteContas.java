package bytebank_encapsulado;

public class TesteContas {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 233344);
		
		conta.depositar(200);
		
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(570);
		
		System.out.println(conta.getAgencia());
		
		System.out.println("o total de contas é : "+Conta.getTotal());
	}
}
