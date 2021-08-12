package domain;

public class Tree implements Plant {
    private String type;
    private Integer trunk;
    private Integer numberOfBranches;
    private String leafType;

    @Override
    public void grow(Integer trunkGrowth, Integer branchesGrowth) {
        this.trunk = this.trunk + trunkGrowth;
        this.numberOfBranches = this.numberOfBranches + branchesGrowth;
    }
}
