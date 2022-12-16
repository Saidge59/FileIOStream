package Serializator;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 6294736638578730220L;
    protected static String faculty;
    private String name;
    private int id;
    private transient String password;

    public Student(String nameOfFaculty, String name, int id, String password) {
        faculty = nameOfFaculty;
        this.name = name;
        this.id = id;
        this.password = password;
    }
    public String toString() {
        return "\nfaculty " + faculty + "\nname " + name + "\nID " + id + "\npassword " + password;
    }
}