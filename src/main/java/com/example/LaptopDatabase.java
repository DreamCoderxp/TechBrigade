package com.example;

import java.util.HashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class to manage a database of laptops,
 * providing various methods to fetch laptops based on different criteria.
 * 
 * @author Divya, Manjinder, Jaskaran, Gurleen
 */
public class LaptopDatabase {

    /**
     * Retrieves laptops based on RAM, CPU, and screen size.
     * This method is for the Specifications Filter Page.
     * 
     * @param ram        RAM size in GB.
     * @param cpu        CPU specification as a string.
     * @param screenSize Screen size in inches.
     * @return ArrayList of laptops matching the given specifications.
     */
    protected ArrayList<Laptop> getSpecLaptops(int ram, String cpu, double screenSize) {

        // convert the values to the correct format for comparison
        String ramString = Integer.toString(ram);
        String screenSizeString = Double.toString(screenSize);

        // create an ArrayList to store the laptops
        ArrayList<Laptop> laptops = new ArrayList<Laptop>();

        try {
            // read the laptop data from the CSV file
            File fname = new File("src\\main\\java\\com\\example\\laptopData.csv");
            Scanner input = new Scanner(fname);

            // loop through each line of the CSV file
            while (input.hasNext()) {
                //split the line into an array of strings
                String[] laptopData = input.nextLine().split(",");

                // remove the quotation marks from each string
                for (int i = 0; i < laptopData.length; i++) {
                    laptopData[i] = laptopData[i].replaceAll("\"", "");
                }

                // check if the laptop matches the given specifications
                if (laptopData[3].equals(ramString) && laptopData[5].equals(cpu)
                        && laptopData[8].equals(screenSizeString)) {

                    // create an ArrayList to store the laptops that match the specifications
                    ArrayList<String> laptopSpecs = new ArrayList<String>();

                    // add each string from the laptopData array to the laptopSpecs ArrayList
                    for (int i = 0; i < laptopData.length; i++) {
                        laptopSpecs.add(laptopData[i]);
                    }

                    // create a new Laptop object with the laptopSpecs ArrayList
                    //the arraylist is passed to the constructor of the laptop class
                    //the constructor then sets the values of the laptop object's
                    //corresponding fields
                    //see the Laptop class for more details
                    Laptop laptop = new Laptop(laptopSpecs);

                    // add the laptop to the laptops ArrayList
                    //this ArrayList will be returned at the end of the method
                    //and used by the SpecificationController class
                    laptops.add(laptop);

                }
            }
            input.close();

        } catch (Exception e) {
            System.out.println("File not found");
        }
        return laptops;
    }

    /**
     * Retrieves laptops based on portability.
     * This method is for the Portability Page.
     * 
     * @param portability Portability score as an integer.
     * @return ArrayList of laptops matching the given portability.
     */
    protected ArrayList<Laptop> getPortableLaptops(int portability) {

        // convert the portability score to the correct format for comparison
        String portabilityString = Integer.toString(portability);

        // create an ArrayList to store the laptops
        ArrayList<Laptop> laptops = new ArrayList<Laptop>();

        try {
            File fname = new File("src\\main\\java\\com\\example\\laptopData.csv");
            Scanner input = new Scanner(fname);

            while (input.hasNext()) {
                String[] laptopData = input.nextLine().split(",");

                for (int i = 0; i < laptopData.length; i++) {
                    laptopData[i] = laptopData[i].replaceAll("\"", "");
                }

                // check if the laptop matches the given portability score
                if (laptopData[14].equals(portabilityString)) {

                    ArrayList<String> laptopSpecs = new ArrayList<String>();

                    for (int i = 0; i < laptopData.length; i++) {
                        laptopSpecs.add(laptopData[i]);
                    }

                    // create a new Laptop object with the laptopSpecs ArrayList
                    Laptop laptop = new Laptop(laptopSpecs);
                    laptops.add(laptop);
                }
            }
            input.close();

        } catch (Exception e) {
            System.out.println("File not found");
        }
        return laptops;

    }

    /**
     * Retrieves laptops based on processor.
     * This method is for the Pupose Picker Page.
     * see the CostSavingController class for more details.
     * 
     * @param processor Processor specification as a string.
     * @return ArrayList of laptops matching the given processor.
     */
    protected ArrayList<Laptop> getCostLaptops(String processor) {
        ArrayList<Laptop> laptops = new ArrayList<Laptop>();

        try {
            File fname = new File("src\\main\\java\\com\\example\\laptopData.csv");
            Scanner input = new Scanner(fname);

            while (input.hasNext()) {
                String[] laptopData = input.nextLine().split(",");

                for (int i = 0; i < laptopData.length; i++) {
                    laptopData[i] = laptopData[i].replaceAll("\"", "");
                }

                // check if the laptop matches the given processor
                if (laptopData[6].equals(processor)) {

                    ArrayList<String> laptopSpecs = new ArrayList<String>();

                    for (int i = 0; i < laptopData.length; i++) {
                        laptopSpecs.add(laptopData[i]);
                    }

                    Laptop laptop = new Laptop(laptopSpecs);
                    laptops.add(laptop);
                }
            }
            input.close();

        } catch (Exception e) {
            System.out.println("File not found");
        }
        return laptops;

    }

    /**
     * Retrieves laptops based on brand.
     * This method is for the LifeSpan Estimation Page.
     * 
     * @param brand Brand name as a string.
     * @return ArrayList of laptops matching the given brand.
     */
    protected ArrayList<Laptop> getBrandLaptops(String brand) {
        ArrayList<Laptop> laptops = new ArrayList<Laptop>();

        try {
            File fname = new File("src\\main\\java\\com\\example\\laptopData.csv");
            Scanner input = new Scanner(fname);

            while (input.hasNext()) {
                String[] laptopData = input.nextLine().split(",");

                for (int i = 0; i < laptopData.length; i++) {
                    laptopData[i] = laptopData[i].replaceAll("\"", "");
                }

                // check if the laptop matches the given brand
                if (laptopData[18].equals(brand)) {

                    ArrayList<String> laptopSpecs = new ArrayList<String>();

                    // add each string from the laptopData array to the laptopSpecs ArrayList
                    for (int i = 0; i < laptopData.length; i++) {
                        laptopSpecs.add(laptopData[i]);
                    }

                    // create a new Laptop object with the laptopSpecs ArrayList
                    Laptop laptop = new Laptop(laptopSpecs);
                    laptops.add(laptop);
                }
            }
            input.close();

        } catch (Exception e) {
            System.out.println("File not found");
        }
        return laptops;
    }

    /**
     * Retrieves laptops based on benchmark performance.
     * This method is for the Program Tailored Page.
     * 
     * @param benchmark Benchmark performance as a string.
     * @return ArrayList of laptops matching the given benchmark.
     */
    protected ArrayList<Laptop> getProgramLaptops(String benchmark) {
        ArrayList<Laptop> laptops = new ArrayList<Laptop>();

        try {
            File fname = new File("src\\main\\java\\com\\example\\laptopData.csv");
            Scanner input = new Scanner(fname);

            while (input.hasNext()) {
                //split the line into an array of strings
                String[] laptopData = input.nextLine().split(",");

                // remove the quotation marks from each string
                for (int i = 0; i < laptopData.length; i++) {
                    laptopData[i] = laptopData[i].replaceAll("\"", "");
                }

                // check if the laptop matches the given benchmark
                if (laptopData[15].equals(benchmark)) {

                    ArrayList<String> laptopSpecs = new ArrayList<String>();

                    // add each string from the laptopData array to the laptopSpecs ArrayList
                    for (int i = 0; i < laptopData.length; i++) {
                        laptopSpecs.add(laptopData[i]);
                    }

                    // create a new Laptop object with the laptopSpecs ArrayList
                    Laptop laptop = new Laptop(laptopSpecs);
                    laptops.add(laptop);
                }
            }
            input.close();

        } catch (Exception e) {
            System.out.println("File not found");
        }
        // return the ArrayList of laptops
        return laptops;

    }

    /**
     * Compares two laptops based on their names.
     * This method is for the Comparison Page.
     * 
     * @param laptopA Name of the first laptop.
     * @param laptopB Name of the second laptop.
     * @return ArrayList containing details of the two laptops.
     */
    protected ArrayList<Laptop> getComparedLaptops(String laptopA, String laptopB) {

        ArrayList<Laptop> laptops = new ArrayList<Laptop>();

        try {
            // read the laptop data from the CSV file
            File fname = new File("src\\main\\java\\com\\example\\laptopData.csv");
            Scanner input = new Scanner(fname);

            // loop through each line of the CSV file
            while (input.hasNext()) {

                //split the line into an array of strings
                String[] laptopData = input.nextLine().split(",");

                // remove the quotation marks from each string
                for (int i = 0; i < laptopData.length; i++) {
                    laptopData[i] = laptopData[i].replaceAll("\"", "");

                }

                // check if the laptop matches the given names
                if (laptopData[1].equals(laptopA) || laptopData[1].equals(laptopB)) {
                    ArrayList<String> laptopSpecs = new ArrayList<String>();

                    for (int i = 0; i < laptopData.length; i++) {
                        laptopSpecs.add(laptopData[i]);
                    }

                    // create a new Laptop object with the laptopSpecs ArrayList
                    Laptop laptop = new Laptop(laptopSpecs);
                    laptops.add(laptop);

                }
            }
            input.close();

        } catch (Exception e) {
            System.out.println("File not found");
        }
        // return the ArrayList of laptops
        return laptops;
    }

    /**
     * Retrieves laptops based on additional features.
     * This method is for the Additional Features Page.
     * 
     * @param signal Signal to determine which feature to look for: 1 for Backlit, 2 for Touchscreen, 3 for 2-in-1.
     * @return ArrayList of laptops with the specified additional feature.
     */
    protected ArrayList<Laptop> getAdditionalFeatLaptops(int signal) {
        // create an ArrayList to store the laptops
        ArrayList<Laptop> laptops = new ArrayList<Laptop>();

        // create a Laptop object
        Laptop laptop = null;

        try {
            // read the laptop data from the CSV file
            File fname = new File("src\\main\\java\\com\\example\\laptopData.csv");
            Scanner input = new Scanner(fname);


            /* The following code is used to filter the laptops based on the additional features.
                * The signal variable is used to determine which feature to look for.
                * If the signal is 1, the laptops with backlit keyboard are filtered.
                * If the signal is 2, the laptops with touchscreen are filtered.
                * If the signal is 3, the laptops which are 2-in-1 are filtered.
                The signal variable is set in the AdditionalFeatureController class.

                At once, only one of the above three features would be filtered.
                Hence, we added alternative if blocks instead of if-else blocks.
               * 
             */

            // loop through each line of the CSV file
            while (input.hasNext()) {

                //split the line into an array of strings
                String[] laptopData = input.nextLine().split(",");

                // remove the quotation marks from each string
                for (int i = 0; i < laptopData.length; i++) {
                    laptopData[i] = laptopData[i].replaceAll("\"", "");
                }

            
                // This if block filters the laptops which have backlit keyboard
                //Backlit keyboard is at the index 11 in the csv file
                if (signal == 1 && laptopData[11].equals("True")) {

                    ArrayList<String> laptopSpecs = new ArrayList<String>();

                    // add each string from the laptopData array to the laptopSpecs ArrayList
                    for (int i = 0; i < laptopData.length; i++) {
                        laptopSpecs.add(laptopData[i]);
                    }

                    // create a new Laptop object with the laptopSpecs ArrayList
                    laptop = new Laptop(laptopSpecs);
                    laptops.add(laptop);
                } 
                // This if block filters the laptops which have touchscreen
                //Touchscreen is at the index 12 in the csv file
                else if (signal == 2 && laptopData[12].equals("True")) {

                    ArrayList<String> laptopSpecs = new ArrayList<String>();

                    for (int i = 0; i < laptopData.length; i++) {
                        laptopSpecs.add(laptopData[i]);
                    }

                    laptop = new Laptop(laptopSpecs);
                    laptops.add(laptop);

                } 
                // This if block filters the laptops which are 2-in-1
                //2-in-1 is at the index 13 in the csv file
                else if (signal == 3 && laptopData[13].equals("True")) {

                    ArrayList<String> laptopSpecs = new ArrayList<String>();

                    for (int i = 0; i < laptopData.length; i++) {
                        laptopSpecs.add(laptopData[i]);
                    }

                    // create a new Laptop object with the laptopSpecs ArrayList
                    laptop = new Laptop(laptopSpecs);
                    laptops.add(laptop);

                }
            }
            input.close();

        } catch (Exception e) {
            System.out.println("File not found");
        }
        return laptops;

    }

     /**
     * Retrieves the URL of a laptop image based on its ID.
     * 
     * @param id The ID of the laptop.
     * @return The URL of the laptop image.
     */
    protected static String getLaptopUrl(int id) {
        HashMap<Integer, String> laptopUrls = new HashMap<>();

          // URLs mapping
        laptopUrls.put(1,
                "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/refurb-mbp16touch-space-gallery-2019?wid=1144&hei=1144&fmt=jpeg&qlt=90&.v=1582233094527");
        laptopUrls.put(2,
                "https://i.dell.com/is/image/DellContent/content/dam/ss2/product-images/dell-client-products/notebooks/xps-notebooks/xps-15-9520/media-gallery/white/laptop-xps-9520-t-white-gallery-3.psd?fmt=png-alpha&pscan=auto&scl=1&hei=402&wid=653&qlt=100,1&resMode=sharp2&size=653,402&chrss=full");
        laptopUrls.put(3,
                "https://p2-ofp.static.pub/ShareResource/na/products/yoga/400x300/lenovo-yoga-7i-14inch-gen8-storm-grey.png");
        laptopUrls.put(4, "https://m.media-amazon.com/images/I/61erdeAHHwL._AC_UF894,1000_QL80_.jpg");
        laptopUrls.put(5, "https://dlcdnwebimgs.asus.com/gain/4dded041-5e38-4e6e-9ef6-57a87418e45e/");
        laptopUrls.put(6,
                "https://www.tradeinn.com/f/13917/139174161/acer-aspire-a315-56-15.6-i5-1035g1-8gb-512gb-ssd-laptop.jpg");
        laptopUrls.put(7,
                "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/refurb-macbook-air-gold-m1-202010?wid=1144&hei=1144&fmt=jpeg&qlt=90&.v=1634145607000");
        laptopUrls.put(8, "https://m.media-amazon.com/images/I/61UzQXq68uL.jpg");
        laptopUrls.put(9,
                "https://shop-cdncname.huawei.com/fr/pms/uomcdn/FRHW/pms/202203/gbom/6901443434664/428_428_F5DAD57C0E424382AFB7CEE158715F61mp.png");
        laptopUrls.put(10, "https://m.media-amazon.com/images/I/617xAAmW2eL.jpg");
        laptopUrls.put(11,
                "https://image-us.samsung.com/SamsungUS/computing/windows-laptops/galaxy-book-pro/04_Battery_Charging_15inch_MO_Asset.jpg?$feature-benefit-bottom-mobile-jpg$");
        laptopUrls.put(12, "https://m.media-amazon.com/images/I/81sDDc7rKqL._AC_UF894,1000_QL80_.jpg");
        laptopUrls.put(13, "https://m.media-amazon.com/images/I/61enrCge7ML.jpg");
        laptopUrls.put(14, "https://m.media-amazon.com/images/I/814gd62UasL._AC_UF894,1000_QL80_.jpg");
        laptopUrls.put(15, "https://m.media-amazon.com/images/I/61wCLaUQjbS._AC_UF894,1000_QL80_.jpg");
        laptopUrls.put(16, "https://ccimg.canadacomputers.com/Products/1000x1000/135/4186/220421/23780.jpg");
        laptopUrls.put(17, "https://m.media-amazon.com/images/I/71+Rn0JtpqL.jpg");
        laptopUrls.put(18, "https://p4-ofp.static.pub/fes/cms/2022/06/16/s444ye7sqwg6rv1b8on54vm77eopra543125.png");
        laptopUrls.put(19, "https://m.media-amazon.com/images/I/61SP1frHPxL._AC_UF1000,1000_QL80_.jpg");
        laptopUrls.put(20, "https://m.media-amazon.com/images/I/31rWPyBCMCL._AC_.jpg");
        laptopUrls.put(21, "https://m.media-amazon.com/images/I/61XAHBl+wyL._AC_UF894,1000_QL80_.jpg");
        laptopUrls.put(22, "https://a-power.com/app/uploads/2020/02/75777930_2553509442-600x390.png");
        laptopUrls.put(23,
                "https://p1-ofp.static.pub/medias/bWFzdGVyfHJvb3R8MzAwNjk2fGltYWdlL3BuZ3xoN2QvaGVjLzEwNzE5MTk4MzQ3Mjk0LnBuZ3xjYjUwNjk0ZmQ4ZDVlYjliODk3MzBiZGZlYmEzMWRhZDM3ZjM3NTIwNjExYzBmMTA5MDU4YzYyNWZiM2Y4OGNm/lenovo-laptop-yoga-slim-7-14-amd-subseries-hero.png");
        laptopUrls.put(24, "https://m.media-amazon.com/images/I/71CPvPxXvXL._AC_UF894,1000_QL80_.jpg");
        laptopUrls.put(25,
                "https://img-prod-cms-rt-microsoft-com.akamaized.net/cms/api/am/imageFileData/RE4u7tz?ver=6f6f");
        laptopUrls.put(26, "https://m.media-amazon.com/images/I/61-EN1HSS5L._AC_UF894,1000_QL80_.jpg");
        laptopUrls.put(27,
                "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/macbook-air-space-gray-select-201810?wid=904&hei=840&fmt=jpeg&qlt=90&.v=1664472289661");
        laptopUrls.put(28, "https://m.media-amazon.com/images/I/8125V8myTdL._AC_UF894,1000_QL80_.jpg");
        laptopUrls.put(29, "https://m.media-amazon.com/images/I/61ACpD7Q1tL._AC_UF894,1000_QL80_.jpg");
        laptopUrls.put(30, "https://www.lg.com/ca_en/images/laptops/md07521394/gallery/D_01.jpg");

        // return the URL of the image of the laptop with the given ID
        return laptopUrls.get(id);
    }
}
