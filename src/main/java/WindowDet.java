public class WindowDet {
    private int WIDTH;
    private int HEIGHT;
    private int DIAMETER;

    public WindowDet(int WIDTH1, int HEIGHT1, int DIAMETER1 ){
        this.WIDTH=WIDTH1;
        this.HEIGHT=HEIGHT1;
        this.DIAMETER=DIAMETER1;
    }

    public WindowDet(){

    }
    public int getWIDTH(){
        return WIDTH;
    }

    public void setWIDTH(int WIDTH){
        this.WIDTH=WIDTH;
    }

    public int getHEIGHT(){
        return HEIGHT;
    }

    public void setHEIGHT(int HEIGHT){
        this.HEIGHT=HEIGHT;
    }

    public int getDIAMETER(){
        return DIAMETER;
    }

    public void setDIAMETER(int DIAMETER){
        this.DIAMETER=DIAMETER;
    }
}
