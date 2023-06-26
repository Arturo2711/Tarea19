public class Gato extends Animal implements IMascota{
    private String nombre;

    public Gato() {
        super(4);
    }

    public Gato(String nombre) {
        super(4);
        this.nombre = nombre;
    }

    @Override
    public void comer() {
        System.out.println("El gato está comiendo.");
    }

    @Override
    public String obtenerNombre() {
        return this.nombre;
    }

    @Override
    public void ponerNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void jugar() {
        System.out.println("El gato está jugando.");
    }
    
}
