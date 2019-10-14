/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GLogWriterOutput {
  public final static GLogWriterOutput G_LOG_WRITER_HANDLED = new GLogWriterOutput("G_LOG_WRITER_HANDLED", fridacoreJNI.G_LOG_WRITER_HANDLED_get());
  public final static GLogWriterOutput G_LOG_WRITER_UNHANDLED = new GLogWriterOutput("G_LOG_WRITER_UNHANDLED", fridacoreJNI.G_LOG_WRITER_UNHANDLED_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GLogWriterOutput swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GLogWriterOutput.class + " with value " + swigValue);
  }

  private GLogWriterOutput(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GLogWriterOutput(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GLogWriterOutput(String swigName, GLogWriterOutput swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GLogWriterOutput[] swigValues = { G_LOG_WRITER_HANDLED, G_LOG_WRITER_UNHANDLED };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
