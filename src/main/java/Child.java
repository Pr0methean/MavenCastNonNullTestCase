import java.util.concurrent.ThreadLocalRandom;

public class Child extends Parent {

  @Override
  protected void setNullable() {
    if (ThreadLocalRandom.current().nextInt(100) > 10) {
      nullable = "Hello World";
    }
  }

  public static void main(String[] args) {
    Parent main = new Child();
    System.out.println(main.getNullable().toString() + " and Checker Framework!");
  }
}
