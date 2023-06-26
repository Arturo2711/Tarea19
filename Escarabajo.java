
public class Escarabajo extends Animal {

  int tamano, patas;

  public Escarabajo(int patas, int tamano) {
    super(patas);
    this.tamano = tamano;
  }

  @Override
  public void comer() {
    System.out.println("Estoy comiendo");
  }
}
