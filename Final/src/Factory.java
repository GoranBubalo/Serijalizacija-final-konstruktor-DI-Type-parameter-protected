public final class Factory {
    private String name;
    private String size;
    private String location;

    public Factory(String name, String size, String location) {
        this.name = name;
        this.size = size;
        this.location = location;
    }

    public String getName() {
        return this.name;
    }

    public String getSize() {
        return this.size;
    }

    public String getLocation() {
        return this.location;
    }

    public void printStatement() {
        System.out.println("This is a statement");
    }

    @Override
     public String toString() {
        return "Factory{" +
                "name='" + this.name + '\'' +
                ", size='" + this.size + '\'' +
                ", location='" + this.location + '\'' +
                '}';
    }
}
