/*
 * this is the Rectangle class extend circle class and inherit area function
 * in this class part of point 1,4 and 5 from the assignment are done
 * heba qadah
 */
public class Rectangle extends Circle
{
    double R_aria; // variable define Rectangle aria

    public Double area(int l , int w) // function to compute Rectangle aria
            //data coupling appear in this function and Print_Area function
    {
        R_aria = l * w;
        return R_aria;
    }

    public void Print_Area(int l, int w, Circle circle) { // in this function used stamp coupling
        // by using a Circle class variable in a Rectangle class function
        circle.area();
        R_aria= area(l,w);
        System.out.println("Area of rectangle with Width ="+ w +" and Length ="+l +" is: " + R_aria);

    }
}