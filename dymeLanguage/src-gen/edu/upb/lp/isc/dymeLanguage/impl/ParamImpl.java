/**
 * generated by Xtext 2.26.0
 */
package edu.upb.lp.isc.dymeLanguage.impl;

import edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage;
import edu.upb.lp.isc.dymeLanguage.Param;
import edu.upb.lp.isc.dymeLanguage.Primitivo;
import edu.upb.lp.isc.dymeLanguage.TipoFuncionOrdenSuperior;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.impl.ParamImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.impl.ParamImpl#getParam <em>Param</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.impl.ParamImpl#isTipoRetorno <em>Tipo Retorno</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.impl.ParamImpl#getReturnTipo <em>Return Tipo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParamImpl extends DeclaracionImpl implements Param
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
  protected EList<TipoFuncionOrdenSuperior> param;

  /**
   * The default value of the '{@link #isTipoRetorno() <em>Tipo Retorno</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTipoRetorno()
   * @generated
   * @ordered
   */
  protected static final boolean TIPO_RETORNO_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTipoRetorno() <em>Tipo Retorno</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTipoRetorno()
   * @generated
   * @ordered
   */
  protected boolean tipoRetorno = TIPO_RETORNO_EDEFAULT;

  /**
   * The cached value of the '{@link #getReturnTipo() <em>Return Tipo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnTipo()
   * @generated
   * @ordered
   */
  protected Primitivo returnTipo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParamImpl()
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
    return DymeLanguagePackage.Literals.PARAM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DymeLanguagePackage.PARAM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<TipoFuncionOrdenSuperior> getParam()
  {
    if (param == null)
    {
      param = new EObjectContainmentEList<TipoFuncionOrdenSuperior>(TipoFuncionOrdenSuperior.class, this, DymeLanguagePackage.PARAM__PARAM);
    }
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isTipoRetorno()
  {
    return tipoRetorno;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTipoRetorno(boolean newTipoRetorno)
  {
    boolean oldTipoRetorno = tipoRetorno;
    tipoRetorno = newTipoRetorno;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DymeLanguagePackage.PARAM__TIPO_RETORNO, oldTipoRetorno, tipoRetorno));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Primitivo getReturnTipo()
  {
    return returnTipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnTipo(Primitivo newReturnTipo, NotificationChain msgs)
  {
    Primitivo oldReturnTipo = returnTipo;
    returnTipo = newReturnTipo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DymeLanguagePackage.PARAM__RETURN_TIPO, oldReturnTipo, newReturnTipo);
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
  public void setReturnTipo(Primitivo newReturnTipo)
  {
    if (newReturnTipo != returnTipo)
    {
      NotificationChain msgs = null;
      if (returnTipo != null)
        msgs = ((InternalEObject)returnTipo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DymeLanguagePackage.PARAM__RETURN_TIPO, null, msgs);
      if (newReturnTipo != null)
        msgs = ((InternalEObject)newReturnTipo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DymeLanguagePackage.PARAM__RETURN_TIPO, null, msgs);
      msgs = basicSetReturnTipo(newReturnTipo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DymeLanguagePackage.PARAM__RETURN_TIPO, newReturnTipo, newReturnTipo));
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
      case DymeLanguagePackage.PARAM__PARAM:
        return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
      case DymeLanguagePackage.PARAM__RETURN_TIPO:
        return basicSetReturnTipo(null, msgs);
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
      case DymeLanguagePackage.PARAM__NAME:
        return getName();
      case DymeLanguagePackage.PARAM__PARAM:
        return getParam();
      case DymeLanguagePackage.PARAM__TIPO_RETORNO:
        return isTipoRetorno();
      case DymeLanguagePackage.PARAM__RETURN_TIPO:
        return getReturnTipo();
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
      case DymeLanguagePackage.PARAM__NAME:
        setName((String)newValue);
        return;
      case DymeLanguagePackage.PARAM__PARAM:
        getParam().clear();
        getParam().addAll((Collection<? extends TipoFuncionOrdenSuperior>)newValue);
        return;
      case DymeLanguagePackage.PARAM__TIPO_RETORNO:
        setTipoRetorno((Boolean)newValue);
        return;
      case DymeLanguagePackage.PARAM__RETURN_TIPO:
        setReturnTipo((Primitivo)newValue);
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
      case DymeLanguagePackage.PARAM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DymeLanguagePackage.PARAM__PARAM:
        getParam().clear();
        return;
      case DymeLanguagePackage.PARAM__TIPO_RETORNO:
        setTipoRetorno(TIPO_RETORNO_EDEFAULT);
        return;
      case DymeLanguagePackage.PARAM__RETURN_TIPO:
        setReturnTipo((Primitivo)null);
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
      case DymeLanguagePackage.PARAM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DymeLanguagePackage.PARAM__PARAM:
        return param != null && !param.isEmpty();
      case DymeLanguagePackage.PARAM__TIPO_RETORNO:
        return tipoRetorno != TIPO_RETORNO_EDEFAULT;
      case DymeLanguagePackage.PARAM__RETURN_TIPO:
        return returnTipo != null;
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
    result.append(", tipoRetorno: ");
    result.append(tipoRetorno);
    result.append(')');
    return result.toString();
  }

} //ParamImpl
