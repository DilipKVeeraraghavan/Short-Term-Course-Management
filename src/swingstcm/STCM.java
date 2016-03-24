package swingstcm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class STCM {
    private static Course allcourses[]=new Course[10];
    private static int NoOfCourse=0;
    private static Scanner x,choices;
    private static FileWriter xformat;
    
    public static Course getallcourses(int i){
        return allcourses[i];
    }
    
    
    public static void fileparse(){
        Course.openFile();
        Course.fileparse();
        Course.closeFile();
    }
    public static void initializegetallcourses(int i){
        allcourses[i]=new Course();
    }
    
    public static void setNoOfCourses(int i){
        NoOfCourse=i;
    }
    
    public static FileWriter getFileWriter(){
        return xformat;
    }
    
    
    
    public static void filewrite() throws IOException{
        openwriteFile();
        writeCourses();
        closewriteFile();
    }
    
    public static void setCourseParticipant(int which,int no,Participant part){
        allcourses[which].setParticipant(no,part);
        
    }
    public static void setCourseInstructor(int which,int no,Faculty part){
        allcourses[which].setInstructor(no,part);
    }
    
    public static void setCourseCoOrd(int i,Faculty f){
        allcourses[i]=new Course();
        allcourses[i].CourseCoOrd = new Faculty();
        allcourses[i].CourseCoOrd =f;
    }
    
    public static void setCourse(int i,Course c){
        System.out.println(String.format("\n\n\n\n%d\n\n\n", i));
            NoOfCourse++;
            
        allcourses[i].setCourseName(c.getcourseName());
        allcourses[i].setCourseFee(c.getCourseFee());
        allcourses[i].setDuration(c.getDuration());
        System.out.println(String.format("\n\n\n\n%d   ::%d :: %d :: %d\n\n\n", i,c.getstart().getDate(),c.getstart().getMonth(),c.getstart().getYear()));
        
        allcourses[i].setDate(c.getstart().getDate(),c.getstart().getMonth(),c.getstart().getYear());
        
        System.out.println(String.format("\n\n\n\n%d  here\n\n\n", i));
        allcourses[i].getDetails();
    }
    
    public static int getNoOfCourse(){
        return NoOfCourse;
    }
    
    
    
    public static boolean checkDate(Date start){
        boolean check=false;
        
        Date today =new Date();
        today.setYear(today.getYear()-5);
        
            if(start.after(today)){
                check=false;
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null,"The date should be within 5 years !");
                return false;
            }
    }
    
    
    /*Enter the course name for selecting the course*/
    public static int enterCourseName(String cour){
        boolean check =false;
        int j;            
        do{
            for(j=0;j<NoOfCourse;j++)
            {
                if(allcourses[j].getCourse().equals(cour)){
                    return j; 
                }
            }
            if(j==NoOfCourse){
                JOptionPane.showMessageDialog(null,"No such Course found !");
                break;
            }
        }while(true);
        return -1;
    }
    
    public static int enterParticpantName(String cour){
        boolean check =false;
        int j;            
        do{
            for(j=0;j<NoOfCourse;j++)
            {
                if(allcourses[j].getParticipantName(0).equals(cour)){
                    return j; 
                }
            }
            if(j==NoOfCourse){
                JOptionPane.showMessageDialog(null,"No such Participant Found !");
                break;
            }
        }while(true);
        return -1;
    }
    
    public static int enterInstructorName(String cour){
        boolean check =false;
        int j;            
        do{
            for(j=0;j<NoOfCourse;j++)
            {
                if(allcourses[j].getInstructorName(0).equals(cour)){
                    return j; 
                }
            }
            if(j==NoOfCourse){
                JOptionPane.showMessageDialog(null,"No such Instructor Found !");
                break;
            }
        }while(true);
        return -1;
    }
    
    
    public static void openwriteFile() throws IOException{
        try{
            xformat=new FileWriter("output.txt",false);
        }
        catch(Exception e){
            System.out.println("\nError opening the file!");
        }
    }
    
    public static void openinstwriteFile() throws IOException{
        try{
            xformat=new FileWriter("output.txt",true);
        }
        catch(Exception e){
            System.out.println("\nError opening the file!");
        }
    }
    
    private static void openreadFile(){
        try{
            x=new Scanner(new File("output.txt"));
        }
        catch(Exception e){
            System.out.println("\nError opening the file!");
        }
    }
    
    
    private static void writeCourses() throws IOException{
        for(int i=0;i<NoOfCourse;i++){
            xformat.write(String.format("%s", allcourses[i].writeToFile()));
        }
    }
    
    private static void closereadFile(){
        x.close();
    }
    
    public static void closewriteFile() throws IOException{
        xformat.close();
    }
    
    private static void getCourseNames(){
        System.out.println("Courses :");
        for(int i=0;i<NoOfCourse;i++){
            System.out.println(String.format("Index %d : %s",i,allcourses[i].getcourseName()));
        }
    }
    
    private static int getParticipantNames(int x){
        System.out.println("\nParticipants :");
        if(allcourses[x].getNoOfPartis()==0){
            System.out.println("\nNo participants present !");
            return 0;
        }
        for(int i=0;i<allcourses[x].getNoOfPartis();i++){
            System.out.println(String.format("\nIndex %d : %s",i,allcourses[x].getParticipantName(i)));
        }
        return 1;
    }
    
    public static void deleteCourse(int j){
       for(int i=j;i<NoOfCourse-1;i++){
           allcourses[i]=allcourses[i+1];
       }
       NoOfCourse--;
       System.out.println("%"+NoOfCourse+"^^^^");
    }
    
    private static int getInstructorNames(int x){
        System.out.println("\nInstructors :");
        if(allcourses[x].getNoOfIns()==0){
            System.out.println("\nNo Instructors present !");
            return 0;
        }
        for(int i=0;i<allcourses[x].getNoOfIns();i++){
            System.out.println(String.format("\n%d : %s",i,allcourses[x].getInstructorName(i)));
        }
        return 1;
    }
    
    private static void getCourses(){
        Date today =new Date();
        today.setYear(today.getYear()-1);
        for(int i=0;i<NoOfCourse;i++){
            if(allcourses[i].getDate().after(today)){
                System.out.println(allcourses[i].toString());
            }
        }
    }
   
   
    
    
    
    private static void getParticipantDetails(){
        System.out.println("\nEnter the course for which you need to know the participants : ");
        Scanner input =new Scanner(System.in);
        String cour = input.nextLine();
        int j;
        for(j=0;j<NoOfCourse;j++)
        {
            if(allcourses[j].getCourse().equals(cour)){
                allcourses[j].getParticipants();
                break;
            }
        }
        if(j==NoOfCourse){
            System.out.println("Sorry no such course found !");
        }
            
    }
    
    private static void DeleteParticipantDetails(){
        getCourseNames();
        System.out.println("\nEnter the course for which you need to delete the participant details : ");
        Scanner input =new Scanner(System.in);
        String cour = input.nextLine();
        int j;
        for(j=0;j<NoOfCourse;j++)
        {
            if(allcourses[j].getCourse().equals(cour)){
                int checx=getParticipantNames(j);
                if(checx==0){
                    return;
                }
                System.out.print("Index of participant to be deleted :");
                int k=input.nextInt();
                allcourses[j].deleteParticipant(k);
                break;
            }
            
        }
        if(j==NoOfCourse){
                System.out.println("Sorry no such course found !");
        }
    }
    
    private static void DeleteInstructorDetails(){
        getCourseNames();
        System.out.println("\nEnter the course for which you need to delete the Instructor details : ");
        Scanner input =new Scanner(System.in);
        String cour = input.nextLine();
        int j;
        for(j=0;j<NoOfCourse;j++)
        {
            if(allcourses[j].getCourse().equals(cour)){
                int checx=getInstructorNames(j);
                if(checx==0){
                    return;
                }
                System.out.print("\nIndex of Instructor to be deleted :");
                int k=input.nextInt();
                allcourses[j].deleteInstructor(k);
                break;
            }
        }
        if(j==NoOfCourse){
             System.out.println("Sorry no such course found !");
        }
    }   
    
    private static void addParticipantDetails() throws IOException{
        getCourseNames();
        System.out.println("\nEnter the course for which you need to add the participants : ");
        Scanner input =new Scanner(System.in);
        String cour = input.nextLine();
        int j;
        for(j=0;j<NoOfCourse;j++)
        {
            if(allcourses[j].getCourse().equals(cour)){
                allcourses[j].addParticipant();
                break;
            }
            if(j==NoOfCourse){
                System.out.println("Sorry no such course found !");
            }
        }
        if(j==NoOfCourse){
            System.out.println("Please check the course name entered !");
        }
            
    }
    
    private static void addInstructorDetails() throws IOException{
        getCourseNames();
        System.out.println("\nEnter the course for which you need to add the Instructor : ");
        Scanner input =new Scanner(System.in);
        String cour = input.nextLine();
        int j;
        for(j=0;j<NoOfCourse;j++)
        {
            if(allcourses[j].getCourse().equals(cour)){
                allcourses[j].addInstructor();
                break;
            }
            if(j==NoOfCourse){
                System.out.println("Sorry no such course found !");
            }
        }
        
        if(j==NoOfCourse){
            System.out.println("Please check the course name entered !");
        }
            
    }
       
}