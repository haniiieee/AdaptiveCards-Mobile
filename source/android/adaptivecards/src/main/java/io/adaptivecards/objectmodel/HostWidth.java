/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public enum HostWidth {
  Default(0),
  VeryNarrow(1),
  Narrow(2),
  Standard(3),
  Wide(4);

  public final int swigValue() {
    return swigValue;
  }

  public static HostWidth swigToEnum(int swigValue) {
    HostWidth[] swigValues = HostWidth.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (HostWidth swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + HostWidth.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private HostWidth() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private HostWidth(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private HostWidth(HostWidth swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
