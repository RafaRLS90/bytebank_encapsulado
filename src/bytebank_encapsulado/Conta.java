package bytebank_encapsulado;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta" + this.numero);
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
	if(this.saldo >= valor) {
		this.saldo = this.saldo -= valor;
		return true;
	 }else {
		return false;
	 }
	}
	
	public boolean transferir(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
			}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("nao pode, valor <= 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("nao pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}
