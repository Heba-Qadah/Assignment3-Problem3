/*
 * this is the Circle class implement shape interface and override both function
 * in this class part of point 1, 2 and 3 from the assignment are done
 * heba qadah
 */
public class Circle implements Shape{
    int radius = 0; // radius to compute area such as pi
    double pi = 3.14, C_aria = 0; // C_aria is variable to store the circle aria

    public Circle() {
    }

    @Override // override the first function to declare the radius value
    public void Parameter()
    {
        radius = 5;
    }
    @Override   // override the second method to compute area using circle aria function
    // and print the result
    public void area()
    {
        Parameter();
        C_aria = pi * radius * radius;
        System.out.println("Area of circle with radius = "+ radius+" is: "+C_aria);
    }
}