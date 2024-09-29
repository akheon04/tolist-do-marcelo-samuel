//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaEspecial contaEspecial = new ContaEspecial(500); // limite de R$ 500


        System.out.println("=== Conta Corrente ===");
        contaCorrente.depositar(1000);
        System.out.println("Saldo: R$ " + contaCorrente.verSaldo());
        contaCorrente.sacar(500);
        System.out.println("Saldo: R$ " + contaCorrente.verSaldo());


        System.out.println("\n=== Conta Especial ===");
        contaEspecial.depositar(200);
        System.out.println("Saldo: R$ " + contaEspecial.verSaldo());
        contaEspecial.sacar(600); // deve ser permitido, pois o limite é R$ 500
        System.out.println("Saldo: R$ " + contaEspecial.verSaldo());        System.out.println("\n=== Transferência ===");
        contaCorrente.transferir(contaEspecial, 200);
        System.out.println("Saldo Conta Corrente: R$ " + contaCorrente.verSaldo());
        System.out.println("Saldo Conta Especial: R$ " + contaEspecial.verSaldo());
        System.out.println(".");
    }
}