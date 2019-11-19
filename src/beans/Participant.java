package beans;

import java.io.Serializable;

public class Participant implements Serializable {
    private String name;
    private String surname;
    private int age;
    Participant[] participants;

    public Participant() {
    }

    public Participant(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Participant[] getParticipants() {
        return participants;
    }

    public void setParticipants(Participant[] participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "name=" + name + ", surname:" + surname + ", age:"+ age;
    }
}
