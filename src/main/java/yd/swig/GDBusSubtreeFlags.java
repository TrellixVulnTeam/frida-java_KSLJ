/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GDBusSubtreeFlags {
  public final static GDBusSubtreeFlags G_DBUS_SUBTREE_FLAGS_NONE = new GDBusSubtreeFlags("G_DBUS_SUBTREE_FLAGS_NONE", fridacoreJNI.G_DBUS_SUBTREE_FLAGS_NONE_get());
  public final static GDBusSubtreeFlags G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES = new GDBusSubtreeFlags("G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES", fridacoreJNI.G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GDBusSubtreeFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GDBusSubtreeFlags.class + " with value " + swigValue);
  }

  private GDBusSubtreeFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GDBusSubtreeFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GDBusSubtreeFlags(String swigName, GDBusSubtreeFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GDBusSubtreeFlags[] swigValues = { G_DBUS_SUBTREE_FLAGS_NONE, G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
