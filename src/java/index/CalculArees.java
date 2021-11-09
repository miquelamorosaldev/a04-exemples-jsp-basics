package index;

/**
 * Calcula l'area de diverses figures; per ara un rectangle.
 * @author alumne
 */
public class CalculArees {
    private double base;
    private double alsada;
    private double area;
    private double perimetre;
   
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetre() {
        return perimetre;
    }

    public void setPerimetre(double perimetre) {
        this.perimetre = perimetre;
    }
    
    public CalculArees(double base, double alsada) {
        this.base = base;
        this.alsada = alsada;
    }

    public double getAlsada() {
        return this.alsada;
    }

    public void setAlsada(double alsada) {
        this.alsada = alsada;
    }
    
    /**
     * Mètode que fa el càlcul de l'area d'un rectangle; a partir de base i l'alçada
     * @return double Area
     */
    public double calculaAreaRectangle(){
        return alsada * base;
    }
    
    /**
     * Mètode que fa el càlcul del perimetre d'un rectangle; a partir de base i l'alçada
     * @return double Perímetre
     */
    public double calculaPerimetreRectangle(){
        return 2* alsada + 2 * base;
    }

}
