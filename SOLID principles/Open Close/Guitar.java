public class Guitar {
    private String make;
    private String model;
    private int volume;


    public Guitar() {
    }

    public Guitar(String make, String model, int volume) {
        this.make = make;
        this.model = model;
        this.volume = volume;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    
    
}
