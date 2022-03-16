package BancoDigital;

public class Main {
    public static void main(String[] args) {

        Cliente marcelo = new Cliente();
        marcelo.setNome("Marcelo");

        Cliente amanda = new Cliente();
        amanda.setNome("Amanda");

        Cliente alicia = new Cliente();
        alicia.setNome("Alícia");



        Conta cc1 = new ContaCorrente(marcelo);
        Conta poupanca1 = new ContaPoupanca(marcelo);

        Conta cc2 = new ContaCorrente(amanda);
        Conta poupanca2 = new ContaPoupanca(amanda);

        Conta cc3 = new ContaCorrente(alicia);
        Conta poupanca3 = new ContaPoupanca(alicia);

        cc1.depositar(100);

        cc1.transferir(100, poupanca1);

        cc1.cabecaExtrato();
        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();

        cc2.cabecaExtrato();
        cc2.imprimirExtrato();
        poupanca2.imprimirExtrato();

        cc3.cabecaExtrato();
        cc3.imprimirExtrato();
        poupanca3.imprimirExtrato();

    }
}
