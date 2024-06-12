public class CustomerManager {
    private BaseLogger logger;
    public CustomerManager(BaseLogger logger){
        System.out.println("Constructor Calisti.");
        this.logger=logger;
    }
    public void add(){
        System.out.println("Müşteri Eklendi.");
        this.logger.log("Add");
    }
}
