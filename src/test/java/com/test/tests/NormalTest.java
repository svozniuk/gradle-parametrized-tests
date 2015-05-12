package com.test.tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.test.categories.First;
import com.test.categories.Second;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NormalTest {

    @Test
    @Category(First.class)
    public void testTrue() {
        assertTrue("This should never fail", true);
    }

    @Test
    @Category(Second.class)
    public void testFalse() {
        assertFalse("This should never fail", false);
    }

    @Test
    public void doNothing() {
        assertFalse("This should never fail", false);
    }
}
