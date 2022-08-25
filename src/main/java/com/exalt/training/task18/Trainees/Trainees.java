package com.exalt.training.task18.Trainees;

/**
 * Trainees class used to collect trainees information before accept them
 * Class instance variables trainee name, university name, training path and his GPA
 */


public class Trainees {

    // Define instance variables to store trainer's information
    private String traineeName;         // Used to store trainee name
    private String universityName;      // Used to store university name
    private String trainingPath;        // Used to store training path type to the trainee
    private double GPA;                 // Describe trainee grade point average

    public Trainees() {
    }

    /**
     * Trainees constructor to get trainee information
     *
     * @param traineeName    represent trainer's name
     * @param universityName represent university name
     * @param trainingPath   represent training path such as: backend, frontend, mobile...
     * @param GPA            represent trainer's Grade Point Average
     */


    public Trainees(String traineeName, String universityName, String trainingPath, double GPA) {
        this.traineeName = traineeName;
        this.universityName = universityName;
        this.trainingPath = trainingPath;
        this.GPA = GPA;
    }

    /*
     * Getter methods to display trainees information when asked about it
     */

    public String getTraineeName() {

        return traineeName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getTrainingPath() {
        return trainingPath;
    }

    public double getGPA() {
        return GPA;
    }

    /*
     * setter methods to set trainees information separately without using the constructor
     */

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setTrainingPath(String trainingPath) {
        this.trainingPath = trainingPath;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Trainees{" +
                "traineeName='" + traineeName + '\'' +
                ", universityName='" + universityName + '\'' +
                ", trainingPath='" + trainingPath + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
