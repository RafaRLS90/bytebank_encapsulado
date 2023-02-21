package bytebank_encapsulado;

//Além de termos um método que devolve qual é o numero de uma conta,
//queremos também um método que altere esse mesmo numero. 
//Esse tipo de método é chamado de set.

public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 222246);
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
		
		
		System.out.println(titularDaConta);
		System.out.println(rafael);
		System.out.println(conta.getTitular());
	}
}
