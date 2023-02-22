public class travelling {
    private Place p;

    public Place getP() {
        return p;
    }

    public void setP(Place p) {
        this.p = p;
    }
    public void destination(String str){
        p.city(str);
    }
}
