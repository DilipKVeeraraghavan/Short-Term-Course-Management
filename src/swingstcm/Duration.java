package swingstcm;

public class Duration {
    private int number_of_days;
    
    public Duration(int dur){
        if(0<dur&&dur<=14){
            number_of_days=dur;
        }
        else 
            System.out.println("Incorrect Duration entered !");
    }
    
    public void setDuration(int d){
        number_of_days=d;
    }
    public int getDuration(){
        return number_of_days;
    }
    
    public int writeToFile(){
        return number_of_days;
    }
    
    @Override
    public String toString(){
        return String.format("%02d days", number_of_days);
    }
}
