package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {
     private String msg;
     int health = 60;
     int strength = 25;

     public Saxon(int health, int strength) {
          super(health, strength);
          this.msg=msg;
     }

     public String getMsg() {
          return msg;
     }

     public void setMsg(String msg) {
          this.msg = msg;
     }

     public String receiveDamage(int damage) {
          health -= damage;
          if (health > 0) {
               msg = "A Saxon has received" + 45 + "points of damage";
          } else {
               msg = "A Saxon has died in combat";
          }
          return msg;
     }
}
