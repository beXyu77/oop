package OOP.Lab13;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Parinya
 */

public class Circle extends GeometricObject implements Comparable<Circle> {
  /** The radius of the circle */
  private double radius;

  /** The number of the objects created */
  private static int numberOfObjects = 0;

  /** Construct a circle with radius 1 */
  public Circle() {
    this(1.0);
  }

  /** Construct a circle with a specified radius */
  public Circle(double newRadius) {
    setRadius(newRadius);
    numberOfObjects++;
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double newRadius)
      throws IllegalArgumentException {
    if (newRadius >= 0)
      radius = newRadius;
    else
      throw new IllegalArgumentException(
        "Radius cannot be negative");
  }

  /** Return numberOfObjects */
  public static int getNumberOfObjects() {
    return numberOfObjects;
  }

  /** Return the area of this circle */
  public double findArea() {
    return radius * radius * 3.14159;
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof Circle && radius == ((Circle) obj).radius;
  }

  @Override /** Implement compareTo method */
	public int compareTo(Circle o) {
		if (this.radius > o.radius)
			return 1;
		else if (this.radius < o.radius)
			return -1;
		else
			return 0;
	}

  @Override
  public double getArea() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getArea'");
  }

  @Override
  public double getPerimeter() {
    //TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPerimeter'");
  }
}