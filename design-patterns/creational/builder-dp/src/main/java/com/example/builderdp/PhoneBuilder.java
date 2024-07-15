package com.example.builderdp;

public class PhoneBuilder {

    /*Builder and phone should have exact same params and number of params
    * and all setters should return builder object
    * ex: StringBuilder*/
    private String name;
    private int ram;
    private int camera;
    private int rom;
    private String model;

    public PhoneBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setCamera(int camera) {
        this.camera = camera;
        return this;
    }

    public PhoneBuilder setRom(int rom) {
        this.rom = rom;
        return this;
    }

    public PhoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public Phone build(){
        return new Phone(name, ram, camera, rom, model);
    }
}
