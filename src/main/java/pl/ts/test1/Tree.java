package pl.ts.test1;

public class Tree {
    private Trunk trunk;
    private Branch branch;
    private Leaf leaf;

    public Tree(Trunk myTrunk, Branch myBranch, Leaf myLeaf) {
        System.out.println("I am tree.");
        this.trunk = myTrunk;
        this.branch = myBranch;
        this.leaf = myLeaf;
    }

    public void grow() {
        System.out.println("I am growing.");
    }

    public Trunk getTrunk() {
        return trunk;
    }

    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Leaf getLeaf() {
        return leaf;
    }

    public void setLeaf(Leaf leaf) {
        this.leaf = leaf;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "trunk=" + trunk +
                ", branch=" + branch +
                ", leaf=" + leaf +
                '}';
    }
}
