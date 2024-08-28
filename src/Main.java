//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456", 1000);

        cuenta.depositar(500);
        System.out.println("Depósito exitoso. Nuevo saldo: " + cuenta.getSaldo());

        cuenta.retirar(200);
        System.out.println("Retiro exitoso. Nuevo saldo: " + cuenta.getSaldo());

        cuenta.retirar(2000);

        cuenta.bloquearCuenta();
        cuenta.depositar(100); // Esto debería lanzar una CuentaBloqueadaException (unchecked)
    }

}