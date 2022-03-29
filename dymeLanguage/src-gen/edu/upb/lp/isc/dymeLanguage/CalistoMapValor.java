/**
 * generated by Xtext 2.26.0
 */
package edu.upb.lp.isc.dymeLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calisto Map Valor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.CalistoMapValor#getKey <em>Key</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.CalistoMapValor#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getCalistoMapValor()
 * @model
 * @generated
 */
public interface CalistoMapValor extends Valor
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' containment reference list.
   * The list contents are of type {@link edu.upb.lp.isc.dymeLanguage.Expresion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' containment reference list.
   * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getCalistoMapValor_Key()
   * @model containment="true"
   * @generated
   */
  EList<Expresion> getKey();

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link edu.upb.lp.isc.dymeLanguage.Expresion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getCalistoMapValor_Value()
   * @model containment="true"
   * @generated
   */
  EList<Expresion> getValue();

} // CalistoMapValor
