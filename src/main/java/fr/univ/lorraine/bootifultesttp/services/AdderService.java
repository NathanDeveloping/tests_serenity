package fr.univ.lorraine.bootifultesttp.services;


import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class AdderService {

    private int num;

    public AdderService() {
        Random rand = new Random();
        this.num = rand.nextInt();
    }

    public void setNum(int num) {
        this.num = num;
    }
    public int getNum() {
        return this.num;
    }

    public void nextRandom() {
        Random rand = new Random();
        this.num = rand.nextInt();
    }

    public int add(int x) {
        return this.num + x;
    }
}
