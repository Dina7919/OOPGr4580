package Domen;

public class HotDrinks extends Product {
    private float temperature;
    public float getTemperature(){
        return temperature;
    }
    public void setTemperature(float temperature){
        this.temperature = temperature;
    }
    public HotDrinks(int price, int place, String name, long id){
        super(price,place,name,id);
        this.temperature = 0f;
    }
    public HotDrinks (int price, int place, String name, long id, float temperature){
        super(price,place,name,id);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTemperature = " + temperature;
    }
}
