public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Plant plant1 = new Plant(); //........create an instance
        plant1.name="papaya";  //...................write
        System.out.println(plant1.name);  //........read
        System.out.println(plant1.getBranch());
    }
}

class Plant{
    int branch;
    String name;
    int leaves;
    void setBranch(int leaves){
        this.leaves=leaves;
        
    }
    int getBranch() {
        return branch;
    }
}