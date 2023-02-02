public class Greeter {
    private Relationship relationship;

    public Greeter() {
        this(() -> "Hello.");
    }

    public Greeter(Relationship relationship) {
        this.relationship = relationship;
    }

    public String greet() {
        return this.relationship.greet();
    }
}
