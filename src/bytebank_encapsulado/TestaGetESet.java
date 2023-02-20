package bytebank_encapsulado;

public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente rafael = new Cliente();
		//conta.titular = rafael;
		rafael.setNome("rafael lima");
		
		conta.setTitular(rafael);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		// agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
	}
}
