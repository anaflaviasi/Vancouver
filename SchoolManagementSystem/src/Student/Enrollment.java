package Student;

public class Enrollment extends Student {
    private String subject;
    private String status;

    // Default Constructor
    public Enrollment(){
     this.subject = "Unknown";
     this.status = "Unknown";
    }
    
    // Parameterized Constructor
    public Enrollment(String subject, String status, Integer id, String name, String program){
        super(id, name, program);
        this.subject = subject;
        this.status = status;
    }

    public String getSubjetc() {
        return subject;
    }

    public void setSubjetc(String subjetc) {
        this.subject = subjetc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
