package swingstcm;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Course {
    private String courseName;
    private long courseFee;
    private Date start;
    private Duration duration;
    private static Scanner read;
    private static int arr=0;
    
    public Faculty CourseCoOrd;
    public int NoOfIns=0,NoOfPartis=0;
    private Faculty Instructor[]= new Faculty[5];
    private Participant participants[]=new Participant[5];
    
    public String getcourseName(){
        return courseName;
    }
    
    public String getParticipantName(int i){
        return participants[i].getName();
    } 
    
    public int getDuration(){
        return duration.getDuration();
    }
    
    
    public String getInstructorName(int i){
        return Instructor[i].getName();
    } 
    
    public Participant getParticipantAsWhole(int i){
        return participants[i];
    } 
    
    public Faculty getCoOrdAsWhole(){
        return CourseCoOrd;
    }
    
    
    public Faculty getInstructorAsWhole(int i){
        return Instructor[i];
    } 
    
    public void setParticipant(int no,Participant part){
        participants[no] = new Participant();
        participants[no] = part;
        NoOfPartis++;
    }
    
    public void setInstructor(int no,Faculty part){
        Instructor[no] = new Faculty();
        Instructor[no] = part;
        NoOfIns++;
    }
    
    
    
    public int getNoOfPartis(){
        return NoOfPartis;
    }
    
    
    public int getNoOfIns(){
        return NoOfIns;
    }
    
    
    
    public void setCourseCoOrd(Faculty f){
        CourseCoOrd =f;
    }
    
    
    public void startinit(){
        start =new Date();
    }
    
    
    public int checkDate(Date start){
        boolean check=false;
        
        Date today =new Date();
        today.setYear(today.getYear()-5);
        
            if(start.after(today)){
                check=false;
                return 1;
            }
            else{
                JOptionPane.showMessageDialog(null,"The date should be within 5 years !");
                return 0;
            }
    }
    
    public Date getstart(){
        return start;
    }
    
    private int enterinteger(){
        int enter=-1;
        boolean check=false;
        do{
            try{
                Scanner integer =new Scanner(System.in);
                enter=integer.nextInt();
                if(enter<0){
                    System.out.println("Please enter a non negative number !");
                    check =true;
                }
                else check=false;
            }
            catch(Exception e){
                System.out.println("Please enter an integer! ");
                check=true;
            }
        }while(check);
        return enter;
    }
    
    public Date getDate(){
        return start;
    }
    

    public void getDetails(){
        System.out.println(toString());    
    }
    
    public static void fileparse(){
        arr=0;
        while(read.hasNext()){
            STCM.initializegetallcourses(arr);
            STCM.getallcourses(arr).readFromFile();
            arr++;
        }
        
        STCM.setNoOfCourses(arr);
    }
    
    public void readFromFile(){
                courseName=read.nextLine();
                courseFee=Integer.parseInt(read.nextLine());
                start=new Date();
                start.setDate(Integer.parseInt(read.nextLine()));
                start.setMonth(Integer.parseInt(read.nextLine()));
                start.setYear(Integer.parseInt(read.nextLine()));        
                duration=new Duration(Integer.parseInt(read.nextLine()));
                CourseCoOrd =new Faculty();
                CourseCoOrd.setDepartment(read.nextLine());
                CourseCoOrd.setName(read.nextLine());
                CourseCoOrd.setAddress(read.nextLine());
                CourseCoOrd.setMobileNo(read.nextLine());
                CourseCoOrd.setemail(read.nextLine());
                NoOfIns=Integer.parseInt(read.nextLine());
                System.out.println("\n ins :"+NoOfIns+"\n");
                for(int i=0;i<NoOfIns;i++){
                    Instructor[i] =new Faculty();
                    Instructor[i].setDepartment(read.nextLine());
                    Instructor[i].setName(read.nextLine());
                    Instructor[i].setAddress(read.nextLine());
                    Instructor[i].setMobileNo(read.nextLine());
                    Instructor[i].setemail(read.nextLine());
                }
                NoOfPartis=Integer.parseInt(read.nextLine());
                for(int i=0;i<NoOfPartis;i++){
                participants[i] =new Participant();
                participants[i].setName(read.nextLine());
                participants[i].setAddress(read.nextLine());
                participants[i].setMobileNo(read.nextLine());
                participants[i].setOrgName(read.nextLine());
                participants[i].setemail(read.nextLine());
        
            }
    }
    public static void openFile(){
        try{
            read=new Scanner(new File("output.txt"));
        }
        catch(Exception e){
            System.out.println("\nError opening the file!");
        }
    }
    
    public static void closeFile(){
        read.close();
    }
    
    public String writeToFile(){
        String total = String.format("%s\n%d\n%d\n%d\n%d\n%d\n%s\n%d\n",courseName,
                courseFee,start.getDate(),start.getMonth(),start.getYear(),
                duration.writeToFile(),CourseCoOrd.writeToFile(),NoOfIns);
        for(int j=0;j<NoOfIns;j++){
            total = total + String.format("%s\n",Instructor[j].writeToFile());
        }
        
        total = total + String.format("%d\n",NoOfPartis);
        
        for(int j=0;j<NoOfPartis;j++){
            total = total + String.format("%s\n",participants[j].writeToFile());
        }
        return total;
    }
    
    
    @Override
    public String toString(){
        System.out.println("=========================== Course Details =============================");
        String total = String.format("The details of the course : \n"+"Course Name : %s\n"+
                "Course Fee :%d \n"+"Start date : %s\n"+"Duration (in days) : %s\n",courseName,courseFee,start,duration);
        total = total + String.format("\nDetails of the Course CoOrdinator: \n%s",CourseCoOrd);
        total = total + String.format("-------------------------------------------------------------------");
        total = total + String.format("\nNumber of Ins :  %d\n", NoOfIns);
        for(int j=0;j<NoOfIns;j++){
            total = total + String.format("\n-------------------------------------------------------------------");
            total = total +String.format("\nInstructor %d : \n",j+1)+ String.format("%s\n",Instructor[j]);
            total = total + String.format("\n-------------------------------------------------------------------");
        }
        total = total + String.format("\n-------------------------------------------------------------------");
        total = total + String.format("\nNumber of Participants : %d",NoOfPartis);
        
        for(int j=0;j<NoOfPartis;j++){
            total = total + String.format("\n-------------------------------------------------------------------");
            total = total +String.format("\nParticipator %d : \n",j+1)+ String.format("%s\n",participants[j]);
            total = total + String.format("\n-------------------------------------------------------------------");
        }
        return total;
    }
    
    public String getCourse(){
        return courseName;
    }
    
    public long getCourseFee(){
        return courseFee;
    }
    
    
    
    public void getParticipants(){
        for(int i=0;i<NoOfPartis;i++){
            System.out.println(participants[i]);
        }
    }
    
    public void getParticipantsindexnames(){
        for(int i=0;i<NoOfPartis;i++){
            System.out.println(String.format("Index %d : %s",i,participants[i].getName()));
        }
    }
    
    public void setCourseName(String x){
        courseName = x;
    }
    
    public void setCourseFee(long x){
        courseFee = x;
    }
    
    public void setDate(int d,int m,int y){
        start = new Date();
        start.setDate(d);
        start.setMonth(m);
        start.setYear(y);
    }
    
    public void setDuration(int d){
        duration =new Duration(d);
    }
    
    public void deleteParticipant(int i){
        if(NoOfPartis>0){
            for(int x=i;x<(NoOfPartis-1);x++){
                participants[i]=participants[i+1];
            }
            NoOfPartis--;
        }
        else System.out.println("Not possible,no participant present!");
    }
    public void addParticipant() throws IOException{
        if(NoOfPartis<5){
            participants[NoOfPartis]=new Participant();
            participants[NoOfPartis].SetInfo();
            NoOfPartis++;
        }
        else{
            System.out.println("Maximum Participants reached! No additional participant possible!");
        }
    }
    
    
    public void deleteInstructor(int i){
        if(NoOfIns>0){
            for(int x=i;x<(NoOfIns-1);x++){
                Instructor[i]=Instructor[i+1];
            }
            NoOfIns--;
        }
        else System.out.println("Not possible,no Instructor present!");
    }
    
    public void addInstructor() throws IOException{
        if(NoOfIns<5){
            Instructor[NoOfIns]=new Faculty();
            Instructor[NoOfIns].SetInfo();
            NoOfIns++;
        }
        else{
            System.out.println("Maximum Instructors reached! No additional Instructor possible!");
        }
    }
    
}