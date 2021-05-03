package coinsyde.interfaces;

public interface Component<SpecT> {

    boolean equal(Object other);

    SpecT getSpecilization();

}
