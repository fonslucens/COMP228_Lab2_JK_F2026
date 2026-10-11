package com.jk.week5.lab3;

public class Nurse extends Person {
    private String department;
    private String shift;

    public Nurse(int personId, String name, int age,
            String department, String shift) {
        super(personId, name, age);
        this.department = department;
        this.shift = shift;
    }

    public void assistPatient() {
        System.out.println(getName() + " is assisting a patient in the "
                + department + " department.");
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " (Nurse) is providing patient care during the "
                + shift + " shift.");
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nDepartment: " + department
                + "\nShift: " + shift;
    }
}