//Nombre: Alan Solano
//Fecha:3/11/2024
//Detalle:Centro de prosesamiento de datos
package org.example;

public class Automovil {
    //Se declara las variables
    private String marca;
    private String modelo;
    private String motor;
    private String tipoCombustible;
    private String tipoAutomovil;
    private int numeroPuertas;
    private int numeroAsientos;
    private int velocidadMaxima;
    private String color;
    private int velocidadActual;

//Se inicia el constructor recibiendo los datos de el main
    public Automovil(String marca, String modelo, String motor, String tipoCombustible, String tipoAutomovil,
                     int numeroPuertas, int numeroAsientos, int velocidadMaxima, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.numeroAsientos = numeroAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = 0;
    }
    //Se crea la funcion de acelerar
    public void acelerar(int incremento) {
        //Se verifica que el incremento no supere la velocidad maxima
        if (velocidadActual + incremento > velocidadMaxima) {
            //En el caso que el incremento sea mayor a la velocidad maxima se coloca el mac y se muestra una alerta
            velocidadActual = velocidadMaxima;
            System.out.println("Alerta: Velocidad máxima alcanzada. La velocidad no puede superar " + velocidadMaxima + " km/h.");
        } else {
            //Incrementa la velocidad
            velocidadActual += incremento;
            //Muestra la velocidad actual
            System.out.println("Acelerando. Velocidad actual: " + velocidadActual + " km/h");
        }
    }
    //Se crea la funcion de desacelerar
    public void desacelerar(int decremento) {
        if (velocidadActual - decremento < 0) {
            velocidadActual = 0;
            //Limita que la velocidad no sea negativa
            System.out.println("Velocidad mínima alcanzada.");
        } else {
            velocidadActual -= decremento;
            //Resta la velocidad e imprime la velocidad actual
            System.out.println("Desacelerando. Velocidad actual: " + velocidadActual + " km/h");
        }
    }
    //Se crea la funcion de frenar
    public void frenar() {
        velocidadActual = 0;
        //Situa la velocidad en 0 y lo imprime
        System.out.println("Frenando. Velocidad actual: " + velocidadActual + " km/h");
    }
    //Se crea la funcion de calcular el tiempo
    public double calcularTiempoLlegada(double distancia) {
        if (velocidadActual == 0) {
            //Verifica que la velocidad no sea 0
            System.out.println("El automóvil está detenido. No se puede calcular el tiempo de llegada.");
            return 0;
        }
        //Se divide la distancia por la velocidad actual y se imprime el resultado
        double tiempo = distancia / velocidadActual;
        System.out.println("Tiempo estimado de llegada: " + tiempo + " horas.");
        return tiempo;
    }
    //Se crea la funcion de mostrarAtributos
    public void mostrarAtributos() {
        //Imprime todos los atributos del carro
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Motor: " + motor);
        System.out.println("Tipo de Combustible: " + tipoCombustible + ", Tipo de Automóvil: " + tipoAutomovil);
        System.out.println("Número de Puertas: " + numeroPuertas + ", Número de Asientos: " + numeroAsientos);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h, Color: " + color);
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
    }
}
