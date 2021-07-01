package responsi;

public class Main {

    public static void main(String[] args) {
        ViewAset viewAset = new ViewAset();
        ModelAset modelAset = new ModelAset();
        ControllerAset controllerAset = new ControllerAset(viewAset, modelAset);
    }
    
}
