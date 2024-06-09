public class Main {
	public static void main(String[] args) {
		Cliente guilherme = new Cliente();
		guilherme.setNome("Guilherme Silva");
		Conta cc = new ContaCorrente(guilherme);
		cc.depositar(100);
		
		Conta cp = new ContaPoupanca(guilherme);
		cc.transferir(100, cp);

		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
