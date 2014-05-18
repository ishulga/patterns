package com.sh.patterns.stratedgy;

/**
 * Created by ievgen on 5/18/14.
 */
public class Plumber extends Worker {
    private Abilities abilities;
    private Education education;

    public Plumber(Education education, Abilities abilities){
        this.education = education;
        this.abilities = abilities;
    }
    @Override
    public void description() {
        System.out.println("doing hand job");
    }

    @Override
    public void performJob() {
        abilities.perform();
    }

    @Override
    public void education() {
        education.showDiplomas();
    }
}
