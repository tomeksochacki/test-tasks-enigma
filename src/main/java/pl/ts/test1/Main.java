package pl.ts.test1;

public class Main {
    public static void main(String[] args) {
        Trunk trunkLT = new Trunk();
        Trunk trunkC = new Trunk();
        Branch branchLT = new Branch();
        Branch branchC = new Branch();
        Tree leafyTree = new LeafyTree(trunkLT, branchLT, Leaf.LEAF);
        Tree conifer = new Conifer(trunkC, branchC, Leaf.NEEDLES);

        System.out.println(leafyTree);
        leafyTree.grow();
        System.out.println("------------");
        System.out.println(conifer);
        conifer.grow();
    }
}
