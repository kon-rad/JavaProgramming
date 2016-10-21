import java.util.*;

public class CertificateOfDeposit {
   private int certificateNumber;
   private String holdersLastName;
   private double balance;
   private GregorianCalendar issueDate;
   private GregorianCalendar maturityDate;
   
   // get methods
   public int getCertificateNumber() {
      return certificateNumber;
   }
   public String getHoldersLastName() {
      return holdersLastName;
   }
   public double getBalance() {
      return balance;
   }
   public String getIssueDate() {
      return (issueDate.get(Calendar.MONTH) + 1) + "/" +issueDate.get(Calendar.DAY_OF_MONTH) + "/" + issueDate.get(Calendar.YEAR);
   }
   public String getMaturityDate() {
      return (maturityDate.get(Calendar.MONTH) + 1)  + "/" + maturityDate.get(Calendar.DAY_OF_MONTH)  + "/" + maturityDate.get(Calendar.YEAR);
   }
   
   // set methods
   public void setCertificateNumber(int num) {
      certificateNumber = num;
   }
   public void setHoldersLastName(String name) {
      holdersLastName = name;
   }
   public void setBalance(double num) {
      balance = num;
   }
   public void setIssueDate(int year, int month, int day) {
      issueDate = new GregorianCalendar(year, month, day);
   }
   public void  setMaturityDate(int year, int month, int day) {
      maturityDate = new GregorianCalendar(year, month, day);
   }
   // Constructor
   CertificateOfDeposit(int certNum, String lastName, double bal,
      int year, int month, int day) {
      certificateNumber = certNum;
      holdersLastName = lastName;
      balance = bal;
      issueDate = new GregorianCalendar(year, month - 1, day);
      maturityDate = new GregorianCalendar((year + 1), month - 1, day);
   }
   
}