package P05_Bilgisayar;

public class Data {
    public static int laptopID=1001;
    private String marka;
    private String model;
    private String ram;
    private String cpu;
    private String boyut;
    private String color;

    public Data() {
    }

    public Data(String marka, String model, String ram, String cpu, String boyut, String color) {
        this.marka = marka;
        this.model = model;
        this.ram = ram;
        this.cpu = cpu;
        this.boyut = boyut;
        this.color = color;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "marka='" + marka + '\'' +
                        ", model='" + model + '\'' +
                        ", ram='" + ram + '\'' +
                        ", cpu='" + cpu + '\'' +
                        ", boyut='" + boyut + '\'' +
                        ", color='" + color + '\'';
    }
}