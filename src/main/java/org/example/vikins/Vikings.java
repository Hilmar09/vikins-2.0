package org.example.vikins;

import org.example.soldier.Soldier;

public class Vikings extends Soldier {
    private String msg;
    private String name;


    public Vikings(String name, int health, int strength) {
        super(health, strength);
        this.name = name;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String receiveDamage(int damage) {

        this.health -= damage;

        if (this.health >= 0) {
            this.msg = this.name + "has received" + 50 + "points of damage";
        } else {
            this.msg = this.name + "has died in combat";
        }
        return msg;
    }

        public String battleCry() {
          return "Odin Owns You All!";
    }



}



