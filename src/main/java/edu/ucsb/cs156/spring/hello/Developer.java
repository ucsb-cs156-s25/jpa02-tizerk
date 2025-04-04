package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Jay J.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "tizerk";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s25-12");
        team.addMember("Arthur W.");
        team.addMember("Simon Y.");
        team.addMember("Hung K.");
        team.addMember("Michael W.");
        team.addMember("Jay J.");
        team.addMember("Yuxiang Z.");
        return team;
    }
}
