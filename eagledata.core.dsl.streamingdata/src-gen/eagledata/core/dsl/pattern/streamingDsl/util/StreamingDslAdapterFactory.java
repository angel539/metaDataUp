/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.pattern.streamingDsl.util;

import eagledata.core.dsl.pattern.streamingDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eagledata.core.dsl.pattern.streamingDsl.StreamingDslPackage
 * @generated
 */
public class StreamingDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StreamingDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamingDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = StreamingDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StreamingDslSwitch<Adapter> modelSwitch =
    new StreamingDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseStreamingModel(StreamingModel object)
      {
        return createStreamingModelAdapter();
      }
      @Override
      public Adapter caseStremingDescription(StremingDescription object)
      {
        return createStremingDescriptionAdapter();
      }
      @Override
      public Adapter caseGeographicalElement(GeographicalElement object)
      {
        return createGeographicalElementAdapter();
      }
      @Override
      public Adapter casePlace(Place object)
      {
        return createPlaceAdapter();
      }
      @Override
      public Adapter casePoint(Point object)
      {
        return createPointAdapter();
      }
      @Override
      public Adapter caseCoordinate(Coordinate object)
      {
        return createCoordinateAdapter();
      }
      @Override
      public Adapter caseLatitudeLongitude(LatitudeLongitude object)
      {
        return createLatitudeLongitudeAdapter();
      }
      @Override
      public Adapter caseUTM(UTM object)
      {
        return createUTMAdapter();
      }
      @Override
      public Adapter caseRegion(Region object)
      {
        return createRegionAdapter();
      }
      @Override
      public Adapter casePhrase(Phrase object)
      {
        return createPhraseAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseTermList(TermList object)
      {
        return createTermListAdapter();
      }
      @Override
      public Adapter caseTermKey(TermKey object)
      {
        return createTermKeyAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseOption(Option object)
      {
        return createOptionAdapter();
      }
      @Override
      public Adapter caseStringOption(StringOption object)
      {
        return createStringOptionAdapter();
      }
      @Override
      public Adapter casePathOption(PathOption object)
      {
        return createPathOptionAdapter();
      }
      @Override
      public Adapter caseKeyOption(KeyOption object)
      {
        return createKeyOptionAdapter();
      }
      @Override
      public Adapter caseKeyOptionObject(KeyOptionObject object)
      {
        return createKeyOptionObjectAdapter();
      }
      @Override
      public Adapter caseKeyOptionAttr(KeyOptionAttr object)
      {
        return createKeyOptionAttrAdapter();
      }
      @Override
      public Adapter caseKeyOptionArray(KeyOptionArray object)
      {
        return createKeyOptionArrayAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.StreamingModel <em>Streaming Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.StreamingModel
   * @generated
   */
  public Adapter createStreamingModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.StremingDescription <em>Streming Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.StremingDescription
   * @generated
   */
  public Adapter createStremingDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.GeographicalElement <em>Geographical Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.GeographicalElement
   * @generated
   */
  public Adapter createGeographicalElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.Place <em>Place</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.Place
   * @generated
   */
  public Adapter createPlaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.Point
   * @generated
   */
  public Adapter createPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.Coordinate <em>Coordinate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.Coordinate
   * @generated
   */
  public Adapter createCoordinateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.LatitudeLongitude <em>Latitude Longitude</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.LatitudeLongitude
   * @generated
   */
  public Adapter createLatitudeLongitudeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.UTM <em>UTM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.UTM
   * @generated
   */
  public Adapter createUTMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.Region <em>Region</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.Region
   * @generated
   */
  public Adapter createRegionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.Phrase <em>Phrase</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.Phrase
   * @generated
   */
  public Adapter createPhraseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.TermList <em>Term List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.TermList
   * @generated
   */
  public Adapter createTermListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.TermKey <em>Term Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.TermKey
   * @generated
   */
  public Adapter createTermKeyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.Option
   * @generated
   */
  public Adapter createOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.StringOption <em>String Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.StringOption
   * @generated
   */
  public Adapter createStringOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.PathOption <em>Path Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.PathOption
   * @generated
   */
  public Adapter createPathOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.KeyOption <em>Key Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.KeyOption
   * @generated
   */
  public Adapter createKeyOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.KeyOptionObject <em>Key Option Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.KeyOptionObject
   * @generated
   */
  public Adapter createKeyOptionObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.KeyOptionAttr <em>Key Option Attr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.KeyOptionAttr
   * @generated
   */
  public Adapter createKeyOptionAttrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.pattern.streamingDsl.KeyOptionArray <em>Key Option Array</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.pattern.streamingDsl.KeyOptionArray
   * @generated
   */
  public Adapter createKeyOptionArrayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //StreamingDslAdapterFactory
