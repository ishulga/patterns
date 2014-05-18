package com.sh.patterns.stratedgy;

/**
 * Created by ievgen on 5/18/14.
 */
public class Main {
    public static void main(String[] args) {
        Education universityDegree = new UniversityDegree();
        Education schEducation = new SchoolDegree();
        Abilities phyAbilities = new PhysicalAbility();
        Worker programmer = new Programmer(universityDegree);
        Worker plumWorker = new Plumber(schEducation,phyAbilities);

        programmer.performJob();
        plumWorker.performJob();
    }
}
