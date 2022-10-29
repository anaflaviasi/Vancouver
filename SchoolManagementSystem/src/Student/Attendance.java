package Student;

import javax.security.auth.Subject;

public class Attendance extends Enrollment{
    private int present;
    private int absent;
    private int halfDayAbsent;
    private int onBreak;
    private int remote;
    private int holiday;

     // Default Constructor
     public Attendance(){
        this.present = 0;
        this.absent = 0;
        this.halfDayAbsent = 0;
        this.onBreak = 0;
        this.remote = 0;
        this.holiday = 0;
     }

     // Parameterized Constructor
     public Attendance(int present, int absent, int halfDayAbsent, int onBreak, int remote, int holiday, String subject, String status, Integer id, String name, String program){
        super(subject, status, id, name, program);
        this.present = present;
        this.absent = absent;
        this.halfDayAbsent = halfDayAbsent;
        this.onBreak = onBreak;
        this.remote = remote;
        this.holiday = holiday;
     }

   public int getPresent() {
      return present;
   }

   public void setPresent(int present) {
      this.present = present;
   }

   public int getAbsent() {
      return absent;
   }

   public void setAbsent(int absent) {
      this.absent = absent;
   }

   public int getHalfDayAbsent() {
      return halfDayAbsent;
   }

   public void setHalfDayAbsent(int halfDayAbsent) {
      this.halfDayAbsent = halfDayAbsent;
   }

   public int getOnBreak() {
      return onBreak;
   }

   public void setOnBreak(int onBreak) {
      this.onBreak = onBreak;
   }

   public int getRemote() {
      return remote;
   }

   public void setRemote(int remote) {
      this.remote = remote;
   }

   public int getHoliday() {
      return holiday;
   }

   public void setHoliday(int holiday) {
      this.holiday = holiday;
   }
}
