/**
 * generated by Xtext 2.26.0
 */
package edu.upb.lp.isc.dymeLanguage.impl;

import edu.upb.lp.isc.dymeLanguage.Asignacion;
import edu.upb.lp.isc.dymeLanguage.DymeLanguageFactory;
import edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage;
import edu.upb.lp.isc.dymeLanguage.ExprSimple;
import edu.upb.lp.isc.dymeLanguage.Expresion;
import edu.upb.lp.isc.dymeLanguage.Funcion;
import edu.upb.lp.isc.dymeLanguage.Instruccion;
import edu.upb.lp.isc.dymeLanguage.LlamadoFunc;
import edu.upb.lp.isc.dymeLanguage.Param;
import edu.upb.lp.isc.dymeLanguage.Suma;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DymeLanguagePackageImpl extends EPackageImpl implements DymeLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass funcionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass llamadoFuncEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruccionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asignacionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expresionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sumaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprSimpleEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DymeLanguagePackageImpl()
  {
    super(eNS_URI, DymeLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link DymeLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DymeLanguagePackage init()
  {
    if (isInited) return (DymeLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(DymeLanguagePackage.eNS_URI);

    // Obtain or create and register package
    Object registeredDymeLanguagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    DymeLanguagePackageImpl theDymeLanguagePackage = registeredDymeLanguagePackage instanceof DymeLanguagePackageImpl ? (DymeLanguagePackageImpl)registeredDymeLanguagePackage : new DymeLanguagePackageImpl();

    isInited = true;

    // Create package meta-data objects
    theDymeLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theDymeLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDymeLanguagePackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DymeLanguagePackage.eNS_URI, theDymeLanguagePackage);
    return theDymeLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFuncion()
  {
    return funcionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFuncion_Name()
  {
    return (EAttribute)funcionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFuncion_Param()
  {
    return (EReference)funcionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFuncion_Instr()
  {
    return (EReference)funcionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFuncion_Tip()
  {
    return (EAttribute)funcionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLlamadoFunc()
  {
    return llamadoFuncEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLlamadoFunc_Funcion()
  {
    return (EReference)llamadoFuncEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLlamadoFunc_Args()
  {
    return (EReference)llamadoFuncEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getParam()
  {
    return paramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getParam_Name()
  {
    return (EAttribute)paramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getParam_Tip()
  {
    return (EAttribute)paramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInstruccion()
  {
    return instruccionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAsignacion()
  {
    return asignacionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAsignacion_Name()
  {
    return (EAttribute)asignacionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAsignacion_Tip()
  {
    return (EAttribute)asignacionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAsignacion_Valor()
  {
    return (EReference)asignacionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpresion()
  {
    return expresionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSuma()
  {
    return sumaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSuma_Izq()
  {
    return (EReference)sumaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSuma_Der()
  {
    return (EReference)sumaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExprSimple()
  {
    return exprSimpleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExprSimple_X()
  {
    return (EAttribute)exprSimpleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExprSimple_P()
  {
    return (EAttribute)exprSimpleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DymeLanguageFactory getDymeLanguageFactory()
  {
    return (DymeLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    funcionEClass = createEClass(FUNCION);
    createEAttribute(funcionEClass, FUNCION__NAME);
    createEReference(funcionEClass, FUNCION__PARAM);
    createEReference(funcionEClass, FUNCION__INSTR);
    createEAttribute(funcionEClass, FUNCION__TIP);

    llamadoFuncEClass = createEClass(LLAMADO_FUNC);
    createEReference(llamadoFuncEClass, LLAMADO_FUNC__FUNCION);
    createEReference(llamadoFuncEClass, LLAMADO_FUNC__ARGS);

    paramEClass = createEClass(PARAM);
    createEAttribute(paramEClass, PARAM__NAME);
    createEAttribute(paramEClass, PARAM__TIP);

    instruccionEClass = createEClass(INSTRUCCION);

    asignacionEClass = createEClass(ASIGNACION);
    createEAttribute(asignacionEClass, ASIGNACION__NAME);
    createEAttribute(asignacionEClass, ASIGNACION__TIP);
    createEReference(asignacionEClass, ASIGNACION__VALOR);

    expresionEClass = createEClass(EXPRESION);

    sumaEClass = createEClass(SUMA);
    createEReference(sumaEClass, SUMA__IZQ);
    createEReference(sumaEClass, SUMA__DER);

    exprSimpleEClass = createEClass(EXPR_SIMPLE);
    createEAttribute(exprSimpleEClass, EXPR_SIMPLE__X);
    createEAttribute(exprSimpleEClass, EXPR_SIMPLE__P);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    llamadoFuncEClass.getESuperTypes().add(this.getExpresion());
    asignacionEClass.getESuperTypes().add(this.getInstruccion());
    sumaEClass.getESuperTypes().add(this.getExpresion());
    exprSimpleEClass.getESuperTypes().add(this.getExpresion());

    // Initialize classes and features; add operations and parameters
    initEClass(funcionEClass, Funcion.class, "Funcion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFuncion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Funcion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFuncion_Param(), this.getParam(), null, "param", null, 0, -1, Funcion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFuncion_Instr(), this.getInstruccion(), null, "instr", null, 0, -1, Funcion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFuncion_Tip(), ecorePackage.getEString(), "tip", null, 0, 1, Funcion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(llamadoFuncEClass, LlamadoFunc.class, "LlamadoFunc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLlamadoFunc_Funcion(), this.getFuncion(), null, "funcion", null, 0, 1, LlamadoFunc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLlamadoFunc_Args(), this.getExpresion(), null, "args", null, 0, -1, LlamadoFunc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramEClass, Param.class, "Param", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParam_Name(), ecorePackage.getEString(), "name", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParam_Tip(), ecorePackage.getEString(), "tip", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruccionEClass, Instruccion.class, "Instruccion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(asignacionEClass, Asignacion.class, "Asignacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAsignacion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Asignacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAsignacion_Tip(), ecorePackage.getEString(), "tip", null, 0, 1, Asignacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAsignacion_Valor(), this.getExpresion(), null, "valor", null, 0, 1, Asignacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expresionEClass, Expresion.class, "Expresion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sumaEClass, Suma.class, "Suma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSuma_Izq(), this.getExprSimple(), null, "izq", null, 0, 1, Suma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSuma_Der(), this.getExprSimple(), null, "der", null, 0, 1, Suma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprSimpleEClass, ExprSimple.class, "ExprSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExprSimple_X(), ecorePackage.getEString(), "x", null, 0, 1, ExprSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprSimple_P(), ecorePackage.getEString(), "p", null, 0, 1, ExprSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DymeLanguagePackageImpl
