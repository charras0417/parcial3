/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.vo;

/**
 *
 * @author LabingI5
 */
public class exercises {
    
    private char cat;
    private int eno;
    private String topic;
    private int maxpt;

    public exercises(char cat, int eno, String topic, int maxpt) {
        this.cat = cat;
        this.eno = eno;
        this.topic = topic;
        this.maxpt = maxpt;
    }

    public exercises() {
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

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getMaxpt() {
        return maxpt;
    }

    public void setMaxpt(int maxpt) {
        this.maxpt = maxpt;
    }
    
    como va eso =?
    
}
