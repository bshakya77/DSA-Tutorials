package TREETRAVSEDEMO;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphClass {
    ArrayList<LinkedList<NodeClass>> arrayList;

    GraphClass(int size) {
        arrayList = new ArrayList<>();
    }

    public void addNode(NodeClass node) {
        LinkedList<NodeClass> currentList = new LinkedList<>();
        currentList.add(node);
        arrayList.add(currentList);
    }

    public void addEdge(int src, int dst) {
        LinkedList<NodeClass> currentList = arrayList.get(src);
        NodeClass dstNode = arrayList.get(dst).get(0);
        currentList.add(dstNode);
    }

    public boolean checkEdge(int src, int dst) {

        LinkedList<NodeClass> currentList = arrayList.get(src);
        NodeClass dstNode = arrayList.get(dst).get(0);

        for (NodeClass node : currentList) {
            if (node == dstNode) {
                return true;
            }
        }
        return false;
    }

    public void print() {

        // System.out.print(" ");
        for (LinkedList<NodeClass> currentList : arrayList) {
            for (NodeClass node : currentList) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }
}
