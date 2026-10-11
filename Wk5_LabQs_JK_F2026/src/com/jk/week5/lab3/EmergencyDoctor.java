package com.jk.week5.lab3;

public class EmergencyDoctor extends Doctor
        implements MedicalProfessional, Billable {

    public EmergencyDoctor(int personId, String name, int age,
            String specialization, double consultationFee) {
        super(personId, name, age, specialization, consultationFee);
    }

    public void handleEmergency() {
        System.out.println(getName() + " is handling an emergency.");
    }

    @Override
    public void prescribeMedication() {
        System.out.println(getName()
                + " is prescribing medication for an emergency patient.");
    }

    @Override
    public void generateBill() {
        System.out.printf("Consultation bill for %s: $%.2f%n",
                getName(), getConsultationFee());
    }

    @Override
    public void performDuties() {
        System.out.println(getName()
                + " (Emergency Doctor) is providing emergency care.");
    }
}