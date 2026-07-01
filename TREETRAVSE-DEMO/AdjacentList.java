package TREETRAVSEDEMO;

public class AdjacentList {

    //Description:
    //An array/arraylist of linkedlist.
    //Each LinkedList has a unique node at the head.
    //All adjacent neighbours to that node are added to that node's linkedlist.
    
    //Runtime complexity to check an Edge = O(v)
    //Space Complexity: O(v+e) 

    public static void main(String[] args) {

        NodeClass n1 =  new NodeClass('A');
        NodeClass n2 =  new NodeClass('B');
        NodeClass n3 =  new NodeClass('C');
        NodeClass n4 =  new NodeClass('D');
        NodeClass n5 =  new NodeClass('E');
        
        GraphClass graph =  new GraphClass(5);
        graph.addNode(n1);
        graph.addNode(n2);
        graph.addNode(n3);
        graph.addNode(n4);
        graph.addNode(n5);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        System.out.println(graph.checkEdge(0, 1));
    }
}
