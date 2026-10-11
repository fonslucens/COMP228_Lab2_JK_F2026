package com.jk.week5.lab3;

public class MainDriver {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(
                101, "Dr. Kim", 40, "Cardiology", 150.0);

        Nurse nurse = new Nurse(
                102, "Nurse Lee", 30, "Emergency", "Night");

        Surgeon surgeon = new Surgeon(
                103, "Dr. Park", 45, "Surgery", 250.0,
                "heart surgery", "OR-2");

        EmergencyDoctor emergencyDoctor = new EmergencyDoctor(
                104, "Dr. Choi", 38, "Emergency Medicine", 200.0);

        System.out.println("=== Hospital Employees ===");

        System.out.println("\n--- Doctor ---");
        System.out.println(doctor);
        doctor.diagnosePatient();
        doctor.performDuties();

        System.out.println("\n--- Nurse ---");
        System.out.println(nurse);
        nurse.assistPatient();
        nurse.performDuties();

        System.out.println("\n--- Surgeon ---");
        System.out.println(surgeon);
        surgeon.performSurgery();
        surgeon.performDuties();

        System.out.println("\n--- Emergency Doctor ---");
        System.out.println(emergencyDoctor);
        emergencyDoctor.handleEmergency();
        emergencyDoctor.performDuties();

        // Polymorphism using the same Person reference.
        System.out.println("\n=== Polymorphism ===");
        Person person;

        person = doctor;
        person.performDuties();

        person = nurse;
        person.performDuties();

        person = surgeon;
        person.performDuties();

        person = emergencyDoctor;
        person.performDuties();

        System.out.println("\n=== Interface Methods ===");
        emergencyDoctor.prescribeMedication();
        emergencyDoctor.generateBill();
    }
}