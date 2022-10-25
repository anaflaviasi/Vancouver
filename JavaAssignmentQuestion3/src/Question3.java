
    public class Question3 implements Comparable<Question3>{
        private String make;
        private String model;
        private Integer year;

        public Question3(){
            this.make = "Unknown";
            this.model = "Unknown";
            this.year = 0;
        }

        public Question3(String make, String model, int year){
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public int compareTo(Question3 nextYear) {
            return this.year.compareTo(nextYear.year);
        }
    
        @Override
        public String toString() {
            return "{Make='" + make + '\'' +
                    ", Model=" + model +
                    ", Year=" + year +
                    '}';
    }
    }
