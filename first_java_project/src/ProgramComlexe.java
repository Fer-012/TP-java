public class ProgramComlexe {
    public static void main(String[] args) {
        
        ProgramComlexe program = new ProgramComlexe();
        Complexe c1 = program.new Complexe(2, 2);
        Complexe c2 = program.new Complexe(-3, 4);

        Complexe c3, c4;

        c3 = c1.add(c2);
        c4 = c1.subtract(c2);
        System.out.println("c1 + c2 = " + c3);
        System.out.println("c1 - c2 = " + c4);
    }

    class Complexe {
        int reel;
        int img;

        public int getReel() {
            return reel;
        }

        public Complexe subtract(Complexe x) {
            // TODO Auto-generated method stub
            return new Complexe(this.reel - x.reel, this.img - x.img);
        }

        public Complexe add(Complexe x) {
            // TODO Auto-generated method stub
            return new Complexe(this.reel + x.reel, this.img + x.img);
        }

        public void setReel(int reel) {
            this.reel = reel;
        }

        public int getImg() {
            return img;
        }

        public void setImg(int img) {
            this.img = img;
        }

        public Complexe(int reel, int img) {
            this.reel = reel;
            this.img = img;
        }

        @Override
        public String toString() {
            return reel + " + " + img + "i";
        }

    }

}
