package coinsyde.interfaces;

import java.util.Set;

public interface ComponentFinder {
    
    public<T> Set<Component<T>> findComponents();

}
