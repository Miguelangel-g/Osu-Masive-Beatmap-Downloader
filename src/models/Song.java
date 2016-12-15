
package models;

import java.util.ArrayList;

public class Song {
    ArrayList ID;
    ArrayList status;
    ArrayList date;
    ArrayList creator;
    ArrayList<ArrayList<Beatmap>> Beatmap;

    public Song(ArrayList ID, ArrayList status, ArrayList date, ArrayList creator, ArrayList<ArrayList<Beatmap>> Beatmap) {
        this.ID = ID;
        this.status = status;
        this.date = date;
        this.creator = creator;
        this.Beatmap = Beatmap;
    }

    
    public ArrayList getID() {
        return ID;
    }
    

    public void setID(ArrayList ID) {
        this.ID = ID;
    }
    
    public ArrayList getStatus() {
        return status;
    }

    public void setStatus(ArrayList status) {
        this.status = status;
    }

    public ArrayList getDate() {
        return date;
    }

    public void setDate(ArrayList date) {
        this.date = date;
    }

    public ArrayList getCreator() {
        return creator;
    }

    public void setCreator(ArrayList creator) {
        this.creator = creator;
    }

    public ArrayList<ArrayList<Beatmap>> getBeatmap() {
        return Beatmap;
    }

    public void setBeatmap(ArrayList<ArrayList<Beatmap>> Beatmap) {
        this.Beatmap = Beatmap;
    }

}

