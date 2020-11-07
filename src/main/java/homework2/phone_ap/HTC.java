package homework2.phone_ap;

public abstract class HTC extends Phone{

    private  String name;
    private String operationSystem;

    public HTC(String name, String color, String material, String operationSystem){
        super(color, material);
        this.name = name;
        this.operationSystem = operationSystem;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String newOperationSystem) {
        operationSystem = newOperationSystem;
    }



    public abstract void sendMessage();

    public abstract void MessageHistory();




}
