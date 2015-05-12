package com.test.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.test.categories.First;

@RunWith(Parameterized.class)
@Category(First.class)
public class ParametrizedWithoutRename {
    private final String value;
    private final int length;

    @Parameters
    public static Iterable<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
                { "a", 1 },
                { "ab", 2 },
                { "abc", 3 },
                { "abcd", 4 },
                { "abcde", 5 }

        });
    }

    public ParametrizedWithoutRename(String value, int length) {
        this.value = value;
        this.length = length;
    }

    @Test
    public void validateStringLength() {
        assertEquals(length, value.length());
    }

    @Test
    public void validateConcatenation() {
        assertEquals(length * 2, (value+value).length());
    }
}
