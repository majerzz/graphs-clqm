package org.example;

import com.mathsystem.api.graph.GraphFactory;
import com.mathsystem.api.graph.model.Graph;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, AssertionError {
        testGraphSubdivision();
    }

    private static void testGraphSubdivision() throws FileNotFoundException, AssertionError {
        Graph testGraphTrue1 = GraphFactory.loadGraphFromFile(new File("src/main/resources/subdivision_graphs/graph1_True.txt"));
        Graph testGraphTrue2 = GraphFactory.loadGraphFromFile(new File("src/main/resources/subdivision_graphs/graph2_True.txt"));
        Graph testGraphTrue3 = GraphFactory.loadGraphFromFile(new File("src/main/resources/subdivision_graphs/graph3_True.txt"));
        Graph testGraphTrue4 = GraphFactory.loadGraphFromFile(new File("src/main/resources/subdivision_graphs/graph4_True.txt"));
        Graph testGraphTrue5 = GraphFactory.loadGraphFromFile(new File("src/main/resources/subdivision_graphs/graph5_True.txt"));

        Graph testGraphFalse1 = GraphFactory.loadGraphFromFile(new File("src/main/resources/subdivision_graphs/graph1_False.txt"));
        Graph testGraphFalse2 = GraphFactory.loadGraphFromFile(new File("src/main/resources/subdivision_graphs/graph2_False.txt"));
        Graph testGraphFalse3 = GraphFactory.loadGraphFromFile(new File("src/main/resources/subdivision_graphs/graph3_False.txt"));
        Graph testGraphFalse4 = GraphFactory.loadGraphFromFile(new File("src/main/resources/subdivision_graphs/graph4_False.txt"));
        Graph testGraphFalse5 = GraphFactory.loadGraphFromFile(new File("src/main/resources/subdivision_graphs/graph5_False.txt"));

        GraphSubdivision graphSubdivision = new GraphSubdivision();

        if (!graphSubdivision.execute(testGraphTrue1)) {
            throw new AssertionError("Test 1 failed");
        }
        if (!graphSubdivision.execute(testGraphTrue2)) {
            throw new AssertionError("Test 2 failed");
        }
        if (!graphSubdivision.execute(testGraphTrue3)) {
            throw new AssertionError("Test 3 failed");
        }
        if (!graphSubdivision.execute(testGraphTrue4)) {
            throw new AssertionError("Test 4 failed");
        }
        if (!graphSubdivision.execute(testGraphTrue5)) {
            throw new AssertionError("Test 5 failed");
        }

        if (graphSubdivision.execute(testGraphFalse1)) {
            throw new AssertionError("Test 6 failed");
        }
        if (graphSubdivision.execute(testGraphFalse2)) {
            throw new AssertionError("Test 7 failed");
        }
        if (graphSubdivision.execute(testGraphFalse3)) {
            throw new AssertionError("Test 8 failed");
        }
        if (graphSubdivision.execute(testGraphFalse4)) {
            throw new AssertionError("Test 9 failed");
        }
        if (graphSubdivision.execute(testGraphFalse5)) {
            throw new AssertionError("Test 10 failed");
        }
    }
}
