package cuentas;



/**
 * Clase que representa una cuenta bancaria con operaciones basicas
 * @author Juan Alberto Rodriguez Peña
 * @version 1.0
 */

public class CCuenta {
    
    /** Nombre del titular de la cuenta */
    private String nombre;
    
    
    /** Numero de cuenta bancaria */
    private String cuenta;
    
    
    /** Saldo actual de la cuenta */
    private double saldo;
    
    
    /** Tipo de interes aplicado a la cuenta */
    private double tipoInteres;
    
    
    /**
     * Constructor por defecto de la clase CCuenta
     */
    public CCuenta() {
    }
    
    
    /**
     * Constructor con parametros para inicializar una cuenta
     * @param nom Nombre del titular de la cuenta
     * @param cue Numero de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }
    
    
    
    /**
     * Obtiene el saldo actual de la cuenta
     * @return Saldo actual
     */
    public double estado() {
        return saldo;
    }
    
    
    
    /**
     * Ingresa una cantidad de dinero en la cuenta
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    
    
    /**
     * Retira una cantidad de dinero de la cuenta
     * @param cantidad Cantidad a retirar
     * @throws Exception Si la cantidad es negativa o no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    
    
    /**
     * Obtiene el nombre del titular
     * @return Nombre del titular
     */
    public String getNombre() {
        return nombre;
    }
    
    
    
    /**
     * Establece el nombre del titular
     * @param nombre Nuevo nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    /**
     * Obtiene el numero de cuenta
     * @return Numero de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }
    
    
    
    /**
     * Establece el numero de cuenta
     * @param cuenta Nuevo numero de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
    
    
    /**
     * Obtiene el saldo actual
     * @return Saldo actual
     */
    public double getSaldo() {
        return saldo;
    }
    
    
    
    /**
     * Establece el saldo
     * @param saldo Nuevo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    /**
     * Obtiene el tipo de interes
     * @return Tipo de interes
     */
    public double getTipoInteres() {
        return tipoInteres;
    }
    
    
    
    /**
     * Establece el tipo de interes
     * @param tipoInteres Nuevo tipo de interes
     */
    public void setTipoInterés(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}