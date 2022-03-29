/**
 * generated by Xtext 2.26.0
 */
package edu.upb.lp.isc.dymeLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XOR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.XOR#getOperadorXOR <em>Operador XOR</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.XOR#getExprLogIzq <em>Expr Log Izq</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.XOR#getExprLogDer <em>Expr Log Der</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getXOR()
 * @model
 * @generated
 */
public interface XOR extends EObject
{
  /**
   * Returns the value of the '<em><b>Operador XOR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operador XOR</em>' attribute.
   * @see #setOperadorXOR(String)
   * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getXOR_OperadorXOR()
   * @model
   * @generated
   */
  String getOperadorXOR();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.dymeLanguage.XOR#getOperadorXOR <em>Operador XOR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operador XOR</em>' attribute.
   * @see #getOperadorXOR()
   * @generated
   */
  void setOperadorXOR(String value);

  /**
   * Returns the value of the '<em><b>Expr Log Izq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Log Izq</em>' containment reference.
   * @see #setExprLogIzq(Expresion)
   * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getXOR_ExprLogIzq()
   * @model containment="true"
   * @generated
   */
  Expresion getExprLogIzq();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.dymeLanguage.XOR#getExprLogIzq <em>Expr Log Izq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Log Izq</em>' containment reference.
   * @see #getExprLogIzq()
   * @generated
   */
  void setExprLogIzq(Expresion value);

  /**
   * Returns the value of the '<em><b>Expr Log Der</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Log Der</em>' containment reference.
   * @see #setExprLogDer(Expresion)
   * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getXOR_ExprLogDer()
   * @model containment="true"
   * @generated
   */
  Expresion getExprLogDer();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.dymeLanguage.XOR#getExprLogDer <em>Expr Log Der</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Log Der</em>' containment reference.
   * @see #getExprLogDer()
   * @generated
   */
  void setExprLogDer(Expresion value);

} // XOR
