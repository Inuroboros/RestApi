package com.example.lab4.location;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LocationService {

    List<Location> locations = new ArrayList<>(Arrays.asList(
            new Location("l1", "Astana"),
            new Location("l2", "Almaty"),
            new Location("l3", "Budapest")
    ));

    public List<Location> getAllLocations() {
        return locations;
    }

    public Location getLocation(String id) {
        return locations.stream().filter(l -> id.equals(l.getId())).findFirst().orElse(null);
    }

    public void addLocation(Location location) {
        locations.add(location);
    }

    public void updateLocation(String id, Location location) {
        for (int i = 0; i < locations.size(); i++) {
            Location l = locations.get(i);
            if (l.getId().equals(id))
                locations.set(i, location);
        }
    }

    public void deleteLocation(String id) {
        locations.removeIf(l -> l.getId().equals(id));
    }
}
