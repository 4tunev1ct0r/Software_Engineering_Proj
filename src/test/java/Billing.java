import java.util.ArrayList;
public class Billing {
    
    Patient patient;
    ArrayList<Medicine> medicines = new ArrayList<>();
    public int fee;
    public String Recommendation, date;

    public Billing(){
        this.patient = null;
        this.date = "";
        this.fee = 0;
        this.Recommendation = "";
    }
    
    //this is the section for our setters and getters for the class

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(Medicine medicines) {
        this.medicines.add(medicines);
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

    @Override
    public String toString() {
        return "Billing{" + "patient=" + patient + ", medicines=" + medicines + ", fee=" + fee + ", Recommendation=" + Recommendation + ", date=" + date + '}';
    }

   
    
}
