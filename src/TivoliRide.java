public class TivoliRide {

        //attributes
        public double height;
        public double width;

        //constructor
        public TivoliRide(double height) {
            this.height = height;
        }
            public String getHeight () {
                if (height <= 1.50) {
                    return "You can ride";
            }
                else (height >= 1.50) {
                    return "Sorry, you cannot ride";

            }



            }
        }


