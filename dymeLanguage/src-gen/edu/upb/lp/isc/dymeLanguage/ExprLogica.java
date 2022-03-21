/**
 * generated by Xtext 2.26.0
 */
package edu.upb.lp.isc.dymeLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Logica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.ExprLogica#getOperadorLog <em>Operador Log</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.ExprLogica#getExprLog <em>Expr Log</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getExprLogica()
 * @model
 * @generated
 */
public interface ExprLogica extends Expresion
{
  /**
   * Returns the value of the '<em><b>Operador Log</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operador Log</em>' attribute.
   * @see #setOperadorLog(String)
   * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getExprLogica_OperadorLog()
   * @model
   * @generated
   */
  String getOperadorLog();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.dymeLanguage.ExprLogica#getOperadorLog <em>Operador Log</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operador Log</em>' attribute.
   * @see #getOperadorLog()
   * @generated
   */
  void setOperadorLog(String value);

  /**
   * Returns the value of the '<em><b>Expr Log</b></em>' containment reference list.
   * The list contents are of type {@link edu.upb.lp.isc.dymeLanguage.Expresion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Log</em>' containment reference list.
   * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getExprLogica_ExprLog()
   * @model containment="true"
   * @generated
   */
  EList<Expresion> getExprLog();

} // ExprLogica