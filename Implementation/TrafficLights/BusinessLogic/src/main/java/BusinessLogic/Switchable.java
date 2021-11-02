import java.util.function.Predicate;


@FunctionalInterface
public interface Switchable <T>{
    Predicate<T> switch(String switchTerm);
}