package org.array;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayScenariosTest {

    @Test
    void testMainMethodRunsSuccessfully() {
        // Redirect System.out to capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Call the main method
        assertDoesNotThrow(() -> ArrayScenarios.main(new String[]{}));

        // Restore original System.out
        System.setOut(originalOut);

        // Check some expected output fragments (e.g., from System.out.print or println)
        String output = outContent.toString();
        assertTrue(output.contains("Sorted array"), "Output should contain sorted array log");
    }
}
