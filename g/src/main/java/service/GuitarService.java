package service;

import dao.GuitarDao;
import model.Guitar;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuitarService {

    public List<Guitar> search(GuitarSpec guitarSpec){
        GuitarDao guitarDao = new GuitarDao();
        Inventory inventory = new Inventory();
        inventory.setGuitars(guitarDao.getAllGuitar());
        List<Guitar> guitarList = new ArrayList<>();
        for(Guitar guitar: inventory.getGuitars()){
            if(guitarSpec.matches(guitarSpec,guitar)){
                guitarList.add(guitar);
            }
        }
        return guitarList;
    }
}
