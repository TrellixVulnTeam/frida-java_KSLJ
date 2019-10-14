/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GInputMessage {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GInputMessage(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GInputMessage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        fridacoreJNI.delete__GInputMessage(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAddress(SWIGTYPE_p_p__GSocketAddress value) {
    fridacoreJNI._GInputMessage_address_set(swigCPtr, this, SWIGTYPE_p_p__GSocketAddress.getCPtr(value));
  }

  public SWIGTYPE_p_p__GSocketAddress getAddress() {
    long cPtr = fridacoreJNI._GInputMessage_address_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p__GSocketAddress(cPtr, false);
  }

  public void setVectors(_GInputVector value) {
    fridacoreJNI._GInputMessage_vectors_set(swigCPtr, this, _GInputVector.getCPtr(value), value);
  }

  public _GInputVector getVectors() {
    long cPtr = fridacoreJNI._GInputMessage_vectors_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GInputVector(cPtr, false);
  }

  public void setNum_vectors(long value) {
    fridacoreJNI._GInputMessage_num_vectors_set(swigCPtr, this, value);
  }

  public long getNum_vectors() {
    return fridacoreJNI._GInputMessage_num_vectors_get(swigCPtr, this);
  }

  public void setBytes_received(long value) {
    fridacoreJNI._GInputMessage_bytes_received_set(swigCPtr, this, value);
  }

  public long getBytes_received() {
    return fridacoreJNI._GInputMessage_bytes_received_get(swigCPtr, this);
  }

  public void setFlags(int value) {
    fridacoreJNI._GInputMessage_flags_set(swigCPtr, this, value);
  }

  public int getFlags() {
    return fridacoreJNI._GInputMessage_flags_get(swigCPtr, this);
  }

  public void setControl_messages(SWIGTYPE_p_p_p__GSocketControlMessage value) {
    fridacoreJNI._GInputMessage_control_messages_set(swigCPtr, this, SWIGTYPE_p_p_p__GSocketControlMessage.getCPtr(value));
  }

  public SWIGTYPE_p_p_p__GSocketControlMessage getControl_messages() {
    long cPtr = fridacoreJNI._GInputMessage_control_messages_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_p__GSocketControlMessage(cPtr, false);
  }

  public void setNum_control_messages(SWIGTYPE_p_unsigned_int value) {
    fridacoreJNI._GInputMessage_num_control_messages_set(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_int getNum_control_messages() {
    long cPtr = fridacoreJNI._GInputMessage_num_control_messages_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_int(cPtr, false);
  }

  public _GInputMessage() {
    this(fridacoreJNI.new__GInputMessage(), true);
  }

}