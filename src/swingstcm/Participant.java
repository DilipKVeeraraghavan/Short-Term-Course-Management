package swingstcm;

import java.io.IOException;
import java.util.Scanner;

public class Participant {
    private String Name;
    private String Address;
    private String MobileNo;
    private String OrgName;
    private String email;
    
    public void SetInfo() throws IOException{
        STCM.openinstwriteFile();

        Scanner input =new Scanner(System.in);
        System.out.print("Name : ");
        Name=input.nextLine();
        STCM.getFileWriter().write(String.format("%s\n",Name));
        System.out.print("Address : ");
        Address=input.nextLine();
        STCM.getFileWriter().write(String.format("%s\n",Address));
        System.out.print("MobileNo : ");
        MobileNo=String.format("%s",entermobileno());
        STCM.getFileWriter().write(String.format("%s\n",MobileNo));
        System.out.print("Organisation Name : ");
        OrgName=input.nextLine();
        STCM.getFileWriter().write(String.format("%s\n",OrgName));
        System.out.print("Email : ");
        email=enteremail();
        STCM.getFileWriter().write(String.format("%s\n",email));
        STCM.closewriteFile();
    }
    
    public void setName(String x){
        Name =x;
    }
    public void setAddress(String x){
        Address =x;
    }
    public void setMobileNo(String x){
        MobileNo =x;
    }
    public void setOrgName(String x){
        OrgName =x;
    }
    public void setemail(String x){
        email =x;
    }
    
    private String enteremail(){
        String emid;
        boolean check=true;
        do{
            if(check==false){
                System.out.println("Please enter a valid email id !");
            }
            Scanner email =new Scanner(System.in);
            emid=email.nextLine();
            check=isValidEmailAddress(emid);
        }while(check!=true);
        return emid;
    }
    
    public boolean isValidEmailAddress(String email) {
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches();
    }
    
    private long entermobileno(){
        long mobile=0;
        boolean check;
        do{
                try{
                Scanner mob =new Scanner(System.in);
                mobile=mob.nextLong();
                if(mobile<0){
                    System.out.println("Please enter a non negative number !");
                    check =true;
                }
                else check=false;
            }
            catch(Exception e){
                System.out.println("Please enter a valid mobile no .. (0 - 9 only) ");
                check=true;
            }
        }while(check);
        return mobile;
    }
    
    public String getName(){
        return Name;
    }
    public String getAddress(){
        return Address;
    }
    public String getMobileNo(){
        return MobileNo;
    }
    public String getOrgName(){
        return OrgName;
    }
    public String getemail(){
        return email;
    }
    
    
    public void setName(){
        Scanner input = new Scanner(System.in);
        System.out.print("Course Name : ");
        Name=input.nextLine();
    }
    
    public void setAddress(){
        Scanner input = new Scanner(System.in);
        System.out.print("Address : ");
        Address=input.nextLine();
    }
    public void setMobileNo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Mobile No : ");
        MobileNo=input.nextLine();
    }
    public void setOrgName(){
        Scanner input = new Scanner(System.in);
        System.out.print("Org Name : ");
        OrgName=input.nextLine();
    }
    public void setemail(){
        Scanner input = new Scanner(System.in);
        System.out.print("Email : ");
        email=input.nextLine();
    }
    
    
    public void readFromFile(){
        Scanner input =new Scanner(System.in);
        Name=input.nextLine();
        Address=input.nextLine();
        MobileNo=input.nextLine();
        OrgName=input.nextLine();
        email=input.nextLine();
    }
    
    
    public String writeToFile(){
        return String.format("%s\n%s\n%s\n%s\n%s"
                ,Name,Address,MobileNo,OrgName,email);
    }
    
    @Override
    public String toString(){
        return String.format("The details of the participant is : \n"
                + "Name : %s \nAddress : %s \nMobileNo: %s"
                + "\nOrganisation Name: %s\nEmail : %s\n "
                ,Name,Address,MobileNo,OrgName,email);
    }
    
}
