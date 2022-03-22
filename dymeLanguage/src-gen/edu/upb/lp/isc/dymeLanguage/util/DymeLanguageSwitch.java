/**
 * generated by Xtext 2.26.0
 */
package edu.upb.lp.isc.dymeLanguage.util;

import edu.upb.lp.isc.dymeLanguage.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.upb.lp.isc.dymeLanguage.DymeLanguagePackage
 * @generated
 */
public class DymeLanguageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DymeLanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DymeLanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DymeLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DymeLanguagePackage.PROGRAMA:
      {
        Programa programa = (Programa)theEObject;
        T result = casePrograma(programa);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DymeLanguagePackage.ESTRELLA_FUGAZ_METEORO:
      {
        EstrellaFugazMeteoro estrellaFugazMeteoro = (EstrellaFugazMeteoro)theEObject;
        T result = caseEstrellaFugazMeteoro(estrellaFugazMeteoro);
        if (result == null) result = caseExpresion(estrellaFugazMeteoro);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DymeLanguagePackage.FUNCION:
      {
        Funcion funcion = (Funcion)theEObject;
        T result = caseFuncion(funcion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DymeLanguagePackage.LLAMADO_FUNC:
      {
        LlamadoFunc llamadoFunc = (LlamadoFunc)theEObject;
        T result = caseLlamadoFunc(llamadoFunc);
        if (result == null) result = caseExpresion(llamadoFunc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DymeLanguagePackage.PARAM:
      {
        Param param = (Param)theEObject;
        T result = caseParam(param);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DymeLanguagePackage.INSTRUCCION:
      {
        Instruccion instruccion = (Instruccion)theEObject;
        T result = caseInstruccion(instruccion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DymeLanguagePackage.ASIGNACION:
      {
        Asignacion asignacion = (Asignacion)theEObject;
        T result = caseAsignacion(asignacion);
        if (result == null) result = caseInstruccion(asignacion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DymeLanguagePackage.TIPO:
      {
        Tipo tipo = (Tipo)theEObject;
        T result = caseTipo(tipo);
        if (result == null) result = caseTipoFuncionOrdenSuperior(tipo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DymeLanguagePackage.TIPO_FUNCION_ORDEN_SUPERIOR:
      {
        TipoFuncionOrdenSuperior tipoFuncionOrdenSuperior = (TipoFuncionOrdenSuperior)theEObject;
        T result = caseTipoFuncionOrdenSuperior(tipoFuncionOrdenSuperior);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DymeLanguagePackage.CONSTANTE:
      {
        Constante constante = (Constante)theEObject;
        T result = caseConstante(constante);
        if (result == null) result = caseExpresion(constante);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DymeLanguagePackage.EXPRESION:
      {
        Expresion expresion = (Expresion)theEObject;
        T result = caseExpresion(expresion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DymeLanguagePackage.EXPR_CONCATENACION:
      {
        ExprConcatenacion exprConcatenacion = (ExprConcatenacion)theEObject;
        T result = caseExprConcatenacion(exprConcatenacion);
        if (result == null) result = caseExpresion(exprConcatenacion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DymeLanguagePackage.EXPR_ARITMETICA:
      {
        ExprAritmetica exprAritmetica = (ExprAritmetica)theEObject;
        T result = caseExprAritmetica(exprAritmetica);
        if (result == null) result = caseExpresion(exprAritmetica);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DymeLanguagePackage.EXPR_LOGICA:
      {
        ExprLogica exprLogica = (ExprLogica)theEObject;
        T result = caseExprLogica(exprLogica);
        if (result == null) result = caseExpresion(exprLogica);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DymeLanguagePackage.EXPR_COMPARACION:
      {
        ExprComparacion exprComparacion = (ExprComparacion)theEObject;
        T result = caseExprComparacion(exprComparacion);
        if (result == null) result = caseExprLogica(exprComparacion);
        if (result == null) result = caseExpresion(exprComparacion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DymeLanguagePackage.PLANETA:
      {
        Planeta planeta = (Planeta)theEObject;
        T result = casePlaneta(planeta);
        if (result == null) result = caseExprAritmetica(planeta);
        if (result == null) result = caseExpresion(planeta);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DymeLanguagePackage.CONSTELACION:
      {
        Constelacion constelacion = (Constelacion)theEObject;
        T result = caseConstelacion(constelacion);
        if (result == null) result = caseExprConcatenacion(constelacion);
        if (result == null) result = caseExpresion(constelacion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DymeLanguagePackage.ESTRELLA:
      {
        Estrella estrella = (Estrella)theEObject;
        T result = caseEstrella(estrella);
        if (result == null) result = caseExprConcatenacion(estrella);
        if (result == null) result = caseExpresion(estrella);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DymeLanguagePackage.POLVO_ESTELAR:
      {
        PolvoEstelar polvoEstelar = (PolvoEstelar)theEObject;
        T result = casePolvoEstelar(polvoEstelar);
        if (result == null) result = caseExprAritmetica(polvoEstelar);
        if (result == null) result = caseExpresion(polvoEstelar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DymeLanguagePackage.LUNA:
      {
        Luna luna = (Luna)theEObject;
        T result = caseLuna(luna);
        if (result == null) result = caseExprLogica(luna);
        if (result == null) result = caseExpresion(luna);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Programa</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Programa</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrograma(Programa object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Estrella Fugaz Meteoro</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Estrella Fugaz Meteoro</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEstrellaFugazMeteoro(EstrellaFugazMeteoro object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Funcion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Funcion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuncion(Funcion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Llamado Func</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Llamado Func</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLlamadoFunc(LlamadoFunc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParam(Param object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruccion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruccion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruccion(Instruccion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Asignacion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Asignacion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAsignacion(Asignacion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tipo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tipo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTipo(Tipo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tipo Funcion Orden Superior</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tipo Funcion Orden Superior</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTipoFuncionOrdenSuperior(TipoFuncionOrdenSuperior object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constante</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constante</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstante(Constante object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expresion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expresion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpresion(Expresion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Concatenacion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Concatenacion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprConcatenacion(ExprConcatenacion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Aritmetica</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Aritmetica</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprAritmetica(ExprAritmetica object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Logica</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Logica</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprLogica(ExprLogica object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Comparacion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Comparacion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprComparacion(ExprComparacion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Planeta</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Planeta</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlaneta(Planeta object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constelacion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constelacion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstelacion(Constelacion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Estrella</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Estrella</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEstrella(Estrella object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Polvo Estelar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Polvo Estelar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePolvoEstelar(PolvoEstelar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Luna</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Luna</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLuna(Luna object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DymeLanguageSwitch
