package com.example.builderdp;

public class Phone {
    private String name;
    private int ram;
    private int camera;
    private int rom;
    private String model;

    public Phone(String name, int ram, int camera, int rom, String model) {
        this.name = name;
        this.ram = ram;
        this.camera = camera;
        this.rom = rom;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", camera=" + camera +
                ", rom=" + rom +
                ", model='" + model + '\'' +
                '}';
    }
}
