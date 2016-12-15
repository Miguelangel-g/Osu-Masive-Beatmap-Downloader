
package models;


public class Beatmap {
    String ID;
    String name;
    String mode;
    String hp;
    String cs;
    String od;
    String ar;
    String bpm;
    String length;

    public Beatmap(String ID, String name, String mode, String hp, String cs, String od, String ar, String bpm, String length) {
        this.ID = ID;
        this.name = name;
        this.mode = mode;
        this.hp = hp;
        this.cs = cs;
        this.od = od;
        this.ar = ar;
        this.bpm = bpm;
        this.length = length;
    }
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getCs() {
        return cs;
    }

    public void setCs(String cs) {
        this.cs = cs;
    }

    public String getOd() {
        return od;
    }

    public void setOd(String od) {
        this.od = od;
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

    public String getBpm() {
        return bpm;
    }

    public void setBpm(String bpm) {
        this.bpm = bpm;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
   
}
