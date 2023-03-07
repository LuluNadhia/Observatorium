/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

import javax.swing.JFrame;

/**
 *
 * @author HP RYZEN 3
 */
public class ComputerManager extends JFrame implements Search, CRUD{
    private Computer comp;

    @Override
    public Computer searchByid(int compid) {
        return null;
    }

    @Override
    public Computer searchByBrand(String brand) {
        return null; 
    }

    @Override
    public void creatData(Computer comp) {
        this.comp = comp;
    }

    @Override
    public void readData() {
    }

    @Override
    public void updateData(Computer comp) {
        this.comp = comp;
    }

    @Override
    public void deletData(int compid) {
    }
}
