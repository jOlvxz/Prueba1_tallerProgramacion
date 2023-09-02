public class CuentaCorriente extends Cuenta{
    public float sobregiro = 0;
    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }


    @Override
    public void retirarDinero(float cantidadDinero) {
        float resto = super.getSaldo() - cantidadDinero;
        if (resto < 0){
            this.sobregiro -= resto;
            setSaldo(0);
        } else {
            super.retirarDinero(cantidadDinero);
        }
    }

    @Override
    public void consignar(float cantidad){
        float residuo = this.sobregiro - cantidad;
        if(this.sobregiro > 0){
            if(residuo < 0){
                this.sobregiro = 0;
                setSaldo(residuo * -1);
            }else{
                this.sobregiro = residuo;
                setSaldo(0);
            }
        }else{
            super.consignar(cantidad);
        }
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();
    }

    @Override
    public void informacion() {
        System.out.println("Sobregiro: "+ this.sobregiro);
        super.informacion();
    }
}
