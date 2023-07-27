package com.example;

public class Laptop {
    private String name;
    private String cpu;
    private int ram;
    private int storage;
    private String storageType;
    private double weight;
    private String screenSize;
    private String ports;
    private int geekbenchScore;
    private double price;

    public Laptop(String name, String cpu, int ram, int storage, String storageType, double weight, String screenSize, String ports, int geekbenchScore, double price) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.storageType = storageType;
        this.weight = weight;
        this.screenSize = screenSize;
        this.ports = ports;
        this.geekbenchScore = geekbenchScore;
        this.price = price;
    }

    // Add your getter and setter methods here...

    public String getName() {
        	return name;
    }

    public String getCpu() {
    	return cpu;
    }

    public int getRam() {
    	return ram;
    }

    public int getStorage() {
    	return storage;
    }

    public String getStorageType() {
    	return storageType;
    }

    public double getWeight() {
    	return weight;
    }

    public String getScreenSize() {
    	return screenSize;
    }

    public String getPorts() {
    	return ports;
    }

    public int getGeekbenchScore() {
    	return geekbenchScore;
    }

    public double getPrice() {
    	return price;
    }

    //make setters protected against bad input
    public void setName(String name) {
    	if(name == null || name.length() == 0) {
    		throw new IllegalArgumentException("Name cannot be empty");
    	} else {
    		this.name = name;
    	}
    }

    public void setCpu(String cpu) {
    	if(cpu == null || cpu.length() == 0) {
    		throw new IllegalArgumentException("CPU cannot be empty");
    	} else {
    		this.cpu = cpu;
    	}
    }

    public void setRam(int ram) {
    	if(ram < 0 ) {
    		throw new IllegalArgumentException("RAM cannot be negative");
    	} else if (ram > 256) {
    		throw new IllegalArgumentException("RAM cannot be greater than 256 GB");
    	} else {
    		this.ram = ram;
    	}
    }

    public void setStorage(int storage) {
    	if(storage < 64) {
    		throw new IllegalArgumentException("Storage cannot be negative");
    	} else if (storage > 10000) {
    		throw new IllegalArgumentException("Storage cannot be greater than 10000 GB");
    	} else {
    		this.storage = storage;
    	}
    }

    public void setStorageType(String storageType) {
    	if(storageType == null || storageType.length() == 0) {
    		throw new IllegalArgumentException("Storage type cannot be empty");
    	} else if(!(storageType.equals("SSD") || storageType.equals("HDD"))) {
    		throw new IllegalArgumentException("Storage type must be either SSD or HDD");
    	} else {
    		this.storageType = storageType;
    	}
    }

    public void setWeight(double weight) {
    	if(weight < 0) {
    		throw new IllegalArgumentException("Weight cannot be negative");
    	} else if (weight > 10) {
    		throw new IllegalArgumentException("Weight cannot be greater than 10 Kilograms");
    	} else {
    		this.weight = weight;
    	}
    }

    public void setScreenSize(String screenSize) {
    	if(screenSize == null || screenSize.length() == 0) {
    		throw new IllegalArgumentException("Screen size cannot be empty");
    	}else {
    		this.screenSize = screenSize;
    	}
    }

    public void setPorts(String ports) {
    	if(ports == null || ports.length() == 0) {
    		throw new IllegalArgumentException("Ports cannot be empty");
    	} else {
    		this.ports = ports;
    	}
    }

    public void setGeekbenchScore(int geekbenchScore) {
    	if(geekbenchScore < 0) {
    		throw new IllegalArgumentException("Geekbench MultiCore score cannot be negative");
    	} else if (geekbenchScore > 30000) {
    		throw new IllegalArgumentException("Geekbench MultiCore score cannot be greater than 30000");
    	} else {
    		this.geekbenchScore = geekbenchScore;
    	}
    }

    public void setPrice(double price) {
    	if(price < 0) {
    		throw new IllegalArgumentException("Price cannot be negative");
    	} else if (price > 10000) {
    		throw new IllegalArgumentException("Price cannot be greater than $10000");
    	} else {
    		this.price = price;
    	}
    }


    @Override
    public String toString() {
        return "Laptop: " + name + ", CPU: " + cpu + ", RAM: " + ram + "GB, Storage: " + storage + storageType + ", Weight: " + weight + "kg, Screen Size: " + screenSize +
                ", Ports: " + ports + ", Geekbench Score: " + geekbenchScore + ", Price: $" + price;
    }
}
