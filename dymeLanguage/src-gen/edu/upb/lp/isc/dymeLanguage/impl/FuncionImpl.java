/**
 * generated by Xtext 2.26.0
 */
package edu.upb.lp.isc.dymeLanguage.impl;

import edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage;
import edu.upb.lp.isc.dymeLanguage.Expresion;
import edu.upb.lp.isc.dymeLanguage.Funcion;
import edu.upb.lp.isc.dymeLanguage.Instruccion;
import edu.upb.lp.isc.dymeLanguage.Param;
import edu.upb.lp.isc.dymeLanguage.Tipo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Funcion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.impl.FuncionImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.impl.FuncionImpl#getParam <em>Param</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.impl.FuncionImpl#getInstr <em>Instr</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.impl.FuncionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.impl.FuncionImpl#isReturnTipo <em>Return Tipo</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.impl.FuncionImpl#getTip <em>Tip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuncionImpl extends MinimalEObjectImpl.Container implements Funcion
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected EList<Param> param;

  /**
   * The cached value of the '{@link #getInstr() <em>Instr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstr()
   * @generated
   * @ordered
   */
  protected EList<Instruccion> instr;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expresion expr;

  /**
   * The default value of the '{@link #isReturnTipo() <em>Return Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReturnTipo()
   * @generated
   * @ordered
   */
  protected static final boolean RETURN_TIPO_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReturnTipo() <em>Return Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReturnTipo()
   * @generated
   * @ordered
   */
  protected boolean returnTipo = RETURN_TIPO_EDEFAULT;

  /**
   * The cached value of the '{@link #getTip() <em>Tip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTip()
   * @generated
   * @ordered
   */
  protected Tipo tip;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FuncionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DymeLanguagePackage.Literals.FUNCION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DymeLanguagePackage.FUNCION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Param> getParam()
  {
    if (param == null)
    {
      param = new EObjectContainmentEList<Param>(Param.class, this, DymeLanguagePackage.FUNCION__PARAM);
    }
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Instruccion> getInstr()
  {
    if (instr == null)
    {
      instr = new EObjectContainmentEList<Instruccion>(Instruccion.class, this, DymeLanguagePackage.FUNCION__INSTR);
    }
    return instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expresion getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expresion newExpr, NotificationChain msgs)
  {
    Expresion oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DymeLanguagePackage.FUNCION__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpr(Expresion newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DymeLanguagePackage.FUNCION__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DymeLanguagePackage.FUNCION__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DymeLanguagePackage.FUNCION__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isReturnTipo()
  {
    return returnTipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReturnTipo(boolean newReturnTipo)
  {
    boolean oldReturnTipo = returnTipo;
    returnTipo = newReturnTipo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DymeLanguagePackage.FUNCION__RETURN_TIPO, oldReturnTipo, returnTipo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Tipo getTip()
  {
    return tip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTip(Tipo newTip, NotificationChain msgs)
  {
    Tipo oldTip = tip;
    tip = newTip;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DymeLanguagePackage.FUNCION__TIP, oldTip, newTip);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTip(Tipo newTip)
  {
    if (newTip != tip)
    {
      NotificationChain msgs = null;
      if (tip != null)
        msgs = ((InternalEObject)tip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DymeLanguagePackage.FUNCION__TIP, null, msgs);
      if (newTip != null)
        msgs = ((InternalEObject)newTip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DymeLanguagePackage.FUNCION__TIP, null, msgs);
      msgs = basicSetTip(newTip, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DymeLanguagePackage.FUNCION__TIP, newTip, newTip));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DymeLanguagePackage.FUNCION__PARAM:
        return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
      case DymeLanguagePackage.FUNCION__INSTR:
        return ((InternalEList<?>)getInstr()).basicRemove(otherEnd, msgs);
      case DymeLanguagePackage.FUNCION__EXPR:
        return basicSetExpr(null, msgs);
      case DymeLanguagePackage.FUNCION__TIP:
        return basicSetTip(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DymeLanguagePackage.FUNCION__NAME:
        return getName();
      case DymeLanguagePackage.FUNCION__PARAM:
        return getParam();
      case DymeLanguagePackage.FUNCION__INSTR:
        return getInstr();
      case DymeLanguagePackage.FUNCION__EXPR:
        return getExpr();
      case DymeLanguagePackage.FUNCION__RETURN_TIPO:
        return isReturnTipo();
      case DymeLanguagePackage.FUNCION__TIP:
        return getTip();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DymeLanguagePackage.FUNCION__NAME:
        setName((String)newValue);
        return;
      case DymeLanguagePackage.FUNCION__PARAM:
        getParam().clear();
        getParam().addAll((Collection<? extends Param>)newValue);
        return;
      case DymeLanguagePackage.FUNCION__INSTR:
        getInstr().clear();
        getInstr().addAll((Collection<? extends Instruccion>)newValue);
        return;
      case DymeLanguagePackage.FUNCION__EXPR:
        setExpr((Expresion)newValue);
        return;
      case DymeLanguagePackage.FUNCION__RETURN_TIPO:
        setReturnTipo((Boolean)newValue);
        return;
      case DymeLanguagePackage.FUNCION__TIP:
        setTip((Tipo)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DymeLanguagePackage.FUNCION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DymeLanguagePackage.FUNCION__PARAM:
        getParam().clear();
        return;
      case DymeLanguagePackage.FUNCION__INSTR:
        getInstr().clear();
        return;
      case DymeLanguagePackage.FUNCION__EXPR:
        setExpr((Expresion)null);
        return;
      case DymeLanguagePackage.FUNCION__RETURN_TIPO:
        setReturnTipo(RETURN_TIPO_EDEFAULT);
        return;
      case DymeLanguagePackage.FUNCION__TIP:
        setTip((Tipo)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DymeLanguagePackage.FUNCION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DymeLanguagePackage.FUNCION__PARAM:
        return param != null && !param.isEmpty();
      case DymeLanguagePackage.FUNCION__INSTR:
        return instr != null && !instr.isEmpty();
      case DymeLanguagePackage.FUNCION__EXPR:
        return expr != null;
      case DymeLanguagePackage.FUNCION__RETURN_TIPO:
        return returnTipo != RETURN_TIPO_EDEFAULT;
      case DymeLanguagePackage.FUNCION__TIP:
        return tip != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", returnTipo: ");
    result.append(returnTipo);
    result.append(')');
    return result.toString();
  }

} //FuncionImpl
