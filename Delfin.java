public class Delfin extends Animal implements IMascota{
    private String nombre;

    public Delfin() {
        super(0);
    }

    public Delfin(String nombre) {
        super(0);
        this.nombre = nombre;
    }

    @Override
    public void comer() {
        System.out.println("El delfín está comiendo.");
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
        System.out.println("El delfín está jugando.");
    }
}
