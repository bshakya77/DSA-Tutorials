package TREEDEMO;

/******************************************/
// Author: Bijay Shakya
// Search Algorithm: Adjacent Matrix
/******************************************/

public class Main {

    // Description:
    // It's a 2D array to store 1's or 0's to represent edges.
    // No of rows = No of unique nodes
    // No of columns = No of unique nodes
    // Runtime complexity to check an Edge = O(1)
    // Space Complexity: O(v^2)

    public static void main(String[] args) {

        Node n1 = new Node('A');
        Node n2 = new Node('B');
        Node n3 = new Node('C');
        Node n4 = new Node('D');
        Node n5 = new Node('E');

        Graph graph = new Graph(5);
        graph.addNode(n1);
        graph.addNode(n2);
        graph.addNode(n3);
        graph.addNode(n4);
        graph.addNode(n5);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        System.out.println("\n ************** Depth First Search *************\n");

        // Description
        // Depth First Search = Pick a route, keep going.
        // Traverse a graph branch by branch.
        // Uses stack to perform the operations.
        // Better if destination is on average far from the start.
        // Children are visited before siblings.
        // If you reach a dead end, or an already visited node.
        // backtrack to a previous node with unvisited adjacent neighbours.

        graph.depthFirstSearch(0);

        System.out.println("\n ************** Breadth First Search ************* \n");
        // Description
        // Uses queue to perform the operations.
        // Breadth First Search = Traverse a graph level by level.
        // Better if destination is on average close to start.
        // Siblings are visited before children.

        graph.breadthFirstSearch(2);

        // System.out.println(graph.checkEdge(0, 1));

    }
}
