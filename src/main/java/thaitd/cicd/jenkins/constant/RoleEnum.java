package thaitd.cicd.jenkins.constant;

public enum RoleEnum {

    ADMINISTRATOR(1, "ADMIN"),
    USER(2, "USER");

    private final int id;
    private final String name;

    RoleEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
