package alex.learn.web.conf;

/**
 * author  : zhiguang
 * date    : 2018/7/27
 */
public class TriangleShape {

    private  Point pointa;
    private  Point pointb;
    private  Point pointc;

    public TriangleShape() {
    }

    public TriangleShape(Point pointa, Point pointb, Point pointc) {
        this.pointa = pointa;
        this.pointb = pointb;
        this.pointc = pointc;
    }


    public double getLength(Point a, Point b){
        return Math.sqrt(Math.pow( (a.getX()-b.getX()), 2 ));
    }

    public double getLength(TriangleShape t){
        double a = this.getLength(this.pointa,this.pointb);
        double b = this.getLength(this.pointa,this.pointc);
        double c = this.getLength(this.pointb,this.pointc);
        return a+b+c;
    }

    public double getArea(TriangleShape t){
        //求p
        double p = (this.getLength(this))/2;
        //三边
        double a = this.getLength(this.pointa,this.pointb);
        double b = this.getLength(this.pointa,this.pointc);
        double c = this.getLength(this.pointb,this.pointc);
        //求面积
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }

    public Point getPointa() {
        return pointa;
    }

    public void setPointa(Point pointa) {
        this.pointa = pointa;
    }

    public Point getPointb() {
        return pointb;
    }

    public void setPointb(Point pointb) {
        this.pointb = pointb;
    }

    public Point getPointc() {
        return pointc;
    }

    public void setPointc(Point pointc) {
        this.pointc = pointc;
    }

    @Override
    public String toString() {
        return "TriangleShape{" +
                "pointa=" + pointa +
                ", pointb=" + pointb +
                ", pointc=" + pointc +
                '}';
    }
}
