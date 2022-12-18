//package org.example;
//
//import com.mathsystem.api.graph.model.Graph;
//import com.mathsystem.api.graph.model.Vertex;
//import com.mathsystem.api.graph.oldmodel.directed.DirectedGraph;
//import com.mathsystem.domain.graph.repository.Color;
//import com.mathsystem.domain.graph.repository.GraphType;
//import com.mathsystem.domain.plugin.plugintype.GraphProperty;
//
//import java.util.*;
//
//public class GraphSubdivision implements GraphProperty {
//    @Override
//    public boolean execute(Graph abstractGraph) {
//        return false;
//        // get subgraph with vertices and edges of red color
////        Graph subgraph = getSubgraphOfColor(abstractGraph, Color.red);
//        // get cyclic graph space of both graphs
////        Graph cyclicGraphSpace1 = getCyclicGraphSpace(abstractGraph);
////        Graph cyclicGraphSpace2 = getCyclicGraphSpace(subgraph);
//        // return true if cyclic graph space of both graphs are isomorphic to each other
////        return isIsomorphic(cyclicGraphSpace1, cyclicGraphSpace2);
//    }
////    private Graph getSubgraphOfColor(Graph graph, Color color) {
////        // get subgraph with vertices and edges of given color
////        Graph subgraph = new Graph(graph.getDirectType(), 0, 0, null, null);
////
//////        List<UUID> vertices = new List<>();
////
////        graph.getVertices().forEach((uuid, vertex) -> {
////            if (vertex.getColor() == color) {
////                vertices.put(uuid, vertex.);
////            }
////        });
//////        subgraph.setVertices();
////        // add vertices of given color to subgraph
////
////    }
////    private Graph getCyclicGraphSpace(Graph graph) {
////        // get cyclic graph space of graph
////    }
////    private boolean isIsomorphic(Graph graph1, Graph graph2) {
////        // get cyclic graph space of both graphs
////        // return true if cyclic graph space of both graphs are isomorphic to each other
////    }
//}