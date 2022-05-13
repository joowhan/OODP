package framework;
import java.lang.Cloneable;

public interface Battery extends Cloneable {
    public abstract void use();
    public abstract Battery createClone();
    //public abstract Battery getBattery();
}
