package neko.herenciaeinterfaces1;

public class Alumno extends persona{

    public Alumno() {
        System.out.println("Se crea Alumno...");
    }

    @Override
    public String toString() {
        return "Un alumno llamado: " + this.nombre;
    }
  
}
