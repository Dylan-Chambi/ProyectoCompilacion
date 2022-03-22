/**
 * generated by Xtext 2.26.0
 */
package edu.upb.lp.isc.dymeLanguage.impl;

import edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage;
import edu.upb.lp.isc.dymeLanguage.EstrellaFugazMeteoro;
import edu.upb.lp.isc.dymeLanguage.Expresion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Estrella Fugaz Meteoro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.impl.EstrellaFugazMeteoroImpl#getExprLogCondicion <em>Expr Log Condicion</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.impl.EstrellaFugazMeteoroImpl#getEstrellaFugazRes <em>Estrella Fugaz Res</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.impl.EstrellaFugazMeteoroImpl#getMeteoroRes <em>Meteoro Res</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EstrellaFugazMeteoroImpl extends ExpresionImpl implements EstrellaFugazMeteoro
{
  /**
   * The cached value of the '{@link #getExprLogCondicion() <em>Expr Log Condicion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprLogCondicion()
   * @generated
   * @ordered
   */
  protected Expresion exprLogCondicion;

  /**
   * The cached value of the '{@link #getEstrellaFugazRes() <em>Estrella Fugaz Res</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstrellaFugazRes()
   * @generated
   * @ordered
   */
  protected Expresion estrellaFugazRes;

  /**
   * The cached value of the '{@link #getMeteoroRes() <em>Meteoro Res</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeteoroRes()
   * @generated
   * @ordered
   */
  protected Expresion meteoroRes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EstrellaFugazMeteoroImpl()
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
    return DymeLanguagePackage.Literals.ESTRELLA_FUGAZ_METEORO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expresion getExprLogCondicion()
  {
    return exprLogCondicion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprLogCondicion(Expresion newExprLogCondicion, NotificationChain msgs)
  {
    Expresion oldExprLogCondicion = exprLogCondicion;
    exprLogCondicion = newExprLogCondicion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__EXPR_LOG_CONDICION, oldExprLogCondicion, newExprLogCondicion);
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
  public void setExprLogCondicion(Expresion newExprLogCondicion)
  {
    if (newExprLogCondicion != exprLogCondicion)
    {
      NotificationChain msgs = null;
      if (exprLogCondicion != null)
        msgs = ((InternalEObject)exprLogCondicion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__EXPR_LOG_CONDICION, null, msgs);
      if (newExprLogCondicion != null)
        msgs = ((InternalEObject)newExprLogCondicion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__EXPR_LOG_CONDICION, null, msgs);
      msgs = basicSetExprLogCondicion(newExprLogCondicion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__EXPR_LOG_CONDICION, newExprLogCondicion, newExprLogCondicion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expresion getEstrellaFugazRes()
  {
    return estrellaFugazRes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEstrellaFugazRes(Expresion newEstrellaFugazRes, NotificationChain msgs)
  {
    Expresion oldEstrellaFugazRes = estrellaFugazRes;
    estrellaFugazRes = newEstrellaFugazRes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__ESTRELLA_FUGAZ_RES, oldEstrellaFugazRes, newEstrellaFugazRes);
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
  public void setEstrellaFugazRes(Expresion newEstrellaFugazRes)
  {
    if (newEstrellaFugazRes != estrellaFugazRes)
    {
      NotificationChain msgs = null;
      if (estrellaFugazRes != null)
        msgs = ((InternalEObject)estrellaFugazRes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__ESTRELLA_FUGAZ_RES, null, msgs);
      if (newEstrellaFugazRes != null)
        msgs = ((InternalEObject)newEstrellaFugazRes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__ESTRELLA_FUGAZ_RES, null, msgs);
      msgs = basicSetEstrellaFugazRes(newEstrellaFugazRes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__ESTRELLA_FUGAZ_RES, newEstrellaFugazRes, newEstrellaFugazRes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expresion getMeteoroRes()
  {
    return meteoroRes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMeteoroRes(Expresion newMeteoroRes, NotificationChain msgs)
  {
    Expresion oldMeteoroRes = meteoroRes;
    meteoroRes = newMeteoroRes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__METEORO_RES, oldMeteoroRes, newMeteoroRes);
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
  public void setMeteoroRes(Expresion newMeteoroRes)
  {
    if (newMeteoroRes != meteoroRes)
    {
      NotificationChain msgs = null;
      if (meteoroRes != null)
        msgs = ((InternalEObject)meteoroRes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__METEORO_RES, null, msgs);
      if (newMeteoroRes != null)
        msgs = ((InternalEObject)newMeteoroRes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__METEORO_RES, null, msgs);
      msgs = basicSetMeteoroRes(newMeteoroRes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__METEORO_RES, newMeteoroRes, newMeteoroRes));
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
      case DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__EXPR_LOG_CONDICION:
        return basicSetExprLogCondicion(null, msgs);
      case DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__ESTRELLA_FUGAZ_RES:
        return basicSetEstrellaFugazRes(null, msgs);
      case DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__METEORO_RES:
        return basicSetMeteoroRes(null, msgs);
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
      case DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__EXPR_LOG_CONDICION:
        return getExprLogCondicion();
      case DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__ESTRELLA_FUGAZ_RES:
        return getEstrellaFugazRes();
      case DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__METEORO_RES:
        return getMeteoroRes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__EXPR_LOG_CONDICION:
        setExprLogCondicion((Expresion)newValue);
        return;
      case DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__ESTRELLA_FUGAZ_RES:
        setEstrellaFugazRes((Expresion)newValue);
        return;
      case DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__METEORO_RES:
        setMeteoroRes((Expresion)newValue);
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
      case DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__EXPR_LOG_CONDICION:
        setExprLogCondicion((Expresion)null);
        return;
      case DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__ESTRELLA_FUGAZ_RES:
        setEstrellaFugazRes((Expresion)null);
        return;
      case DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__METEORO_RES:
        setMeteoroRes((Expresion)null);
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
      case DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__EXPR_LOG_CONDICION:
        return exprLogCondicion != null;
      case DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__ESTRELLA_FUGAZ_RES:
        return estrellaFugazRes != null;
      case DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO__METEORO_RES:
        return meteoroRes != null;
    }
    return super.eIsSet(featureID);
  }

} //EstrellaFugazMeteoroImpl