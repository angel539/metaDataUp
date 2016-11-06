/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.pattern.streamingDsl.util;

import eagledata.core.dsl.pattern.streamingDsl.*;

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
 * @see eagledata.core.dsl.pattern.streamingDsl.StreamingDslPackage
 * @generated
 */
public class StreamingDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StreamingDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamingDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = StreamingDslPackage.eINSTANCE;
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
      case StreamingDslPackage.STREAMING_MODEL:
      {
        StreamingModel streamingModel = (StreamingModel)theEObject;
        T result = caseStreamingModel(streamingModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StreamingDslPackage.STREMING_DESCRIPTION:
      {
        StremingDescription stremingDescription = (StremingDescription)theEObject;
        T result = caseStremingDescription(stremingDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StreamingDslPackage.GEOGRAPHICAL_ELEMENT:
      {
        GeographicalElement geographicalElement = (GeographicalElement)theEObject;
        T result = caseGeographicalElement(geographicalElement);
        if (result == null) result = caseStremingDescription(geographicalElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StreamingDslPackage.PLACE:
      {
        Place place = (Place)theEObject;
        T result = casePlace(place);
        if (result == null) result = caseGeographicalElement(place);
        if (result == null) result = caseStremingDescription(place);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StreamingDslPackage.POINT:
      {
        Point point = (Point)theEObject;
        T result = casePoint(point);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StreamingDslPackage.COORDINATE:
      {
        Coordinate coordinate = (Coordinate)theEObject;
        T result = caseCoordinate(coordinate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StreamingDslPackage.LATITUDE_LONGITUDE:
      {
        LatitudeLongitude latitudeLongitude = (LatitudeLongitude)theEObject;
        T result = caseLatitudeLongitude(latitudeLongitude);
        if (result == null) result = caseCoordinate(latitudeLongitude);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StreamingDslPackage.UTM:
      {
        UTM utm = (UTM)theEObject;
        T result = caseUTM(utm);
        if (result == null) result = caseCoordinate(utm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StreamingDslPackage.REGION:
      {
        Region region = (Region)theEObject;
        T result = caseRegion(region);
        if (result == null) result = caseGeographicalElement(region);
        if (result == null) result = caseStremingDescription(region);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StreamingDslPackage.PHRASE:
      {
        Phrase phrase = (Phrase)theEObject;
        T result = casePhrase(phrase);
        if (result == null) result = caseStremingDescription(phrase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StreamingDslPackage.FEATURE:
      {
        Feature feature = (Feature)theEObject;
        T result = caseFeature(feature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StreamingDslPackage.TERM_LIST:
      {
        TermList termList = (TermList)theEObject;
        T result = caseTermList(termList);
        if (result == null) result = caseFeature(termList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StreamingDslPackage.TERM_KEY:
      {
        TermKey termKey = (TermKey)theEObject;
        T result = caseTermKey(termKey);
        if (result == null) result = caseFeature(termKey);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StreamingDslPackage.OPERATION:
      {
        Operation operation = (Operation)theEObject;
        T result = caseOperation(operation);
        if (result == null) result = caseFeature(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StreamingDslPackage.OPTION:
      {
        Option option = (Option)theEObject;
        T result = caseOption(option);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StreamingDslPackage.STRING_OPTION:
      {
        StringOption stringOption = (StringOption)theEObject;
        T result = caseStringOption(stringOption);
        if (result == null) result = caseOption(stringOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StreamingDslPackage.PATH_OPTION:
      {
        PathOption pathOption = (PathOption)theEObject;
        T result = casePathOption(pathOption);
        if (result == null) result = caseOption(pathOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StreamingDslPackage.KEY_OPTION:
      {
        KeyOption keyOption = (KeyOption)theEObject;
        T result = caseKeyOption(keyOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StreamingDslPackage.KEY_OPTION_OBJECT:
      {
        KeyOptionObject keyOptionObject = (KeyOptionObject)theEObject;
        T result = caseKeyOptionObject(keyOptionObject);
        if (result == null) result = caseKeyOption(keyOptionObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StreamingDslPackage.KEY_OPTION_ATTR:
      {
        KeyOptionAttr keyOptionAttr = (KeyOptionAttr)theEObject;
        T result = caseKeyOptionAttr(keyOptionAttr);
        if (result == null) result = caseKeyOption(keyOptionAttr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StreamingDslPackage.KEY_OPTION_ARRAY:
      {
        KeyOptionArray keyOptionArray = (KeyOptionArray)theEObject;
        T result = caseKeyOptionArray(keyOptionArray);
        if (result == null) result = caseKeyOption(keyOptionArray);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Streaming Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Streaming Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStreamingModel(StreamingModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Streming Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Streming Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStremingDescription(StremingDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Geographical Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geographical Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeographicalElement(GeographicalElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Place</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlace(Place object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePoint(Point object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Coordinate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coordinate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCoordinate(Coordinate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Latitude Longitude</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Latitude Longitude</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLatitudeLongitude(LatitudeLongitude object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UTM</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UTM</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUTM(UTM object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Region</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegion(Region object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Phrase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Phrase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePhrase(Phrase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature(Feature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermList(TermList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term Key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term Key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermKey(TermKey object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
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
   * Returns the result of interpreting the object as an instance of '<em>Path Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathOption(PathOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeyOption(KeyOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key Option Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key Option Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeyOptionObject(KeyOptionObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key Option Attr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key Option Attr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeyOptionAttr(KeyOptionAttr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key Option Array</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key Option Array</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeyOptionArray(KeyOptionArray object)
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

} //StreamingDslSwitch
