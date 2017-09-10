import java.util.concurrent.locks.ReentrantLock;
import org.checkerframework.checker.initialization.qual.UnknownInitialization;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public abstract class Parent {
  @Nullable
  protected Object nullable;
  private static final ReentrantLock lock = new ReentrantLock();

  public Parent() {
    setNullable();
    System.out.println(getNullable().toString());
  }

  @EnsuresNonNull("nullable")
  protected abstract void setNullable();

  protected Object getNullable(@UnknownInitialization Parent this) {
    return nullable;
  }
}
