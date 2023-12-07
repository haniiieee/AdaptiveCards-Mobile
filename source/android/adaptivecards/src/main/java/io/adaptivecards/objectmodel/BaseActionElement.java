/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class BaseActionElement extends BaseElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected BaseActionElement(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.BaseActionElement_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BaseActionElement obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_BaseActionElement(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigSetCMemOwn(false);
    delete();
  }

  public void swigReleaseOwnership() {
    swigSetCMemOwn(false);
    AdaptiveCardObjectModelJNI.BaseActionElement_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigSetCMemOwn(true);
    AdaptiveCardObjectModelJNI.BaseActionElement_change_ownership(this, swigCPtr, true);
  }

  // check if the C++ code finds an object and just return ourselves if it doesn't
  public BaseActionElement findImplObj() {
     Object o = swigOriginalObject();
     return o != null ? (BaseActionElement)o : this;
  }

  public BaseActionElement(ActionType type) {
    this(AdaptiveCardObjectModelJNI.new_BaseActionElement__SWIG_0(type.swigValue()), true);
    AdaptiveCardObjectModelJNI.BaseActionElement_director_connect(this, swigCPtr, true, true);
  }

  public BaseActionElement() {
    this(AdaptiveCardObjectModelJNI.new_BaseActionElement__SWIG_1(), true);
    AdaptiveCardObjectModelJNI.BaseActionElement_director_connect(this, swigCPtr, true, true);
  }

  public BaseActionElement(BaseActionElement arg0) {
    this(AdaptiveCardObjectModelJNI.new_BaseActionElement__SWIG_2(BaseActionElement.getCPtr(arg0), arg0), true);
    AdaptiveCardObjectModelJNI.BaseActionElement_director_connect(this, swigCPtr, true, true);
  }

  public String GetTitle() {
    return AdaptiveCardObjectModelJNI.BaseActionElement_GetTitle(swigCPtr, this);
  }

  public void SetTitle(SWIGTYPE_p_std__string value) {
    if (getClass() == BaseActionElement.class) AdaptiveCardObjectModelJNI.BaseActionElement_SetTitle__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value)); else AdaptiveCardObjectModelJNI.BaseActionElement_SetTitleSwigExplicitBaseActionElement__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public void SetTitle(String value) {
    if (getClass() == BaseActionElement.class) AdaptiveCardObjectModelJNI.BaseActionElement_SetTitle__SWIG_1(swigCPtr, this, value); else AdaptiveCardObjectModelJNI.BaseActionElement_SetTitleSwigExplicitBaseActionElement__SWIG_1(swigCPtr, this, value);
  }

  public String GetIconUrl() {
    return AdaptiveCardObjectModelJNI.BaseActionElement_GetIconUrl(swigCPtr, this);
  }

  public void SetIconUrl(SWIGTYPE_p_std__string value) {
    AdaptiveCardObjectModelJNI.BaseActionElement_SetIconUrl__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public void SetIconUrl(String value) {
    AdaptiveCardObjectModelJNI.BaseActionElement_SetIconUrl__SWIG_1(swigCPtr, this, value);
  }

  public String GetStyle() {
    return AdaptiveCardObjectModelJNI.BaseActionElement_GetStyle(swigCPtr, this);
  }

  public void SetStyle(SWIGTYPE_p_std__string value) {
    AdaptiveCardObjectModelJNI.BaseActionElement_SetStyle__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public void SetStyle(String value) {
    AdaptiveCardObjectModelJNI.BaseActionElement_SetStyle__SWIG_1(swigCPtr, this, value);
  }

  public String GetTooltip() {
    return AdaptiveCardObjectModelJNI.BaseActionElement_GetTooltip(swigCPtr, this);
  }

  public void SetTooltip(SWIGTYPE_p_std__string value) {
    if (getClass() == BaseActionElement.class) AdaptiveCardObjectModelJNI.BaseActionElement_SetTooltip__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value)); else AdaptiveCardObjectModelJNI.BaseActionElement_SetTooltipSwigExplicitBaseActionElement__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public void SetTooltip(String value) {
    if (getClass() == BaseActionElement.class) AdaptiveCardObjectModelJNI.BaseActionElement_SetTooltip__SWIG_1(swigCPtr, this, value); else AdaptiveCardObjectModelJNI.BaseActionElement_SetTooltipSwigExplicitBaseActionElement__SWIG_1(swigCPtr, this, value);
  }

  public ActionType GetElementType() {
    return ActionType.swigToEnum(AdaptiveCardObjectModelJNI.BaseActionElement_GetElementType(swigCPtr, this));
  }

  public Mode GetMode() {
    return Mode.swigToEnum(AdaptiveCardObjectModelJNI.BaseActionElement_GetMode(swigCPtr, this));
  }

  public void SetMode(Mode mode) {
    AdaptiveCardObjectModelJNI.BaseActionElement_SetMode(swigCPtr, this, mode.swigValue());
  }

  public boolean GetIsEnabled() {
    return AdaptiveCardObjectModelJNI.BaseActionElement_GetIsEnabled(swigCPtr, this);
  }

  public void SetIsEnabled(boolean isEnabled) {
    AdaptiveCardObjectModelJNI.BaseActionElement_SetIsEnabled(swigCPtr, this, isEnabled);
  }

  public ActionRole GetRole() {
    return ActionRole.swigToEnum(AdaptiveCardObjectModelJNI.BaseActionElement_GetRole(swigCPtr, this));
  }

  public void SetRole(ActionRole role) {
    AdaptiveCardObjectModelJNI.BaseActionElement_SetRole(swigCPtr, this, role.swigValue());
  }

  public void GetResourceInformation(RemoteResourceInformationVector resourceUris) {
    if (getClass() == BaseActionElement.class) AdaptiveCardObjectModelJNI.BaseActionElement_GetResourceInformation(swigCPtr, this, RemoteResourceInformationVector.getCPtr(resourceUris), resourceUris); else AdaptiveCardObjectModelJNI.BaseActionElement_GetResourceInformationSwigExplicitBaseActionElement(swigCPtr, this, RemoteResourceInformationVector.getCPtr(resourceUris), resourceUris);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue((getClass() == BaseActionElement.class) ? AdaptiveCardObjectModelJNI.BaseActionElement_SerializeToJsonValue(swigCPtr, this) : AdaptiveCardObjectModelJNI.BaseActionElement_SerializeToJsonValueSwigExplicitBaseActionElement(swigCPtr, this), true);
  }

  public static BaseActionElement DeserializeBasePropertiesFromString(ParseContext context, String jsonString) {
    long cPtr = AdaptiveCardObjectModelJNI.BaseActionElement_DeserializeBasePropertiesFromString(ParseContext.getCPtr(context), context, jsonString);
    return (cPtr == 0) ? null : new BaseActionElement(cPtr, true);
  }

  public static BaseActionElement DeserializeBaseProperties(ParseContext context, JsonValue json) {
    long cPtr = AdaptiveCardObjectModelJNI.BaseActionElement_DeserializeBaseProperties(ParseContext.getCPtr(context), context, JsonValue.getCPtr(json), json);
    return (cPtr == 0) ? null : new BaseActionElement(cPtr, true);
  }

  public static void ParseJsonObject(ParseContext context, JsonValue json, BaseElement element) {
    AdaptiveCardObjectModelJNI.BaseActionElement_ParseJsonObject(ParseContext.getCPtr(context), context, JsonValue.getCPtr(json), json, BaseElement.getCPtr(element), element);
  }

  public java.lang.Object swigOriginalObject() {
    return AdaptiveCardObjectModelJNI.BaseActionElement_swigOriginalObject(swigCPtr, this);
  }

  public static BaseActionElement dynamic_cast(BaseElement baseElement) {
    long cPtr = AdaptiveCardObjectModelJNI.BaseActionElement_dynamic_cast(BaseElement.getCPtr(baseElement), baseElement);
    return (cPtr == 0) ? null : new BaseActionElement(cPtr, true);
  }

}
