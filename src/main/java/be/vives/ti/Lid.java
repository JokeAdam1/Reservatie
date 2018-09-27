package be.vives.ti;
public class Lid {

    // lidgeld is voorlopig 25EUR, kan dus veranderen
    private double lidgeld;
    private String naam;
    private String tel;

    public Lid(String naam, String tel) {
        this.naam = naam;
        this.tel = tel;
        this.lidgeld = 25.0;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNaam() {
        return naam;
    }

    public double geefKorting() {
        return 0.0;
    }

    @Override
    public String toString() {
        return naam + "\ntel: " + tel + "\nlidgeld: " + lidgeld;
    }

}
