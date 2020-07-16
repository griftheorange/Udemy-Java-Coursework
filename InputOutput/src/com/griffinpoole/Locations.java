package com.griffinpoole;

import java.io.*;
import java.util.*;

/**
 * Created by timbuchalka on 2/04/2016.
 */
public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) throws IOException {
        try (DataOutputStream locFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")))){
            for (Location location : locations.values()){
                locFile.writeInt(location.getLocationID());
                locFile.writeUTF(location.getDescription());
                System.out.println("Writing Location " + location.getLocationID() + " : " + location.getDescription());
                System.out.println("Writing " + (location.getExits().size()-1) + " exits");
                locFile.writeInt(location.getExits().size() - 1);
                for(String direction : location.getExits().keySet()){
                    if(!direction.equalsIgnoreCase("Q")){
                        System.out.println("\t\t" + direction + ", " + location.getExits().get(direction));
                        locFile.writeUTF(direction);
                        locFile.writeInt(location.getExits().get(direction));
                    }
                }
            }
        }
    }

    static {
        try(DataInputStream locFile = new DataInputStream(new BufferedInputStream(new FileInputStream("locations.dat")))){
             boolean eof = false;
             while(!eof) {
                 try{
                     Map<String, Integer> exits = new LinkedHashMap<>();
                     int locID = locFile.readInt();
                     String description = locFile.readUTF();
                     int numExits = locFile.readInt();
                     System.out.println("Read location " + locID + ", " + description + ". Found " + numExits );
                     for(int i = 0; i < numExits; i++){
                         String direction = locFile.readUTF();
                         int destination = locFile.readInt();
                         exits.put(direction, destination);
                         System.out.println("\t\t" + direction + " " + destination);
                     }
                     locations.put(locID, new Location(locID, description, exits));
                 } catch(IOException e) {
                     eof = true;
                 }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
//        try(Scanner locScanner = new Scanner(new BufferedReader(new FileReader("locations_big.txt")));
//            Scanner dirScanner = new Scanner(new BufferedReader(new FileReader("directions_big.txt")))){
//
//            locScanner.useDelimiter(",");
//            while(locScanner.hasNextLine()){
//                int loc = locScanner.nextInt();
//                locScanner.skip(locScanner.delimiter());
//                String description = locScanner.nextLine();
//                Map<String, Integer> tempExit = new HashMap<>();
//                locations.put(loc, new Location(loc, description, tempExit));
//            }
//
//            dirScanner.useDelimiter(",");
//            while(dirScanner.hasNextLine()){
//                int loc = dirScanner.nextInt();
//                dirScanner.skip(dirScanner.delimiter());
//                String direction = dirScanner.next();
//                dirScanner.skip(dirScanner.delimiter());
//                String dest = dirScanner.nextLine();
//                int destination = Integer.parseInt(dest);
//                Location location = locations.get(loc);
//                location.addExit(direction, destination);
//            }
//        } catch(IOException e){
//            e.printStackTrace();
//        }
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();

    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
