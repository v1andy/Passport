package service;

import controller.Passport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PassRep {

    List<Passport> passports = new ArrayList<>();
    Map<String,Passport> baseOfPassports = new HashMap<>();


    public void passAdd(Passport pass) {
        baseOfPassports.put(pass.getId(), pass);
    }

    public Passport passGet(String id){
        return baseOfPassports.get(id);
    }



}
