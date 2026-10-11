package com.jk.week5.lab3;

public class Doctor extends Person {
    private String specialization;
    private double consultationFee;

    public Doctor(int personId, String name, int age,
            String specialization, double consultationFee) {
        super(personId, name, age);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void diagnosePatient() {
        System.out.println(getName() + " is diagnosing a patient in "
                + specialization + ".");
    }

    @Override
    public void performDuties() {
        System.out.println(getName()
                + " (Doctor) is examining patients and prescribing treatment.");
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nSpecialization: " + specialization
                + "\nConsultation Fee: $" + String.format("%.2f", consultationFee);
    }
}