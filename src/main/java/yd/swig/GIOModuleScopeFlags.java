/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GIOModuleScopeFlags {
  public final static GIOModuleScopeFlags G_IO_MODULE_SCOPE_NONE = new GIOModuleScopeFlags("G_IO_MODULE_SCOPE_NONE");
  public final static GIOModuleScopeFlags G_IO_MODULE_SCOPE_BLOCK_DUPLICATES = new GIOModuleScopeFlags("G_IO_MODULE_SCOPE_BLOCK_DUPLICATES");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GIOModuleScopeFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GIOModuleScopeFlags.class + " with value " + swigValue);
  }

  private GIOModuleScopeFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GIOModuleScopeFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GIOModuleScopeFlags(String swigName, GIOModuleScopeFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GIOModuleScopeFlags[] swigValues = { G_IO_MODULE_SCOPE_NONE, G_IO_MODULE_SCOPE_BLOCK_DUPLICATES };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
