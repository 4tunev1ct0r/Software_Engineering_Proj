import java.util.ArrayList;
public class Billing {
    
    int patientID;
    ArrayList<Integer> medicinesID;
    public int fee;
    public String Recommendation, date;

    public Billing(){
        this.patientID = 0;
        this.date = "";
        this.fee = 0;
        this.Recommendation = "";
    }
    
    //this is the section for our setters and getters for the class

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public ArrayList<Integer> getMedicinesID() {
        return medicinesID;
    }

    public void setMedicinesID(int medicinesID) {
        this.medicinesID.add(medicinesID);
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getRecommendation() {
        return Recommendation;
    }

    public void setRecommendation(String Recommendation) {
        this.Recommendation = Recommendation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

   
    
}
