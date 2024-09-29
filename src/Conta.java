// Classe base Conta
class Conta {
    protected double saldo;

    public Conta() {
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Saque inválido. Saldo atual: R$ " + saldo);
        }
    }

    public double verSaldo() {
        return saldo;
    }

    public void transferir(Conta contaDestino, double valor) {
        if (valor > 0 && valor <= saldo) {
            sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " realizada.");
        } else {
            System.out.println("Transferência inválida. Saldo atual: R$ " + saldo);
        }
    }
}
