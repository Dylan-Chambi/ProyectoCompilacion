/**
 * generated by Xtext 2.26.0
 */
package edu.upb.lp.isc.dymeLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Funcion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.Funcion#isGusano <em>Gusano</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.Funcion#getName <em>Name</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.Funcion#getParam <em>Param</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.Funcion#getDeclar <em>Declar</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.Funcion#getVal <em>Val</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.Funcion#isTipoInferido <em>Tipo Inferido</em>}</li>
 *   <li>{@link edu.upb.lp.isc.dymeLanguage.Funcion#getTipoClass <em>Tipo Class</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getFuncion()
 * @model
 * @generated
 */
public interface Funcion extends Declaracion
{
  /**
   * Returns the value of the '<em><b>Gusano</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gusano</em>' attribute.
   * @see #setGusano(boolean)
   * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getFuncion_Gusano()
   * @model
   * @generated
   */
  boolean isGusano();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.dymeLanguage.Funcion#isGusano <em>Gusano</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gusano</em>' attribute.
   * @see #isGusano()
   * @generated
   */
  void setGusano(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getFuncion_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.dymeLanguage.Funcion#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference list.
   * The list contents are of type {@link edu.upb.lp.isc.dymeLanguage.Param}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference list.
   * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getFuncion_Param()
   * @model containment="true"
   * @generated
   */
  EList<Param> getParam();

  /**
   * Returns the value of the '<em><b>Declar</b></em>' containment reference list.
   * The list contents are of type {@link edu.upb.lp.isc.dymeLanguage.Declaracion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declar</em>' containment reference list.
   * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getFuncion_Declar()
   * @model containment="true"
   * @generated
   */
  EList<Declaracion> getDeclar();

  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(Valor)
   * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getFuncion_Val()
   * @model containment="true"
   * @generated
   */
  Valor getVal();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.dymeLanguage.Funcion#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(Valor value);

  /**
   * Returns the value of the '<em><b>Tipo Inferido</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo Inferido</em>' attribute.
   * @see #setTipoInferido(boolean)
   * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getFuncion_TipoInferido()
   * @model
   * @generated
   */
  boolean isTipoInferido();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.dymeLanguage.Funcion#isTipoInferido <em>Tipo Inferido</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo Inferido</em>' attribute.
   * @see #isTipoInferido()
   * @generated
   */
  void setTipoInferido(boolean value);

  /**
   * Returns the value of the '<em><b>Tipo Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo Class</em>' containment reference.
   * @see #setTipoClass(Primitivo)
   * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#getFuncion_TipoClass()
   * @model containment="true"
   * @generated
   */
  Primitivo getTipoClass();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.dymeLanguage.Funcion#getTipoClass <em>Tipo Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo Class</em>' containment reference.
   * @see #getTipoClass()
   * @generated
   */
  void setTipoClass(Primitivo value);

} // Funcion
