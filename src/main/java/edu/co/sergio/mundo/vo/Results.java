/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.vo;

/**
 *
 * @author fabian.giraldo
 */
public class Results {

    private int sid;
    private char cat;
    private int eno;
    private int points;

    public Results(int sid, char cat, int eno, int points) {
        this.sid = sid;
        this.cat = cat;
        this.eno = eno;
        this.points = points;
    }

    public Results() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public char getCat() {
        return cat;
    }

    public void setCat(char cat) {
        this.cat = cat;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    
    
}
