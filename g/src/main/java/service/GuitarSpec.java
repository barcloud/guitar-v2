package service;

import model.Guitar;

public class GuitarSpec {

    String color;
    String size;
    String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean matches(GuitarSpec guitarSpec,Guitar guitar){
        if(guitarSpec.getColor()!=null && !guitarSpec.getColor().equals("")
                && !guitar.getGuitarSpec().getColor().equals(guitarSpec.getColor())){
            return false;
        }
        if(guitarSpec.getNumber()!=null && !guitarSpec.getNumber().equals("")
                && !guitar.getGuitarSpec().getNumber().equals(guitarSpec.getNumber())){
            return false;
        }
        if(guitarSpec.getSize()!=null && !guitarSpec.getSize().equals("")
                && !guitar.getGuitarSpec().getSize().equals(guitarSpec.getSize())){
            return false;
        }
        return true;
    }
}
