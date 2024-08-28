# Ejercicio: Manejo de Excepciones en Java - Sistema de Cuenta Bancaria

##Contexto
Imaginen que están desarrollando un sistema básico para un banco. 
El sistema debe manejar cuentas bancarias, permitiendo depósitos, retiros y bloqueos de cuenta,
pero también debe ser capaz de manejar situaciones excepcionales de manera segura y informativa.
## Tareas

### 1. Implementación de la Clase CuentaBancaria
Crea una clase `CuentaBancaria` con:
- Atributos:
  - `saldo` (double)
  - `numeroCuenta` (String)
  - `bloqueada` (boolean)
- Constructor
- Métodos:
  - `depositar(double monto)`
  - `retirar(double monto)`
  - `bloquearCuenta()`
  - `getSaldo()`

### 2. Creación de Excepciones Personalizadas
- Crea `SaldoInsuficienteException` (checked)
- Crea `CuentaBloqueadaException` (unchecked)

### 3. Implementación de la Lógica y Manejo de Excepciones
Implementa la lógica de negocio en los métodos, incluyendo:
- Lanzamiento de `IllegalArgumentException`
- Uso de `SaldoInsuficienteException` y `CuentaBloqueadaException`
- Simulación de `IOException` en `guardarEstadoCuenta()`

### 4. Método Main para Pruebas
Desarrolla un método `main` que:
- Cree una instancia de `CuentaBancaria`
- Realice varias operaciones (depósitos, retiros, bloqueo)
- Utilice bloques try-catch para manejar excepciones
- Demuestre el uso del bloque finally

## Recursos Adicionales
- [Oracle: Lecciones sobre Excepciones](https://docs.oracle.com/javase/tutorial/essential/exceptions/)
- [Baeldung: Checked vs Unchecked Exceptions](https://www.baeldung.com/java-checked-unchecked-exceptions)

