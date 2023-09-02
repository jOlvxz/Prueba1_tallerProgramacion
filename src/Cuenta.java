public class Cuenta {
    private float saldo;
    private int numeroConsignaciones = 0;
    public int numeroRetiros = 0;
    public float tasaAnual;
    public float comisionMensual = 0;

    //Getters

    public int getNumeroConsignaciones() {
        return numeroConsignaciones;
    }

    public float getSaldo() {
        return saldo;
    }
    //Setters

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setNumeroConsignaciones(int numeroConsignaciones) {
        this.numeroConsignaciones = numeroConsignaciones;
    }

    // Constructor
    public Cuenta(float saldo, float tasaAnual){
        setSaldo(saldo);
        this.tasaAnual = tasaAnual;
    }

    // Metodos
    public void consignar(float cantidadDinero){
        setSaldo(cantidadDinero+getSaldo());
        setNumeroConsignaciones(getNumeroConsignaciones()+1);
    }

    public void retirarDinero(float cantidadDinero){
        if (cantidadDinero < getSaldo()) {
            setSaldo(getSaldo()-cantidadDinero);
            this.numeroRetiros += 1;
        }
    }

    public float calcularInteresMensual(){
        float interesAnual = this.tasaAnual / 100;
        float interesMensual = interesAnual / 12;
        interesMensual = getSaldo() * interesMensual;
        this.comisionMensual += interesMensual;
        return this.comisionMensual;
    }

    public void extractoMensual(){
        float interesNegativo = calcularInteresMensual() * -1;
        setSaldo(getSaldo()-interesNegativo);
    }

    public void informacion(){
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Numero de Consignaciones :" + getNumeroConsignaciones());
        System.out.println("Numero de retiros: " + this.numeroRetiros);
        System.out.println("Tasa Anual: " + this.tasaAnual + "%");
        System.out.println("Comision Mensual: " + this.comisionMensual);
    }

}
