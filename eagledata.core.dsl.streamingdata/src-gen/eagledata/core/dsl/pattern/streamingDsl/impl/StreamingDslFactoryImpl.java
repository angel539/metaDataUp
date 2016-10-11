/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.pattern.streamingDsl.impl;

import eagledata.core.dsl.pattern.streamingDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class StreamingDslFactoryImpl extends EFactoryImpl implements StreamingDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StreamingDslFactory init()
  {
    try
    {
      StreamingDslFactory theStreamingDslFactory = (StreamingDslFactory)EPackage.Registry.INSTANCE.getEFactory(StreamingDslPackage.eNS_URI);
      if (theStreamingDslFactory != null)
      {
        return theStreamingDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new StreamingDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamingDslFactoryImpl()
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
      case StreamingDslPackage.STREAMING_MODEL: return createStreamingModel();
      case StreamingDslPackage.STREMING_DESCRIPTION: return createStremingDescription();
      case StreamingDslPackage.IMPORT: return createImport();
      case StreamingDslPackage.GEOGRAPHICAL_ELEMENT: return createGeographicalElement();
      case StreamingDslPackage.PLACE: return createPlace();
      case StreamingDslPackage.POINT: return createPoint();
      case StreamingDslPackage.COORDINATE: return createCoordinate();
      case StreamingDslPackage.LATITUDE_LONGITUDE: return createLatitudeLongitude();
      case StreamingDslPackage.UTM: return createUTM();
      case StreamingDslPackage.REGION: return createRegion();
      case StreamingDslPackage.PATTERN_MATCHER_ELEMENT: return createPatternMatcherElement();
      case StreamingDslPackage.CONCEPT: return createConcept();
      case StreamingDslPackage.TERM_LIST: return createTermList();
      case StreamingDslPackage.TERM_KEY: return createTermKey();
      case StreamingDslPackage.PHRASE: return createPhrase();
      case StreamingDslPackage.OPTION: return createOption();
      case StreamingDslPackage.GEO_OPTION: return createGeoOption();
      case StreamingDslPackage.SOURCE_OPTION: return createSourceOption();
      case StreamingDslPackage.LANGUAGE_OPTION: return createLanguageOption();
      case StreamingDslPackage.BOOLEAN_OPTION: return createBooleanOption();
      case StreamingDslPackage.INT_OPTION: return createIntOption();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case StreamingDslPackage.BASIC_TYPE:
        return createBasicTypeFromString(eDataType, initialValue);
      case StreamingDslPackage.GEO_OPTION_KEY:
        return createGeoOptionKeyFromString(eDataType, initialValue);
      case StreamingDslPackage.SOURCE_OPTION_KEY:
        return createSourceOptionKeyFromString(eDataType, initialValue);
      case StreamingDslPackage.LANGUAGE_OPTION_KEY:
        return createLanguageOptionKeyFromString(eDataType, initialValue);
      case StreamingDslPackage.INT_OPTION_KEY:
        return createIntOptionKeyFromString(eDataType, initialValue);
      case StreamingDslPackage.BOOLEAN_OPTION_KEY:
        return createBooleanOptionKeyFromString(eDataType, initialValue);
      case StreamingDslPackage.USER_OPTION_KEY:
        return createUserOptionKeyFromString(eDataType, initialValue);
      case StreamingDslPackage.WORD_LIST_PROPERTY:
        return createWordListPropertyFromString(eDataType, initialValue);
      case StreamingDslPackage.ATTACHED:
        return createAttachedFromString(eDataType, initialValue);
      case StreamingDslPackage.SOURCE:
        return createSourceFromString(eDataType, initialValue);
      case StreamingDslPackage.DISTANCE_MESUREMENT:
        return createDistanceMesurementFromString(eDataType, initialValue);
      case StreamingDslPackage.LANGUAGE:
        return createLanguageFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case StreamingDslPackage.BASIC_TYPE:
        return convertBasicTypeToString(eDataType, instanceValue);
      case StreamingDslPackage.GEO_OPTION_KEY:
        return convertGeoOptionKeyToString(eDataType, instanceValue);
      case StreamingDslPackage.SOURCE_OPTION_KEY:
        return convertSourceOptionKeyToString(eDataType, instanceValue);
      case StreamingDslPackage.LANGUAGE_OPTION_KEY:
        return convertLanguageOptionKeyToString(eDataType, instanceValue);
      case StreamingDslPackage.INT_OPTION_KEY:
        return convertIntOptionKeyToString(eDataType, instanceValue);
      case StreamingDslPackage.BOOLEAN_OPTION_KEY:
        return convertBooleanOptionKeyToString(eDataType, instanceValue);
      case StreamingDslPackage.USER_OPTION_KEY:
        return convertUserOptionKeyToString(eDataType, instanceValue);
      case StreamingDslPackage.WORD_LIST_PROPERTY:
        return convertWordListPropertyToString(eDataType, instanceValue);
      case StreamingDslPackage.ATTACHED:
        return convertAttachedToString(eDataType, instanceValue);
      case StreamingDslPackage.SOURCE:
        return convertSourceToString(eDataType, instanceValue);
      case StreamingDslPackage.DISTANCE_MESUREMENT:
        return convertDistanceMesurementToString(eDataType, instanceValue);
      case StreamingDslPackage.LANGUAGE:
        return convertLanguageToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamingModel createStreamingModel()
  {
    StreamingModelImpl streamingModel = new StreamingModelImpl();
    return streamingModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StremingDescription createStremingDescription()
  {
    StremingDescriptionImpl stremingDescription = new StremingDescriptionImpl();
    return stremingDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeographicalElement createGeographicalElement()
  {
    GeographicalElementImpl geographicalElement = new GeographicalElementImpl();
    return geographicalElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Place createPlace()
  {
    PlaceImpl place = new PlaceImpl();
    return place;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point createPoint()
  {
    PointImpl point = new PointImpl();
    return point;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Coordinate createCoordinate()
  {
    CoordinateImpl coordinate = new CoordinateImpl();
    return coordinate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LatitudeLongitude createLatitudeLongitude()
  {
    LatitudeLongitudeImpl latitudeLongitude = new LatitudeLongitudeImpl();
    return latitudeLongitude;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UTM createUTM()
  {
    UTMImpl utm = new UTMImpl();
    return utm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Region createRegion()
  {
    RegionImpl region = new RegionImpl();
    return region;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternMatcherElement createPatternMatcherElement()
  {
    PatternMatcherElementImpl patternMatcherElement = new PatternMatcherElementImpl();
    return patternMatcherElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Concept createConcept()
  {
    ConceptImpl concept = new ConceptImpl();
    return concept;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermList createTermList()
  {
    TermListImpl termList = new TermListImpl();
    return termList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermKey createTermKey()
  {
    TermKeyImpl termKey = new TermKeyImpl();
    return termKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Phrase createPhrase()
  {
    PhraseImpl phrase = new PhraseImpl();
    return phrase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Option createOption()
  {
    OptionImpl option = new OptionImpl();
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoOption createGeoOption()
  {
    GeoOptionImpl geoOption = new GeoOptionImpl();
    return geoOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceOption createSourceOption()
  {
    SourceOptionImpl sourceOption = new SourceOptionImpl();
    return sourceOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageOption createLanguageOption()
  {
    LanguageOptionImpl languageOption = new LanguageOptionImpl();
    return languageOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanOption createBooleanOption()
  {
    BooleanOptionImpl booleanOption = new BooleanOptionImpl();
    return booleanOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntOption createIntOption()
  {
    IntOptionImpl intOption = new IntOptionImpl();
    return intOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicType createBasicTypeFromString(EDataType eDataType, String initialValue)
  {
    BasicType result = BasicType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBasicTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoOptionKey createGeoOptionKeyFromString(EDataType eDataType, String initialValue)
  {
    GeoOptionKey result = GeoOptionKey.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertGeoOptionKeyToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceOptionKey createSourceOptionKeyFromString(EDataType eDataType, String initialValue)
  {
    SourceOptionKey result = SourceOptionKey.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSourceOptionKeyToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageOptionKey createLanguageOptionKeyFromString(EDataType eDataType, String initialValue)
  {
    LanguageOptionKey result = LanguageOptionKey.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLanguageOptionKeyToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntOptionKey createIntOptionKeyFromString(EDataType eDataType, String initialValue)
  {
    IntOptionKey result = IntOptionKey.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertIntOptionKeyToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanOptionKey createBooleanOptionKeyFromString(EDataType eDataType, String initialValue)
  {
    BooleanOptionKey result = BooleanOptionKey.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanOptionKeyToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserOptionKey createUserOptionKeyFromString(EDataType eDataType, String initialValue)
  {
    UserOptionKey result = UserOptionKey.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUserOptionKeyToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WordListProperty createWordListPropertyFromString(EDataType eDataType, String initialValue)
  {
    WordListProperty result = WordListProperty.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertWordListPropertyToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attached createAttachedFromString(EDataType eDataType, String initialValue)
  {
    Attached result = Attached.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAttachedToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Source createSourceFromString(EDataType eDataType, String initialValue)
  {
    Source result = Source.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSourceToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DistanceMesurement createDistanceMesurementFromString(EDataType eDataType, String initialValue)
  {
    DistanceMesurement result = DistanceMesurement.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDistanceMesurementToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Language createLanguageFromString(EDataType eDataType, String initialValue)
  {
    Language result = Language.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLanguageToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamingDslPackage getStreamingDslPackage()
  {
    return (StreamingDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static StreamingDslPackage getPackage()
  {
    return StreamingDslPackage.eINSTANCE;
  }

} //StreamingDslFactoryImpl
