package entities;

public class Banco {
	private int id;
	public String name;
	private double saldo;
	
	public Banco(int id, String name, double saldo) {
		this.name = name;
		this.id = id;
		this.saldo = saldo;
	}

	
	
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double deposito(double deposito) {
		saldo+= deposito;
		return saldo;
	}
	
	public double saque(double saque) {
		saldo -= saque+5;
		return saldo;
	}
	@Override
	public String toString() {
		return "Account data:\nAccount" + id + ", name = " + name + ", saldo = $" + saldo;
	}
	
	
	
}
