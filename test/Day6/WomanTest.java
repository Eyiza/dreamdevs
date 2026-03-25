package Day6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WomanTest {
    @Test
    public void instantiatingAnAbstractClass() {
        Female female = new Female() {
            @Override
            public void gossip() {
                System.out.println("Strange female");
            }
        };
        System.out.println(female.getClass().getSimpleName()); // Empty - anonymous class because of its abstraction.
        female.gossip();
    }

    @Test
    public void instantiatingAnAbstractSubClass() {
        Woman woman = new Woman();
        woman.gossip();
    }

}