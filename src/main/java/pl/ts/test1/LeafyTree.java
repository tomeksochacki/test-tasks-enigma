package pl.ts.test1;

public class LeafyTree extends Tree {

    public LeafyTree(Trunk myTrunk, Branch myBranch, Leaf myLeaf) {
        super(myTrunk, myBranch, myLeaf);
        System.out.println("I am leafy tree.");
    }

    @Override
    public void grow() {
        System.out.println("I'm growing fast.");
    }

}
