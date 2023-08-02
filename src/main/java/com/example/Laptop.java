package com.example;

import java.util.ArrayList;

public class Laptop {
    private int id;
    private String name;
    private String brand;
    private String processor;
    private String screenInfo;
    private String link;
    private int ram;
    private int storage;
    private double cost;
    private String os;
    private String cpuType;
    private double screenSize;
    private double weight;
    private double batteryLife;
    private boolean touchScreen;
    private boolean backlit;
    private boolean twoInOne;
    private int portability;
    private int benchmark;
    private int warranty;
    private double review;
    private double lifespan;
    public String getScreenInfo() {
        return screenInfo;
    }

    public void setScreenInfo(String screenInfo) {
        this.screenInfo = screenInfo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String url;

    public Laptop(String name, String brand, String processor, String os, int ram, int storage, String url, double weight, String screenInfo, String copyType, int benchmark, double cost, String link) {
        this.name = name;
        this.brand = brand;
        this.processor = processor;
        this.os = os;
        this.ram = ram;
        this.storage = storage;
        this.url = url;
        this.weight = weight;
        this.screenInfo = screenInfo;
        this.cpuType = copyType;
        this.benchmark = benchmark;
        this.cost = cost;
        this.link = link;
    }


    public Laptop(ArrayList<String> laptopSpecs) {
        this.url= LaptopDatabase.getLaptopUrl(Integer.parseInt(laptopSpecs.get(0)));
        this.id = Integer.parseInt(laptopSpecs.get(0));
        this.name = laptopSpecs.get(1);
        this.cost = Double.parseDouble(laptopSpecs.get(2));    
        this.ram = Integer.parseInt(laptopSpecs.get(3));
        this.storage = Integer.parseInt(laptopSpecs.get(4));           
        this.cpuType = laptopSpecs.get(5);
        this.processor = laptopSpecs.get(6);
        this.os = laptopSpecs.get(7);
        this.screenSize = Double.parseDouble(laptopSpecs.get(8));
        this.weight = Double.parseDouble(laptopSpecs.get(9));
        this.batteryLife = Double.parseDouble(laptopSpecs.get(10));     
        this.backlit = Boolean.parseBoolean(laptopSpecs.get(11));
        this.touchScreen = Boolean.parseBoolean(laptopSpecs.get(12));
        this.twoInOne = Boolean.parseBoolean(laptopSpecs.get(13));
        this.portability = Integer.parseInt(laptopSpecs.get(14));
        this.benchmark = Integer.parseInt(laptopSpecs.get(15));
        this.warranty = Integer.parseInt(laptopSpecs.get(16));
        this.review = Double.parseDouble(laptopSpecs.get(17));
         this.brand = laptopSpecs.get(18);
            this.lifespan = Double.parseDouble(laptopSpecs.get(19));
    }
    
    public double getLifespan() {
        return lifespan;
    }

    public void setLifespan(double lifespan) {
        this.lifespan = lifespan;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getProcessor() {
        return processor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public String getCpuType() {
        return cpuType;
    }
    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }
    public double getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getBatteryLife() {
        return batteryLife;
    }
    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }
    public boolean isTouchScreen() {
        return touchScreen;
    }
    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }
    public boolean isBacklit() {
        return backlit;
    }
    public void setBacklit(boolean backlit) {
        this.backlit = backlit;
    }
    public boolean isTwoInOne() {
        return twoInOne;
    }
    public void setTwoInOne(boolean twoInOne) {
        this.twoInOne = twoInOne;
    }
    public int getPortability() {
        return portability;
    }
    public void setPortability(int portability) {
        this.portability = portability;
    }
    public int getBenchmark() {
        return benchmark;
    }
    public void setBenchmark(int benchmark) {
        this.benchmark = benchmark;
    }
    public int getWarranty() {
        return warranty;
    }
    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
    public double getReview() {
        return review;
    }
    public void setReview(double review) {
        this.review = review;
    }
    
    @Override
    public String toString() {
        return "Laptop [backlit=" + backlit + ", batteryLife=" + batteryLife + ", benchmark=" + benchmark + ", brand="
                + brand + ", cost=" + cost + ", cpuType=" + cpuType + ", id=" + id + ", name=" + name + ", os=" + os
                + ", portability=" + portability + ", processor=" + processor + ", ram=" + ram + ", review=" + review
                + ", screenSize=" + screenSize + ", storage=" + storage + ", touchScreen=" + touchScreen + ", twoInOne="
                + twoInOne + ", warranty=" + warranty + ", weight=" + weight + "]";



    }

}