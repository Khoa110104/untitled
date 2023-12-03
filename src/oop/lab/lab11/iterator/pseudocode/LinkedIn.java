package oop.lab.lab11.iterator.pseudocode;

import java.util.ArrayList;
import java.util.List;

public class LinkedIn implements SocialNetwork {
    private List<Profile> contacts;

    public LinkedIn(List<Profile> cache) {
        if (cache != null) {
            this.contacts = cache;
        } else {
            this.contacts = new ArrayList<>();
        }
    }

    public List<String> socialGraphRequest(String profileId, String type) {
        simulateNetworkLatency();
        System.out.println("Facebook: Loading '" + type + "' list of '" + profileId + "' over the network...");
        Profile profile = findContact(profileId);
        if (profile != null) {
            return profile.getContacts(type);
        }
        return null;
    }

    public Profile requestContactInfoFromLinkedInAPI(String profileEmail) {
        simulateNetworkLatency();
        System.out.println("LinkedIn: Loading profile '" + profileEmail + "' over the network...");
        return findContact(profileEmail);
    }

    private Profile findContact(String profileEmail) {
        for (Profile profile : contacts) {
            if (profile.getEmail().equals(profileEmail)) {
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
        return new LinkedInIterator(this, profileId, "friends");
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return new LinkedInIterator(this, profileId, "coworkers");
    }
}