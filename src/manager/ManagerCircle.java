package manager;
import model.Circle;
public class ManagerCircle {
    public void display(Circle circle){
        System.out.println(circle.toString());
    }
    public double calculateS(Circle circle){
        return Circle.PI * circle.getRadius() * circle.getRadius();
    }
    public double calculateC(Circle circle){
        return 2 * Circle.PI * circle.getRadius();
    }
    public double maxRadiusCircle(Circle[] circles){
        double max = circles[0].getRadius();
        for (int i = 1; i < circles.length; i++) {
            if (circles[i].getRadius() > max){
                max = circles[i].getRadius();
            }
        }
        return max;
    }
    public double sumS(Circle[] circles){
        double sum = 0;
        for (int i = 0; i < circles.length; i++) {
            sum += calculateS(circles[i]);
        }
        return sum;
    }
}
