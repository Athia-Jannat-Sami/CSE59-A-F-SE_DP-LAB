class Patient{
    private String patientName;
    private String nationalId;

    public Patient(String patientName, String nationalId){
        this.patientName = patientName;
        this.nationalId = nationalId;
    }

    public String getPatientName(){
        return patientName;
    }

    public String getNationalId(){
        return nationalId;
    }

}

class IdValidator {
    public boolean validateId(String nationalId){
        return nationalId.length() == 10 || nationalId.length() == 17;
    }
}

class SmsService {
    public void sendSmsConfirmation(Patient patient){
        IdValidator validator = new IdValidator();
        if(validator.validateId(patient.getNationalId())){
            System.out.println("Sending sms to " + patient.getPatientName() + ": Registration successful.");
        }else{
            System.out.println("Invalid National Id.");
        }
    }
}

