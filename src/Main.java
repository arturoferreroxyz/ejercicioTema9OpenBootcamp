/**
 * EJERCICIO TEMA 9 Curso de Introducción a la programación OPENBOOTCAMP
 *Crea una clase Persona con las siguientes variables:
 * La edad
 * El nombre
 * El teléfono
 * Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
 * esta nueva clase tendrá la variable credito solo para esa clase.
 *
 * Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
 * el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
 *
 * Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
 * y con una variable salario que solo tenga la clase Trabajador.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al ejercicio del tema 9");

        cliente ejemploCliente = new cliente();
        ejemploCliente.edad=12;
        ejemploCliente.nombre="pepe";
        ejemploCliente.telefono=888;
        ejemploCliente.credito=12.1;

        System.out.println("Edad: "+ejemploCliente.edad+" Nombre: "+ejemploCliente.nombre);
        System.out.println("telefono: "+ejemploCliente.telefono+" Credito: "+ejemploCliente.credito);

        trabajador ejemploTrabajador = new trabajador();
        ejemploTrabajador.edad=121;
        ejemploTrabajador.nombre="pepa";
        ejemploTrabajador.telefono=999;
        ejemploTrabajador.credito=1000.1;
        ejemploTrabajador.salario=9999;

        System.out.println("\nEdad: "+ejemploTrabajador.edad+" Nombre: "+ejemploTrabajador.nombre);
        System.out.println("telefono: "+ejemploTrabajador.telefono+" Credito: "+ejemploTrabajador.credito);
        System.out.println("Salario: "+ejemploTrabajador.salario);


    }
}

class persona{
    int edad;
    String nombre;
    int telefono;
}
class cliente extends persona{
    double credito;
}
class trabajador extends cliente{
    double salario;
