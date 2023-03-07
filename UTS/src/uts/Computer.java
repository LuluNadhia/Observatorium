/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author HP RYZEN 3
 */
public class Computer {
    private int compid;
    private String brand;
    private String model;
    private String disk;
    private int ram;
    private String gpu;
    private String cpu;
    private int Release;
    
    // Menerapkan enkapsulasi di semua atribut 
    public int getCompld() {
        return compid;
    }

    public void setCompld(int compld) {
        this.compid = compld;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRelease() {
        return Release;
    }

    public void setRelease(int Release) {
        this.Release = Release;
    }
    
    
    // buatlah 3 konstruktor pada class Computer dengan metode overloading
    private Computer(){}
    private Computer(int ram, String disk){}
    private Computer(String cpu,String gpu){}

    
}
