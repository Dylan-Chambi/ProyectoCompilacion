/**
 * generated by Xtext 2.26.0
 */
package edu.upb.lp.isc.dymeLanguage.impl;

import edu.upb.lp.isc.dymeLanguage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DymeLanguageFactoryImpl extends EFactoryImpl implements DymeLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DymeLanguageFactory init()
  {
    try
    {
      DymeLanguageFactory theDymeLanguageFactory = (DymeLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(DymeLanguagePackage.eNS_URI);
      if (theDymeLanguageFactory != null)
      {
        return theDymeLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DymeLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DymeLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DymeLanguagePackage.PROGRAMA: return createPrograma();
      case DymeLanguagePackage.FUNCION: return createFuncion();
      case DymeLanguagePackage.LLAMADO_FUNC: return createLlamadoFunc();
      case DymeLanguagePackage.PARAM: return createParam();
      case DymeLanguagePackage.INSTRUCCION: return createInstruccion();
      case DymeLanguagePackage.ASIGNACION: return createAsignacion();
      case DymeLanguagePackage.TIPO: return createTipo();
      case DymeLanguagePackage.CONSTANTE: return createConstante();
      case DymeLanguagePackage.EXPRESION: return createExpresion();
      case DymeLanguagePackage.EXPR_CONCATENACION: return createExprConcatenacion();
      case DymeLanguagePackage.EXPR_ARITMETICA: return createExprAritmetica();
      case DymeLanguagePackage.EXPR_LOGICA: return createExprLogica();
      case DymeLanguagePackage.PLANETA: return createPlaneta();
      case DymeLanguagePackage.CONSTELACION: return createConstelacion();
      case DymeLanguagePackage.ESTRELLA: return createEstrella();
      case DymeLanguagePackage.POLVO_ESTELAR: return createPolvoEstelar();
      case DymeLanguagePackage.LUNA: return createLuna();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Programa createPrograma()
  {
    ProgramaImpl programa = new ProgramaImpl();
    return programa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Funcion createFuncion()
  {
    FuncionImpl funcion = new FuncionImpl();
    return funcion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LlamadoFunc createLlamadoFunc()
  {
    LlamadoFuncImpl llamadoFunc = new LlamadoFuncImpl();
    return llamadoFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Instruccion createInstruccion()
  {
    InstruccionImpl instruccion = new InstruccionImpl();
    return instruccion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Asignacion createAsignacion()
  {
    AsignacionImpl asignacion = new AsignacionImpl();
    return asignacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Tipo createTipo()
  {
    TipoImpl tipo = new TipoImpl();
    return tipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Constante createConstante()
  {
    ConstanteImpl constante = new ConstanteImpl();
    return constante;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expresion createExpresion()
  {
    ExpresionImpl expresion = new ExpresionImpl();
    return expresion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExprConcatenacion createExprConcatenacion()
  {
    ExprConcatenacionImpl exprConcatenacion = new ExprConcatenacionImpl();
    return exprConcatenacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExprAritmetica createExprAritmetica()
  {
    ExprAritmeticaImpl exprAritmetica = new ExprAritmeticaImpl();
    return exprAritmetica;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExprLogica createExprLogica()
  {
    ExprLogicaImpl exprLogica = new ExprLogicaImpl();
    return exprLogica;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Planeta createPlaneta()
  {
    PlanetaImpl planeta = new PlanetaImpl();
    return planeta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Constelacion createConstelacion()
  {
    ConstelacionImpl constelacion = new ConstelacionImpl();
    return constelacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Estrella createEstrella()
  {
    EstrellaImpl estrella = new EstrellaImpl();
    return estrella;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PolvoEstelar createPolvoEstelar()
  {
    PolvoEstelarImpl polvoEstelar = new PolvoEstelarImpl();
    return polvoEstelar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Luna createLuna()
  {
    LunaImpl luna = new LunaImpl();
    return luna;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DymeLanguagePackage getDymeLanguagePackage()
  {
    return (DymeLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DymeLanguagePackage getPackage()
  {
    return DymeLanguagePackage.eINSTANCE;
  }

} //DymeLanguageFactoryImpl
