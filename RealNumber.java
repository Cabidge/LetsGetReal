public class RealNumber extends Number {
    private double value;
  
    public RealNumber(double v){
      value = v;
    }
  
    public double getValue(){
      return value;
    }
  
    public String toString(){
      return ""+getValue();
    }
    //---------ONLY EDIT BELOW THIS LINE------------
  
    /*
    *Return true when the values are within 0.001% of eachother.
    *Special case: if one is exactly zero, the other must be exactly zero.
    */
    public boolean equals(RealNumber other){
      double thisValue = getValue();
      double otherValue = other.getValue();
      
      if (thisValue == 0) {
          return thisValue == otherValue;
      }

      double error = Math.abs((thisValue - otherValue) / thisValue) * 100; // * 100 to get percent error
      return error <= 0.001;
    }
  
    /*
    *Return a new RealNumber that has the value of:
    *the sum of this and the other
    */
    public RealNumber add(RealNumber other){
      //other can be ANY RealNumber, including a RationalNumber
      //or other subclasses of RealNumber (that aren't written yet)
      RealNumber out = new RealNumber(getValue() + other.getValue());
      return out;
    }
  
    /*
    *Return a new RealNumber that has the value of:
    *the product of this and the other
    */
    public RealNumber multiply(RealNumber other){
      RealNumber out = new RealNumber(getValue() * other.getValue());
      return out;
    }
  
    /*
    *Return a new RealNumber that has the value of:
    *this divided by the other
    */
    public RealNumber divide(RealNumber other){
      RealNumber out = new RealNumber(getValue() / other.getValue());
      return out;
    }
  
    /*
    *Return a new RealNumber that has the value of:
    *this minus the other
    */
    public RealNumber subtract(RealNumber other){
      RealNumber out = new RealNumber(getValue() - other.getValue());
      return out;
    }
  }