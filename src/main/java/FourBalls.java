import processing.core.PApplet;

public class FourBalls extends PApplet {
    private static int x1;
    private static int x2;
    private static int x3;
    private static int x4;
    private static WindowDet windowDet = new WindowDet( 640,  400,  10);

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }
        @Override
        public void settings() {
            super.settings();
            size(windowDet.getWIDTH(), windowDet.getHEIGHT());
        }

        @Override
        public void draw(){
            drawcircle();
        }

        private void drawcircle() {
            ellipse(x1, windowDet.getHEIGHT()/5, windowDet.getDIAMETER(), windowDet.getDIAMETER());
            ellipse(x2, windowDet.getHEIGHT()/5, windowDet.getDIAMETER(), windowDet.getDIAMETER());
            ellipse(x3, windowDet.getHEIGHT()/5, windowDet.getDIAMETER(), windowDet.getDIAMETER());
            ellipse(x4, windowDet.getHEIGHT()/5, windowDet.getDIAMETER(), windowDet.getDIAMETER());
            x1++;
            x2+=2;
            x3+=3;
            x4+=4;
        }
        private void paintWhite(){
            background(255);
        }

        @Override
        public void setup(){

        }
}


