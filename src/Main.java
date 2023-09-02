// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        CuentaAhorro cuentaAhorro1 = new CuentaAhorro(15000, 10);
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(20000, 10);

        cuentaAhorro1.consignar(5000);
        cuentaAhorro1.informacion();
        cuentaAhorro1.consignar(5000);
        cuentaAhorro1.informacion();
        cuentaAhorro1.calcularInteresMensual();
        cuentaAhorro1.informacion();
        cuentaAhorro1.retirarDinero(5000);
        cuentaAhorro1.informacion();

        System.out.println("------");
        cuentaCorriente1.consignar(5000);
        cuentaCorriente1.informacion();
        cuentaCorriente1.consignar(5000);
        cuentaCorriente1.informacion();
        cuentaCorriente1.calcularInteresMensual();
        cuentaCorriente1.informacion();
        cuentaCorriente1.retirarDinero(35000);
        cuentaCorriente1.informacion();


    }
}