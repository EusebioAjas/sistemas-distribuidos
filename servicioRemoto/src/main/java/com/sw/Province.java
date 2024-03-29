/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sw;

/**
 *
 * @author eusebioajas
 */
import java.io.*;

/**
 * Province class implements Serialable to support mashalling
 */
public class Province implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id_;
    private String shortName_;
    private String name_;

    public Province() {
    }

    public Province(int id, String shortName, String name) {
	id_ = id;
	shortName_ = shortName;
	name_ = name;
    }

    public int getId() {
	return id_;
    }

    public void setId(int id) {
	id_ = id;
    }

    public String getShortName() {
	return shortName_;
    }

    public void setShortName(String shortName) {
	shortName_ = shortName;
    }

    public String getName() {
	return name_;
    }

    public void setName(String name) {
	name_ = name;
    }

    public String toString() {
	return id_ + " - " + shortName_ + " - " + name_;
    }
}
