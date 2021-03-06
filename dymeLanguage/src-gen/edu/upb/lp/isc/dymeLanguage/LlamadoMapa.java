/**
 * generated by Xtext 2.26.0
 */
package edu.upb.lp.isc.dymeLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Llamado Mapa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.LlamadoMapa#getDecID <em>Dec ID</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.LlamadoMapa#getMapKey <em>Map Key</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getLlamadoMapa()
 * @model
 * @generated
 */
public interface LlamadoMapa extends Expresion
{
  /**
   * Returns the value of the '<em><b>Dec ID</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dec ID</em>' reference.
   * @see #setDecID(Declaracion)
   * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getLlamadoMapa_DecID()
   * @model
   * @generated
   */
  Declaracion getDecID();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.dymeLanguage.LlamadoMapa#getDecID <em>Dec ID</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dec ID</em>' reference.
   * @see #getDecID()
   * @generated
   */
  void setDecID(Declaracion value);

  /**
   * Returns the value of the '<em><b>Map Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map Key</em>' containment reference.
   * @see #setMapKey(Expresion)
   * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getLlamadoMapa_MapKey()
   * @model containment="true"
   * @generated
   */
  Expresion getMapKey();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.dymeLanguage.LlamadoMapa#getMapKey <em>Map Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Map Key</em>' containment reference.
   * @see #getMapKey()
   * @generated
   */
  void setMapKey(Expresion value);

} // LlamadoMapa
