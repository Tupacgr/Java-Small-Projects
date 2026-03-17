public class Agent {
    private String name;
    private byte score;
    private String tier;
    private boolean isApproved;

    public Agent(String name, byte score, String tier, boolean isApproved) {
        this.name = name;
        this.score = score;
        this.tier = tier;
        this.isApproved = isApproved;
    }

    public void printAgentInfo() {
        System.out.println("Processing " + this.name + "... " + "Character 0 is " + this.name.charAt(0) + " (Unicode: " 
                      + (int) this.name.charAt(0) +")." + " Score generated: " + this.score + ". " 
                      + "Tier: " + this.tier + ". " + "Passed: " + this.isApproved);
    }
}