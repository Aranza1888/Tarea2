package neko.herenciaeinterfaces1;
// usar Shift + f6 para que corra el programa 
public class Main {
    public static void main (String[] args){
        Alumno a = new Alumno();
        Profesor p = new Profesor(10008000);
        System.out.println(a);
        System.out.println(p);
    }
}
