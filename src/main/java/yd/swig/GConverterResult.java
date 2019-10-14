/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GConverterResult {
  public final static GConverterResult G_CONVERTER_ERROR = new GConverterResult("G_CONVERTER_ERROR", fridacoreJNI.G_CONVERTER_ERROR_get());
  public final static GConverterResult G_CONVERTER_CONVERTED = new GConverterResult("G_CONVERTER_CONVERTED", fridacoreJNI.G_CONVERTER_CONVERTED_get());
  public final static GConverterResult G_CONVERTER_FINISHED = new GConverterResult("G_CONVERTER_FINISHED", fridacoreJNI.G_CONVERTER_FINISHED_get());
  public final static GConverterResult G_CONVERTER_FLUSHED = new GConverterResult("G_CONVERTER_FLUSHED", fridacoreJNI.G_CONVERTER_FLUSHED_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GConverterResult swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GConverterResult.class + " with value " + swigValue);
  }

  private GConverterResult(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GConverterResult(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GConverterResult(String swigName, GConverterResult swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GConverterResult[] swigValues = { G_CONVERTER_ERROR, G_CONVERTER_CONVERTED, G_CONVERTER_FINISHED, G_CONVERTER_FLUSHED };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
