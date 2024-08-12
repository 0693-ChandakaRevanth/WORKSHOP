package Basic_Library_System;
class Member {
    private int id;
    private String name;
    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getName() { return name; }
    @Override
    public String toString() { return "Member " + id + ": " + name; }

}