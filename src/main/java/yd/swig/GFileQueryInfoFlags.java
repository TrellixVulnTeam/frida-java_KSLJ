/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GFileQueryInfoFlags {
  public final static GFileQueryInfoFlags G_FILE_QUERY_INFO_NONE = new GFileQueryInfoFlags("G_FILE_QUERY_INFO_NONE", fridacoreJNI.G_FILE_QUERY_INFO_NONE_get());
  public final static GFileQueryInfoFlags G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS = new GFileQueryInfoFlags("G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS", fridacoreJNI.G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GFileQueryInfoFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GFileQueryInfoFlags.class + " with value " + swigValue);
  }

  private GFileQueryInfoFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GFileQueryInfoFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GFileQueryInfoFlags(String swigName, GFileQueryInfoFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GFileQueryInfoFlags[] swigValues = { G_FILE_QUERY_INFO_NONE, G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
