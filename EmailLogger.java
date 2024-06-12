public class EmailLogger extends BaseLogger {
    @Override // Override işlemini belirttik.  
    public void log(String message){
        System.out.println("Log to email : "+message);
}
}