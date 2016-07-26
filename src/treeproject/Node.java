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
public class Node {

    private int nodeID;
    private boolean is_root = Boolean.FALSE;
    private boolean is_leaf = Boolean.FALSE;
    private String message = "";
    private Node leftNode = null;
    private Node rightNode = null;

    public Node(int nodeID) {
        this.nodeID = nodeID;
    }

    /**
     * @return the nodeID
     */
    public int getNodeID() {
        return nodeID;
    }

    /**
     * @param nodeID the nodeID to set
     */
    public void setNodeID(int nodeID) {
        this.nodeID = nodeID;
    }

    /**
     * @return the is_root
     */
    public boolean isIs_root() {
        return is_root;
    }

    /**
     * @param is_root the is_root to set
     */
    public void setIs_root(boolean is_root) {
        this.is_root = is_root;
    }

    /**
     * @return the is_leaf
     */
    public boolean isIs_leaf() {
        return is_leaf;
    }

    /**
     * @param is_leaf the is_leaf to set
     */
    public void setIs_leaf(boolean is_leaf) {
        this.is_leaf = is_leaf;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the leftNode
     */
    public Node getLeftNode() {
        return leftNode;
    }

    /**
     * @param leftNode the leftNode to set
     */
    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    /**
     * @return the rightNode
     */
    public Node getRightNode() {
        return rightNode;
    }

    /**
     * @param rightNode the rightNode to set
     */
    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

}
