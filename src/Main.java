
public class Main {

	public static void main(String[] args) {
		Cliente marina = new Cliente();
		marina.setNome("Maria");
		
		Conta cc = new ContaCorrente(marina);
		Conta poupanca = new ContaPoupanca(marina);

		cc.depositar(1000);
		cc.transferir(900, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}