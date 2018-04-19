public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public  Vector add(Vector v2) {
        return new Vector(this.x + v2.x, this.y + v2.y,this.z + v2.z );
    }

    public  Vector subtract(Vector v2) {
        return new Vector(this.x - v2.x, this.y - v2.y,this.z - v2.z );
    }

    public  double scalarToMultiply(Vector v2) {
        return new Double(this.x*v2.x + this.y*v2.y + this.z*v2.z );
    }

    public  double findLengthOfVector() {

        return new Double(Math.sqrt(this.x*this.x + this.y*this.y + this.z*this.z) );
    }

    public String toString(){
            return  "(" + x + ";" + y + ";" + z + ")";
    }
}
