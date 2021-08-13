package pl.ts.test1;

public class Conifer extends Tree {

    public Conifer(Trunk myTrunk, Branch myBranch, Leaf myLeaf) {
        super(myTrunk, myBranch, myLeaf);
        System.out.println("I am conifer.");
    }

    @Override
    public void grow() {
        System.out.println("I'm growing slow.");
    }
}
