package com.sh.patterns.stratedgy;

/**
 * Created by ievgen on 5/18/14.
 */
public class Programmer extends Worker {
    private Abilities abilities;
    private Education education;

    public Programmer(Education education){
        this.education = education;
        this.abilities = new MentalAbility();
    }

    @Override
    void description() {
        System.out.println("Programmer");
    }

    @Override
    void performJob() {
        System.out.println("programming");
    }

    @Override
    void education() {
        education.showDiplomas();
    }
}
