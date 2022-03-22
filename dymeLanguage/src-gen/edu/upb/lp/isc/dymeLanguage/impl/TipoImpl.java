/**
 * generated by Xtext 2.26.0
 */
package edu.upb.lp.isc.dymeLanguage.impl;

import edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage;
import edu.upb.lp.isc.dymeLanguage.Tipo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tipo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.impl.TipoImpl#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TipoImpl extends TipoFuncionOrdenSuperiorImpl implements Tipo
{
  /**
   * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected static final String TIPO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected String tipo = TIPO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TipoImpl()
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
    return DymeLanguagePackage.Literals.TIPO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTipo()
  {
    return tipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTipo(String newTipo)
  {
    String oldTipo = tipo;
    tipo = newTipo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DymeLanguagePackage.TIPO__TIPO, oldTipo, tipo));
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
      case DymeLanguagePackage.TIPO__TIPO:
        return getTipo();
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
      case DymeLanguagePackage.TIPO__TIPO:
        setTipo((String)newValue);
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
      case DymeLanguagePackage.TIPO__TIPO:
        setTipo(TIPO_EDEFAULT);
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
      case DymeLanguagePackage.TIPO__TIPO:
        return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
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
    result.append(" (tipo: ");
    result.append(tipo);
    result.append(')');
    return result.toString();
  }

} //TipoImpl
