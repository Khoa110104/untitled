package oop.lab.lab11.iterator.pseudocode;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork {
    private List<Profile> profiles;

    public Facebook(List<Profile> cache) {
        if (cache != null) {
            this.profiles = cache;
        } else {
            this.profiles = new ArrayList<>();
        }
    }

    public List<String> socialGraphRequest(String profileId, String type) {
        simulateNetworkLatency();
        System.out.println("Facebook: Loading '" + type + "' list of '" + profileId + "' over the network...");
        Profile profile = findProfile(profileId);
        if (profile != null) {
            return profile.getContacts(type);
        }
        return null;
    }

    public Profile requestProfileFromFacebook(String profileId) {
        simulateNetworkLatency();
        System.out.println("Facebook: Loading profile '" + profileId + "' over the network...");
        return findProfile(profileId);
    }


    private Profile findProfile(String profileId) {
        for (Profile profile : profiles) {
            if (profile.getId().equals(profileId)) {
                return profile;
            }
        }
        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(1234);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new FacebookIterator(this, profileId, "friends");
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, profileId, "coworkers");
    }

}