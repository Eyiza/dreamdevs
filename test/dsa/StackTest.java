package dsa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack stack;

    @BeforeEach // Creates a new stack for each test
    public void setUp() {
        stack = new Stack();
    }

    @Test
    public void newStack_isEmptyTest() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void addElement_stackIsNotEmpty() {
        assertTrue(stack.isEmpty());

        stack.push("strings");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pushOneElement_popOneElement_StackIsEmptyTest() {
        stack.push("strings");
        assertFalse(stack.isEmpty());

        String popped = stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushTwoElement_popOneElement_StackIsEmptyTest() {
        stack.push("strings1");
        stack.push("strings2");
        assertFalse(stack.isEmpty());

        String popped = stack.pop();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pushX_popReturnsXTest() {
        stack.push("strings1");
        assertEquals("strings1", stack.pop());
    }

    @Test
    public void pushXYZ_popReturnsZYXTest() {
        stack.push("strings1");
        stack.push("strings2");
        stack.push("strings3");
        assertEquals("strings3", stack.pop());
        assertEquals("strings2", stack.pop());
        assertEquals("strings1", stack.pop());
    }
}
