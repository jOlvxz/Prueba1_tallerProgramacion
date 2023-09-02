public class CuentaAhorro extends Cuenta{

    public boolean active;
    public CuentaAhorro(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if (saldo >= 15000){
            this.active = true;
        }
    }

    @Override
    public void consignar(float cantidadDinero) {
        if(this.active) {
            super.consignar(cantidadDinero);
        }
    }

    @Override
    public void retirarDinero(float cantidadDinero) {
        if(this.active) {
            super.retirarDinero(cantidadDinero);
        }
    }

    public void imprimir(){
        int transaccionesRealizadas = super.numeroRetiros + super.getNumeroConsignaciones();
        System.out.println("Saldo: " + super.getSaldo());
        System.out.println("Comision Mensual: " + super.comisionMensual);
        System.out.println("Numero de transacciones realizadas: " + transaccionesRealizadas);
    }

    @Override
    public void extractoMensual() {
        if(super.numeroRetiros > 4){
            super.comisionMensual += 1000;
        }
        super.extractoMensual();
        if(super.getSaldo() < 15000){
            this.active = false;
        }
    }
}
