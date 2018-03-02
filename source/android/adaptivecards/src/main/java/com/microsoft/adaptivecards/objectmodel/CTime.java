/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class CTime {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CTime(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CTime obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_CTime(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSec(int value) {
    AdaptiveCardObjectModelJNI.CTime_Sec_set(swigCPtr, this, value);
  }

  public int getSec() {
    return AdaptiveCardObjectModelJNI.CTime_Sec_get(swigCPtr, this);
  }

  public void setMin(int value) {
    AdaptiveCardObjectModelJNI.CTime_Min_set(swigCPtr, this, value);
  }

  public int getMin() {
    return AdaptiveCardObjectModelJNI.CTime_Min_get(swigCPtr, this);
  }

  public void setHour(int value) {
    AdaptiveCardObjectModelJNI.CTime_Hour_set(swigCPtr, this, value);
  }

  public int getHour() {
    return AdaptiveCardObjectModelJNI.CTime_Hour_get(swigCPtr, this);
  }

  public void setMDay(int value) {
    AdaptiveCardObjectModelJNI.CTime_MDay_set(swigCPtr, this, value);
  }

  public int getMDay() {
    return AdaptiveCardObjectModelJNI.CTime_MDay_get(swigCPtr, this);
  }

  public void setMon(int value) {
    AdaptiveCardObjectModelJNI.CTime_Mon_set(swigCPtr, this, value);
  }

  public int getMon() {
    return AdaptiveCardObjectModelJNI.CTime_Mon_get(swigCPtr, this);
  }

  public void setYear(int value) {
    AdaptiveCardObjectModelJNI.CTime_Year_set(swigCPtr, this, value);
  }

  public int getYear() {
    return AdaptiveCardObjectModelJNI.CTime_Year_get(swigCPtr, this);
  }

  public void setWDay(int value) {
    AdaptiveCardObjectModelJNI.CTime_WDay_set(swigCPtr, this, value);
  }

  public int getWDay() {
    return AdaptiveCardObjectModelJNI.CTime_WDay_get(swigCPtr, this);
  }

  public void setYDay(int value) {
    AdaptiveCardObjectModelJNI.CTime_YDay_set(swigCPtr, this, value);
  }

  public int getYDay() {
    return AdaptiveCardObjectModelJNI.CTime_YDay_get(swigCPtr, this);
  }

  public void setIsDst(int value) {
    AdaptiveCardObjectModelJNI.CTime_IsDst_set(swigCPtr, this, value);
  }

  public int getIsDst() {
    return AdaptiveCardObjectModelJNI.CTime_IsDst_get(swigCPtr, this);
  }

  public CTime() {
    this(AdaptiveCardObjectModelJNI.new_CTime(), true);
  }

}