package controller;

import controller.Passport;
import service.PassRep;
import validator.PassId;

import java.util.ArrayList;
import java.util.List;

public class MainSystem {

    PassRep passRep = new PassRep();
    PassId passId = new PassId();
    List<Passport> passports = new ArrayList<>();
    int number1 = 0;


    public void regPassport(String name, String surname, String id) {

        if (passId.checkRightLength(id)) {
            Passport pass = new Passport(name, surname, number1++, id);
            passRep.passAdd(pass);
        }
    }

    public Passport getInfoPass(String id) {
        return passRep.passGet(id);
        }
    }

