class Bank{
   private  String physicalAdress;
   private  String bankName;
   private  long phoneNumber;
   private   String emailAdress;
   private   String receipt;

  public void printReceipt(){
  System.out.println("..... FNB ....");
  System.out.println("FNB BANK");
  System.out.println("Sunnyside");
  System.out.println("fnb852001@yahoo.com");
}

   public void setphysicalAdress(String physicalAdress){
   this.physicalAdress = physicalAdress;
}
   public String getphysicalAdress(){
  System.out.println("2845 SUNNY PARK"); 
  return physicalAdress;
}

   public void setRebankName(String bankName){
   this.bankName = bankName;
}
   public String getbankName(){
  System.out.println("FNB"); 
 return bankName;
}
   public void setPhoneNumber(long phoneNumber){
   this.phoneNumber = phoneNumber; 
}
   public long getPhoneNumber(){
  System.out.println("+254824"+254824); 
  return phoneNumber;
}

  public void setemailAdress(String emailAdress){
this.emailAdress = emailAdress;
}
 public String getemailAdress(){
 System.out.println("violet2354@yahoo.com");
return emailAdress;
}
  public void setreceipt(String receipt){
 this.receipt = receipt;
}
  public String getreceipt(){
 System.out.println("receipt"+receipt);
  return receipt;
}

}



