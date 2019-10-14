/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GAsciiType {
  public final static GAsciiType G_ASCII_ALNUM = new GAsciiType("G_ASCII_ALNUM", fridacoreJNI.G_ASCII_ALNUM_get());
  public final static GAsciiType G_ASCII_ALPHA = new GAsciiType("G_ASCII_ALPHA", fridacoreJNI.G_ASCII_ALPHA_get());
  public final static GAsciiType G_ASCII_CNTRL = new GAsciiType("G_ASCII_CNTRL", fridacoreJNI.G_ASCII_CNTRL_get());
  public final static GAsciiType G_ASCII_DIGIT = new GAsciiType("G_ASCII_DIGIT", fridacoreJNI.G_ASCII_DIGIT_get());
  public final static GAsciiType G_ASCII_GRAPH = new GAsciiType("G_ASCII_GRAPH", fridacoreJNI.G_ASCII_GRAPH_get());
  public final static GAsciiType G_ASCII_LOWER = new GAsciiType("G_ASCII_LOWER", fridacoreJNI.G_ASCII_LOWER_get());
  public final static GAsciiType G_ASCII_PRINT = new GAsciiType("G_ASCII_PRINT", fridacoreJNI.G_ASCII_PRINT_get());
  public final static GAsciiType G_ASCII_PUNCT = new GAsciiType("G_ASCII_PUNCT", fridacoreJNI.G_ASCII_PUNCT_get());
  public final static GAsciiType G_ASCII_SPACE = new GAsciiType("G_ASCII_SPACE", fridacoreJNI.G_ASCII_SPACE_get());
  public final static GAsciiType G_ASCII_UPPER = new GAsciiType("G_ASCII_UPPER", fridacoreJNI.G_ASCII_UPPER_get());
  public final static GAsciiType G_ASCII_XDIGIT = new GAsciiType("G_ASCII_XDIGIT", fridacoreJNI.G_ASCII_XDIGIT_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GAsciiType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GAsciiType.class + " with value " + swigValue);
  }

  private GAsciiType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GAsciiType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GAsciiType(String swigName, GAsciiType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GAsciiType[] swigValues = { G_ASCII_ALNUM, G_ASCII_ALPHA, G_ASCII_CNTRL, G_ASCII_DIGIT, G_ASCII_GRAPH, G_ASCII_LOWER, G_ASCII_PRINT, G_ASCII_PUNCT, G_ASCII_SPACE, G_ASCII_UPPER, G_ASCII_XDIGIT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
