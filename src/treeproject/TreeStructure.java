/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeproject;

import javax.swing.JPanel;

/**
 *
 * @author sa-al
 */
public class TreeStructure extends JPanel{
    
    private Node rootNode = null;
    private Node currentNode = null;
    private int currentID = 0;
    
    public TreeStructure(){
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
        if(currentNode.isIs_root()){
            rootNode = currentNode;
        }
        currentID = this.currentNode.getNodeID()+1;
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
