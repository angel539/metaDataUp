/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.datadesc.dataDsl.util;

import eagledata.core.dsl.datadesc.dataDsl.BooleanOption;
import eagledata.core.dsl.datadesc.dataDsl.DataDslPackage;
import eagledata.core.dsl.datadesc.dataDsl.DataFragment;
import eagledata.core.dsl.datadesc.dataDsl.DataModel;
import eagledata.core.dsl.datadesc.dataDsl.DataModelElement;
import eagledata.core.dsl.datadesc.dataDsl.DataOption;
import eagledata.core.dsl.datadesc.dataDsl.DataPackableDescription;
import eagledata.core.dsl.datadesc.dataDsl.DataSourceDescription;
import eagledata.core.dsl.datadesc.dataDsl.DataType;
import eagledata.core.dsl.datadesc.dataDsl.DoubleOption;
import eagledata.core.dsl.datadesc.dataDsl.Enumeration;
import eagledata.core.dsl.datadesc.dataDsl.Import;
import eagledata.core.dsl.datadesc.dataDsl.IntOption;
import eagledata.core.dsl.datadesc.dataDsl.LeafNode;
import eagledata.core.dsl.datadesc.dataDsl.Option;
import eagledata.core.dsl.datadesc.dataDsl.SequenceOption;
import eagledata.core.dsl.datadesc.dataDsl.StringConcept;
import eagledata.core.dsl.datadesc.dataDsl.StringOption;
import eagledata.core.dsl.datadesc.dataDsl.StructDataType;
import eagledata.core.dsl.datadesc.dataDsl.Substring;
import eagledata.core.dsl.datadesc.dataDsl.SubstringConcept;
import eagledata.core.dsl.datadesc.dataDsl.TypeSpecification;

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
 * @see eagledata.core.dsl.datadesc.dataDsl.DataDslPackage
 * @generated
 */
public class DataDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DataDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DataDslPackage.eINSTANCE;
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
      case DataDslPackage.DATA_MODEL:
      {
        DataModel dataModel = (DataModel)theEObject;
        T result = caseDataModel(dataModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = caseDataModelElement(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.DATA_MODEL_ELEMENT:
      {
        DataModelElement dataModelElement = (DataModelElement)theEObject;
        T result = caseDataModelElement(dataModelElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.PACKAGE:
      {
        eagledata.core.dsl.datadesc.dataDsl.Package package_ = (eagledata.core.dsl.datadesc.dataDsl.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = caseDataModelElement(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.DATA_PACKABLE_DESCRIPTION:
      {
        DataPackableDescription dataPackableDescription = (DataPackableDescription)theEObject;
        T result = caseDataPackableDescription(dataPackableDescription);
        if (result == null) result = caseDataModelElement(dataPackableDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.STRING_CONCEPT:
      {
        StringConcept stringConcept = (StringConcept)theEObject;
        T result = caseStringConcept(stringConcept);
        if (result == null) result = caseDataPackableDescription(stringConcept);
        if (result == null) result = caseDataModelElement(stringConcept);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.SUBSTRING_CONCEPT:
      {
        SubstringConcept substringConcept = (SubstringConcept)theEObject;
        T result = caseSubstringConcept(substringConcept);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.SUBSTRING:
      {
        Substring substring = (Substring)theEObject;
        T result = caseSubstring(substring);
        if (result == null) result = caseSubstringConcept(substring);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.CHARACTER:
      {
        eagledata.core.dsl.datadesc.dataDsl.Character character = (eagledata.core.dsl.datadesc.dataDsl.Character)theEObject;
        T result = caseCharacter(character);
        if (result == null) result = caseSubstringConcept(character);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.DATA_SOURCE_DESCRIPTION:
      {
        DataSourceDescription dataSourceDescription = (DataSourceDescription)theEObject;
        T result = caseDataSourceDescription(dataSourceDescription);
        if (result == null) result = caseDataModelElement(dataSourceDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.DATA_FRAGMENT:
      {
        DataFragment dataFragment = (DataFragment)theEObject;
        T result = caseDataFragment(dataFragment);
        if (result == null) result = caseDataPackableDescription(dataFragment);
        if (result == null) result = caseDataModelElement(dataFragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.TYPE_SPECIFICATION:
      {
        TypeSpecification typeSpecification = (TypeSpecification)theEObject;
        T result = caseTypeSpecification(typeSpecification);
        if (result == null) result = caseDataPackableDescription(typeSpecification);
        if (result == null) result = caseDataModelElement(typeSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.DATA_TYPE:
      {
        DataType dataType = (DataType)theEObject;
        T result = caseDataType(dataType);
        if (result == null) result = caseTypeSpecification(dataType);
        if (result == null) result = caseDataPackableDescription(dataType);
        if (result == null) result = caseDataModelElement(dataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.ENUMERATION:
      {
        Enumeration enumeration = (Enumeration)theEObject;
        T result = caseEnumeration(enumeration);
        if (result == null) result = caseTypeSpecification(enumeration);
        if (result == null) result = caseDataPackableDescription(enumeration);
        if (result == null) result = caseDataModelElement(enumeration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.STRUCT_DATA_TYPE:
      {
        StructDataType structDataType = (StructDataType)theEObject;
        T result = caseStructDataType(structDataType);
        if (result == null) result = caseTypeSpecification(structDataType);
        if (result == null) result = caseDataPackableDescription(structDataType);
        if (result == null) result = caseDataModelElement(structDataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.LEAF_NODE:
      {
        LeafNode leafNode = (LeafNode)theEObject;
        T result = caseLeafNode(leafNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.OPTION:
      {
        Option option = (Option)theEObject;
        T result = caseOption(option);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.STRING_OPTION:
      {
        StringOption stringOption = (StringOption)theEObject;
        T result = caseStringOption(stringOption);
        if (result == null) result = caseOption(stringOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.INT_OPTION:
      {
        IntOption intOption = (IntOption)theEObject;
        T result = caseIntOption(intOption);
        if (result == null) result = caseOption(intOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.DOUBLE_OPTION:
      {
        DoubleOption doubleOption = (DoubleOption)theEObject;
        T result = caseDoubleOption(doubleOption);
        if (result == null) result = caseOption(doubleOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.BOOLEAN_OPTION:
      {
        BooleanOption booleanOption = (BooleanOption)theEObject;
        T result = caseBooleanOption(booleanOption);
        if (result == null) result = caseOption(booleanOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.SEQUENCE_OPTION:
      {
        SequenceOption sequenceOption = (SequenceOption)theEObject;
        T result = caseSequenceOption(sequenceOption);
        if (result == null) result = caseOption(sequenceOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataDslPackage.DATA_OPTION:
      {
        DataOption dataOption = (DataOption)theEObject;
        T result = caseDataOption(dataOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataModel(DataModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Model Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Model Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataModelElement(DataModelElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage(eagledata.core.dsl.datadesc.dataDsl.Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Packable Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Packable Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataPackableDescription(DataPackableDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Concept</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Concept</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringConcept(StringConcept object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Substring Concept</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Substring Concept</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubstringConcept(SubstringConcept object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Substring</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Substring</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubstring(Substring object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Character</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Character</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCharacter(eagledata.core.dsl.datadesc.dataDsl.Character object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Source Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Source Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataSourceDescription(DataSourceDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataFragment(DataFragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeSpecification(TypeSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataType(DataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumeration(Enumeration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructDataType(StructDataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Leaf Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Leaf Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeafNode(LeafNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOption(Option object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringOption(StringOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntOption(IntOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleOption(DoubleOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanOption(BooleanOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceOption(SequenceOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataOption(DataOption object)
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

} //DataDslSwitch
