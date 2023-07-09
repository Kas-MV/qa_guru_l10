package qa.guru.model;



import java.util.List;

public class Samples {
    private String mot, type, series;
    private List<Items> items;

    public String getMot() {
        return mot;
    }

    public String getType() {
        return type;
    }

    public String getSeries() {
        return series;
    }

    public List<Items> getItems() {
        return items;
    }

    public static class Items {
        private String power;
        private String engineCapacity;

        public String getPower() {
            return power;
        }

        public String getEngineCapacity() {
            return engineCapacity;
        }
    }


}
