/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeproject;

/**
 *
 * @author sa-al
 */
public class TreeStructure {
    
    private Node rootNode = null;
    private Node currentNode = null;
    private int currentID = 0;
    
    public TreeStructure(){
        rootNode = new Node(currentID);
        currentNode = rootNode;
        currentID +=1;
    }

    /**
     * @return the rootNode
     */
    public Node getRootNode() {
        return rootNode;
    }

    /**
     * @param rootNode the rootNode to set
     */
    public void setRootNode(Node rootNode) {
        this.rootNode = rootNode;
    }

    /**
     * @return the currentNode
     */
    public Node getCurrentNode() {
        return currentNode;
    }

    /**
     * @param currentNode the currentNode to set
     */
    public void setCurrentNode(Node currentNode) {
        this.currentNode = currentNode;
    }

    /**
     * @return the currentID
     */
    public int getCurrentID() {
        return currentID;
    }

    /**
     * @param currentID the currentID to set
     */
    public void setCurrentID(int currentID) {
        this.currentID = currentID;
    }
    
}
