public class CuentaBancaria {
    private double saldo;
    private String numeroCuenta;
    private boolean bloqueada;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.bloqueada = false;
    }

    public void depositar(double monto) throws IllegalArgumentException {

    }

    public void retirar(double monto) throws IllegalArgumentException {

    }

    public void bloquearCuenta() {
        this.bloqueada = true;
    }

    public double getSaldo() {
        return this.saldo;
    }
}