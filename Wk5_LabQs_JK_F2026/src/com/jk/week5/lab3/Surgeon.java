package com.jk.week5.lab3;

public class Surgeon extends Doctor {
    private String surgeryType;
    private String operatingRoom;

    public Surgeon(int personId, String name, int age,
            String specialization, double consultationFee,
            String surgeryType, String operatingRoom) {
        super(personId, name, age, specialization, consultationFee);
        this.surgeryType = surgeryType;
        this.operatingRoom = operatingRoom;
    }

    public void performSurgery() {
        System.out.println(getName() + " is performing " + surgeryType
                + " in " + operatingRoom + ".");
    }

    @Override
    public void performDuties() {
        System.out.println(getName()
                + " (Surgeon) is performing surgery and monitoring recovery.");
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nSurgery Type: " + surgeryType
                + "\nOperating Room: " + operatingRoom;
    }
}