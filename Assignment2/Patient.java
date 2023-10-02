import java.util.ArrayList;
import java.util.List;

public class Patient{

    private int patientID;
    private String problem;
    private PetDoctor petDoctor;
    private Animal animal;

    Patient(String doc_id, int pet_id){
        this.patientID = pet_id;
    }
    void setPatientInfo(int ID) {
        this.patientID = ID;
    }

    void showPatientInfo() {
        System.out.println("Patient ID: " + patientID);
    }

    void setProblems(String problem) {
        this.problem = problem;
    }

    void showProblems() {
            System.out.println(problem);
    }
}
