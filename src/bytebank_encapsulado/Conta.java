package bytebank_encapsulado;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular;
	
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
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}
