package orchestration;

import grandpa.*;

public class Orchestration {
    private Grandpa grandpa;    
    public Orchestration(){grandpa = new Grandpa();}    //default

    public  void run (String[] args) {
        System.out.println("Orchestration");
        grandpa.sortHulu();

    }
};