// Clase abstracta Animal
abstract class Animal {
    private int patas;

    public Animal(int patas) {
        this.patas = patas;
    }

    public void moverse() {
        System.out.println("El animal se está moviendo.");
    }

    public abstract void comer();
}
