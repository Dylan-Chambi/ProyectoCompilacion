/**
 * generated by Xtext 2.26.0
 */
package edu.upb.lp.isc.dymeLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Llamado Func</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.LlamadoFunc#getFuncionID <em>Funcion ID</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.LlamadoFunc#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getLlamadoFunc()
 * @model
 * @generated
 */
public interface LlamadoFunc extends Expresion
{
  /**
   * Returns the value of the '<em><b>Funcion ID</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Funcion ID</em>' reference.
   * @see #setFuncionID(Declaracion)
   * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getLlamadoFunc_FuncionID()
   * @model
   * @generated
   */
  Declaracion getFuncionID();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.dymeLanguage.LlamadoFunc#getFuncionID <em>Funcion ID</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Funcion ID</em>' reference.
   * @see #getFuncionID()
   * @generated
   */
  void setFuncionID(Declaracion value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link edu.upb.lp.isc.dymeLanguage.Valor}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getLlamadoFunc_Args()
   * @model containment="true"
   * @generated
   */
  EList<Valor> getArgs();

} // LlamadoFunc
