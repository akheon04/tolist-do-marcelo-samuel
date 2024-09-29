class ContaCorrente extends Conta {
    public ContaCorrente() {
        super();
    }
}

// Classe ContaEspecial
class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(double limite) {
        super();
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && (valor <= saldo + limite)) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Saque inválido. Saldo atual: R$ " + saldo + ", limite: R$ " + limite);
        }
    }
}
