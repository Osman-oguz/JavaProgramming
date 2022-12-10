package day32_Constructors.Carpet;

public class Carpet {

    public double width,length,unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double totalPrice= width * length * unitPrice;
        if (isPersian){
            totalPrice +=200;
        }
        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +" m"+
                ", length=" + length +" m"+
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", Total Price= $" + calcCost()+
                '}';
    }
}
