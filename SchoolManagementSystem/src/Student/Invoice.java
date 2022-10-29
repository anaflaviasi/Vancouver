package Student;

import java.sql.Date;

public class Invoice extends Student{
    private int invoiceId;
    private String feeName;
    private double feesAmount;
    private double discount;
    private double paidAmount;
    private String status;
    private Date   invoiceDate;
    private Date   dueDate; 

  // Default Constructor
  public Invoice(){
    this.invoiceId = 0;
    this.feeName = "Unknown";
    this.feesAmount = 0.00;
    this.discount = 0.00;
    this.paidAmount = 0.00;
    this.status = "Unknown";
    this.invoiceDate = null;
  }  

  // Parameterized Constructor
  public Invoice(int invoiceId, String feeName, double feesAmount, double discount, double paidAmount, String status, Date invoiceDate, Date dueDate, Integer id, String name, String program){
    super(id, name, program);
    this.invoiceId = invoiceId;
    this.feeName = feeName;
    this.feesAmount = feesAmount;
    this.discount = discount;
    this.paidAmount = paidAmount;
    this.status = status;
    this.invoiceDate = invoiceDate;
  }

  public int getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(int invoiceId) {
    this.invoiceId = invoiceId;
  }

  public String getFeeName() {
    return feeName;
  }

  public void setFeeName(String feeName) {
    this.feeName = feeName;
  }

  public double getFeesAmount() {
    return feesAmount;
  }

  public void setFeesAmount(double feesAmount) {
    this.feesAmount = feesAmount;
  }

  public double getDiscount() {
    return discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  public double getPaidAmount() {
    return paidAmount;
  }

  public void setPaidAmount(double paidAmount) {
    this.paidAmount = paidAmount;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Date getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(Date invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }  
}
