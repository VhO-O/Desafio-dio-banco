package banco;

import banco.cliente.Cliente;
import banco.metodos.Conta;
import banco.metodos.ContaCorrente;
import banco.metodos.ContaPoupanca;

public class Main {
    public static void main(String [] args){
        Cliente victor = new Cliente();
        victor.setNome("Victor");

        Conta corrente = new ContaCorrente(victor);
        Conta poupanca = new ContaPoupanca(victor);

        corrente.depositar(100);
        corrente.transferir(50, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
