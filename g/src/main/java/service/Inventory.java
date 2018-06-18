package service;

import model.Guitar;
import service.GuitarSpec;

import java.util.List;

public class Inventory {

    List<Guitar> guitars;

    public List<Guitar> getGuitars() {
        return guitars;
    }

    public void setGuitars(List<Guitar> guitars) {
        this.guitars = guitars;
    }
}
