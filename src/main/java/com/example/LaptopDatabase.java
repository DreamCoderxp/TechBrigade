package com.example;


import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LaptopDatabase {
 
    protected ArrayList<Laptop> getSpecLaptops(int ram,String cpu, double screenSize) {
            String ramString = Integer.toString(ram);
            String screenSizeString = Double.toString(screenSize);

            
              ArrayList<Laptop> laptops = new ArrayList<Laptop>();

        try {
            File fname= new File("src\\main\\java\\com\\example\\laptopData.csv");
            Scanner input = new Scanner(fname);

            while (input.hasNext()) {
            //System.out.println(input.nextLine());
            String[] laptopData = input.nextLine().split(",");

            for(int i=0;i<laptopData.length;i++) {
                laptopData[i] = laptopData[i].replaceAll("\"", "");
            }
                //we will convert screensizes to double before comparing
                if(laptopData[3].equals(ramString)&& laptopData[5].equals(cpu)&& laptopData[8].equals(screenSizeString)) {
                   

                    ArrayList<String> laptopSpecs = new ArrayList<String>();

                    for(int i=0;i<laptopData.length;i++) {
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

    protected ArrayList<Laptop> getPortableLaptops(int portability) {
        String portabilityString = Integer.toString(portability);

         ArrayList<Laptop> laptops = new ArrayList<Laptop>();
        
        try {
            File fname= new File("src\\main\\java\\com\\example\\laptopData.csv");
            Scanner input = new Scanner(fname);

            while (input.hasNext()) {
            //System.out.println(input.nextLine());
            String[] laptopData = input.nextLine().split(",");

            for(int i=0;i<laptopData.length;i++) {
                laptopData[i] = laptopData[i].replaceAll("\"", "");
            }
                
                if(laptopData[14].equals(portabilityString)) {
                    

                    ArrayList<String> laptopSpecs = new ArrayList<String>();

                    for(int i=0;i<laptopData.length;i++) {
                        laptopSpecs.add(laptopData[i]);
                    }

                    // //print the laptopSpecs
                    // for(int i=0;i<laptopSpecs.size();i++) {
                    //     System.out.println(laptopSpecs.get(i));
                    // }
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
    protected ArrayList<Laptop> getCostLaptops(String processor) {
        ArrayList<Laptop> laptops = new ArrayList<Laptop>();
        
        try {
            File fname= new File("src\\main\\java\\com\\example\\laptopData.csv");
            Scanner input = new Scanner(fname);

            while (input.hasNext()) {
            //System.out.println(input.nextLine());
            String[] laptopData = input.nextLine().split(",");

            for(int i=0;i<laptopData.length;i++) {
                laptopData[i] = laptopData[i].replaceAll("\"", "");
            }
                
                if(laptopData[6].equals(processor)) {
                    
                    ArrayList<String> laptopSpecs = new ArrayList<String>();

                    for(int i=0;i<laptopData.length;i++) {
                        laptopSpecs.add(laptopData[i]);
                    }

                    // //print the laptopSpecs
                    // for(int i=0;i<laptopSpecs.size();i++) {
                    //     System.out.println(laptopSpecs.get(i));
                    // }
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

    protected ArrayList<Laptop> getBrandLaptops(String brand) {
        ArrayList<Laptop> laptops = new ArrayList<Laptop>();
        
        try {
            File fname= new File("src\\main\\java\\com\\example\\laptopData.csv");
            Scanner input = new Scanner(fname);

            while (input.hasNext()) {
            //System.out.println(input.nextLine());
            String[] laptopData = input.nextLine().split(",");

            for(int i=0;i<laptopData.length;i++) {
                laptopData[i] = laptopData[i].replaceAll("\"", "");
            }
                
                if(laptopData[18].equals(brand)) {
                    
                    ArrayList<String> laptopSpecs = new ArrayList<String>();

                    for(int i=0;i<laptopData.length;i++) {
                        laptopSpecs.add(laptopData[i]);
                    }

                    // //print the laptopSpecs
                    // for(int i=0;i<laptopSpecs.size();i++) {
                    //     System.out.println(laptopSpecs.get(i));
                    // }
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

    protected ArrayList<Laptop> getComparedLaptops(String laptopA, String laptopB) {

        ArrayList<Laptop> laptops = new ArrayList<Laptop>();
        
        try {
            File fname= new File("src\\main\\java\\com\\example\\laptopData.csv");
            Scanner input = new Scanner(fname);

            while (input.hasNext()) {
            //System.out.println(input.nextLine());
            String[] laptopData = input.nextLine().split(",");

            for(int i=0;i<laptopData.length;i++) {
                laptopData[i] = laptopData[i].replaceAll("\"", "");
                
            }
                
                if(laptopData[1].equals(laptopA)||laptopData[1].equals(laptopB)) {                   
                    ArrayList<String> laptopSpecs = new ArrayList<String>();

                    for(int i=0;i<laptopData.length;i++) {
                        laptopSpecs.add(laptopData[i]);
                    }

                    //print the laptopSpecs
                    for(int i=0;i<laptopSpecs.size();i++) {
                        System.out.println(laptopSpecs.get(i));
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

    protected ArrayList<Laptop> getAdditionalFeatLaptops(int signal)  {
        ArrayList<Laptop> laptops = new ArrayList<Laptop>();

        System.out.println("Signal: "+signal);
        Laptop laptop=null;

        try {
            File fname= new File("src\\main\\java\\com\\example\\laptopData.csv");
            Scanner input = new Scanner(fname);

            while (input.hasNext()) {
            //System.out.println(input.nextLine());
            String[] laptopData = input.nextLine().split(",");

            for(int i=0;i<laptopData.length;i++) {
                laptopData[i] = laptopData[i].replaceAll("\"", "");
            }
                
                if (signal==1 && laptopData[11].equals("True")) {
                    //if (laptopData[11].equals("TRUE")) {
                        //System.out.println("True found here ");
                        ArrayList<String> laptopSpecs = new ArrayList<String>();

                        for(int i=0;i<laptopData.length;i++) {
                            laptopSpecs.add(laptopData[i]);
                        }

                        // //print the laptopSpecs
                        // for(int i=0;i<laptopSpecs.size();i++) {
                        //     System.out.println(laptopSpecs.get(i));
                        // }
                        laptop = new Laptop(laptopSpecs);
                        laptops.add(laptop);
                    }
                        else if (signal==2 && laptopData[12].equals("True")) {
                   // if (laptopData[12].equals("TRUE")) {
                        ArrayList<String> laptopSpecs = new ArrayList<String>();

                        for(int i=0;i<laptopData.length;i++) {
                            laptopSpecs.add(laptopData[i]);
                        }

                        // //print the laptopSpecs
                        // for(int i=0;i<laptopSpecs.size();i++) {
                        //     System.out.println(laptopSpecs.get(i));
                        // }
                        laptop = new Laptop(laptopSpecs);
                        laptops.add(laptop);
                    //}
                } else if (signal==3 && laptopData[13].equals("True")) {
                    //if (laptopData[13].equals("TRUE")) {
                        ArrayList<String> laptopSpecs = new ArrayList<String>();

                        for(int i=0;i<laptopData.length;i++) {
                            laptopSpecs.add(laptopData[i]);
                        }

                        // //print the laptopSpecs
                        // for(int i=0;i<laptopSpecs.size();i++) {
                        //     System.out.println(laptopSpecs.get(i));
                        // }
                        laptop = new Laptop(laptopSpecs);
                        laptops.add(laptop);
                    //}

                }
                // if(laptopData[12].equals("TRUE")&&laptopData[13].equals("TRUE")) {
                    
                //     ArrayList<String> laptopSpecs = new ArrayList<String>();

                //     for(int i=0;i<laptopData.length;i++) {
                //         laptopSpecs.add(laptopData[i]);
                //     }

                //     // //print the laptopSpecs
                //     // for(int i=0;i<laptopSpecs.size();i++) {
                //     //     System.out.println(laptopSpecs.get(i));
                //     // }
                //     Laptop laptop = new Laptop(laptopSpecs);
                //     laptops.add(laptop);
                // }
            }
            input.close();
            
        } catch (Exception e) {
            System.out.println("File not found");
        }

        System.out.println(laptops.size()+ " laptops found");
        return laptops;


    }
        protected static String getLaptopUrl(int id) { 
            if (id==1) {
                return "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/refurb-mbp16touch-space-gallery-2019?wid=1144&hei=1144&fmt=jpeg&qlt=90&.v=1582233094527";
            } else if (id==2) {
                return "https://i.dell.com/is/image/DellContent/content/dam/ss2/product-images/dell-client-products/notebooks/xps-notebooks/xps-15-9520/media-gallery/white/laptop-xps-9520-t-white-gallery-3.psd?fmt=png-alpha&pscan=auto&scl=1&hei=402&wid=653&qlt=100,1&resMode=sharp2&size=653,402&chrss=full";
            } else if (id==3) {
                return "https://p2-ofp.static.pub/ShareResource/na/products/yoga/400x300/lenovo-yoga-7i-14inch-gen8-storm-grey.png";
            } else if (id==4) {
                return "https://m.media-amazon.com/images/I/61erdeAHHwL._AC_UF894,1000_QL80_.jpg";
            } else if (id==5) {
                return "https://dlcdnwebimgs.asus.com/gain/4dded041-5e38-4e6e-9ef6-57a87418e45e/";
            } else if (id==6) {
                return "https://www.tradeinn.com/f/13917/139174161/acer-aspire-a315-56-15.6-i5-1035g1-8gb-512gb-ssd-laptop.jpg";
            } else if (id==7) {
                return "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/refurb-macbook-air-gold-m1-202010?wid=1144&hei=1144&fmt=jpeg&qlt=90&.v=1634145607000";
            } else if (id==8) {
                return "https://m.media-amazon.com/images/I/61UzQXq68uL.jpg";
            } else if (id==9) { 
                return "https://shop-cdncname.huawei.com/fr/pms/uomcdn/FRHW/pms/202203/gbom/6901443434664/428_428_F5DAD57C0E424382AFB7CEE158715F61mp.png";
            } else if (id==10) {
                return "https://m.media-amazon.com/images/I/617xAAmW2eL.jpg";
            } else if (id==11) {
                return "https://image-us.samsung.com/SamsungUS/computing/windows-laptops/galaxy-book-pro/04_Battery_Charging_15inch_MO_Asset.jpg?$feature-benefit-bottom-mobile-jpg$";
            } else if (id==12) {
                return "https://m.media-amazon.com/images/I/81sDDc7rKqL._AC_UF894,1000_QL80_.jpg";
            } else if (id==13) {
                return "https://m.media-amazon.com/images/I/61enrCge7ML.jpg";
            } else if (id==14) {
                return "https://m.media-amazon.com/images/I/814gd62UasL._AC_UF894,1000_QL80_.jpg";
            } else if (id==15) {
                return "https://m.media-amazon.com/images/I/61wCLaUQjbS._AC_UF894,1000_QL80_.jpg";
            } else if (id==16) {
                return "https://ccimg.canadacomputers.com/Products/1000x1000/135/4186/220421/23780.jpg";
            } else if (id==17) {
                return "https://m.media-amazon.com/images/I/71+Rn0JtpqL.jpg";
            } else if (id==18) {
                return "https://p4-ofp.static.pub/fes/cms/2022/06/16/s444ye7sqwg6rv1b8on54vm77eopra543125.png";
            } else if (id==19) {
                return "https://m.media-amazon.com/images/I/61SP1frHPxL._AC_UF1000,1000_QL80_.jpg";
            } else if (id==20) {
                return "https://m.media-amazon.com/images/I/31rWPyBCMCL._AC_.jpg";
            } else if (id==21) {
                return "https://m.media-amazon.com/images/I/61XAHBl+wyL._AC_UF894,1000_QL80_.jpg";
            } else if (id==22) {
                return "https://a-power.com/app/uploads/2020/02/75777930_2553509442-600x390.png";
            } else if (id==23) {
                return "https://p1-ofp.static.pub/medias/bWFzdGVyfHJvb3R8MzAwNjk2fGltYWdlL3BuZ3xoN2QvaGVjLzEwNzE5MTk4MzQ3Mjk0LnBuZ3xjYjUwNjk0ZmQ4ZDVlYjliODk3MzBiZGZlYmEzMWRhZDM3ZjM3NTIwNjExYzBmMTA5MDU4YzYyNWZiM2Y4OGNm/lenovo-laptop-yoga-slim-7-14-amd-subseries-hero.png";
            } else if (id==24) {
                return "https://m.media-amazon.com/images/I/71CPvPxXvXL._AC_UF894,1000_QL80_.jpg";
            } else if (id==25) {
                return "https://img-prod-cms-rt-microsoft-com.akamaized.net/cms/api/am/imageFileData/RE4u7tz?ver=6f6f";
            } else if (id==26) {
                return "https://m.media-amazon.com/images/I/61-EN1HSS5L._AC_UF894,1000_QL80_.jpg";
            } else if (id==27) {
                return "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/macbook-air-space-gray-select-201810?wid=904&hei=840&fmt=jpeg&qlt=90&.v=1664472289661";
            } else if (id==28) {
                return "https://m.media-amazon.com/images/I/8125V8myTdL._AC_UF894,1000_QL80_.jpg";
            } else if (id==29) {
                return "https://m.media-amazon.com/images/I/61ACpD7Q1tL._AC_UF894,1000_QL80_.jpg";
            } else if (id==30) {
                return "https://www.lg.com/ca_en/images/laptops/md07521394/gallery/D_01.jpg";
           
        }
}}
