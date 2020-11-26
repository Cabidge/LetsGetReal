public abstract class Number {
    public abstract double getValue();
  
    /*return 0 when this Number equals the other Number
    return a negative value when this Number is smaller than the other Number
    return a positive value when this Number is larger than the other Number
    */
    public int compareTo(Number other) {
        //TO BE IMPLEMENTED
        return 0;
    }
  
    /*
    *Return true when the % difference of the values
    *are within 0.00001 of eachother.
    *Special case: if one is exactly zero, the other must be exactly zero.
    */
    public boolean equals(Number other){
        double thisValue = getValue();
        double otherValue = other.getValue();
        
        if (thisValue == 0) {
            return thisValue == otherValue;
        }
  
        double error = Math.abs((thisValue - otherValue) / thisValue) * 100; // * 100 to get percent error
        return error <= 0.001;
      }
  }