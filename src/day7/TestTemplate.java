package day7;

import day8.Automobile;

public class TestTemplate {
    public static void main(String[] args) {

        System.out.println("=================John's Resume====================================");
        Template johnResume = new Template();
        johnResume.firstName = "John";
        johnResume.lastName = "G";
        johnResume.totalExperience = 10;
        johnResume.gender = 'M';

        System.out.println("Applicant Name: " + johnResume.firstName + " " + johnResume.lastName + " Total Experience: " + johnResume.totalExperience + " Gender: " + johnResume.gender);

        System.out.println("=================Hema's Resume====================================");

        Template hemaResume = new Template();
        hemaResume.firstName = "Hema";
        hemaResume.lastName = "Bhargava";
        hemaResume.totalExperience = 6;
        hemaResume.gender = 'F';

        System.out.println("Applicant Name: " + hemaResume.firstName + " " + hemaResume.lastName + " Total Experience: " + hemaResume.totalExperience + " Gender: " + hemaResume.gender);

        System.out.println("=================Aftab's Resume====================================");
        Template aftabResume = new Template();
        aftabResume.firstName = "Aftab";
        aftabResume.lastName = "Khan";
        aftabResume.totalExperience = 8;
        aftabResume.gender = 'M';

        System.out.println("Applicant Name: " + aftabResume.firstName + " " + aftabResume.lastName + " Total Experience: " + aftabResume.totalExperience + " Gender: " + aftabResume.gender);

        System.out.println("=================Vijaya's Resume====================================");
        Template vijayaResume = new Template();
        vijayaResume.firstName = "Vijaya";
        vijayaResume.lastName = "Goswami";
        vijayaResume.totalExperience = 12;
        vijayaResume.gender = 'F';

        System.out.println("Applicant Name: " + vijayaResume.firstName + " " + vijayaResume.lastName + " Total Experience: " + vijayaResume.totalExperience + " Gender: " + vijayaResume.gender);


    }
}
