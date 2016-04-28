/**
 * generated by Xtext 2.9.1
 */
package eagledata.core.dsl.datadesc.dataDsl.util;

import eagledata.core.dsl.datadesc.dataDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eagledata.core.dsl.datadesc.dataDsl.DataDslPackage
 * @generated
 */
public class DataDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DataDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DataDslPackage.eINSTANCE;
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
  protected DataDslSwitch<Adapter> modelSwitch =
    new DataDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseDataModel(DataModel object)
      {
        return createDataModelAdapter();
      }
      @Override
      public Adapter caseDataDescription(DataDescription object)
      {
        return createDataDescriptionAdapter();
      }
      @Override
      public Adapter caseDataSource(DataSource object)
      {
        return createDataSourceAdapter();
      }
      @Override
      public Adapter caseDataFragment(DataFragment object)
      {
        return createDataFragmentAdapter();
      }
      @Override
      public Adapter caseTypeSpecification(TypeSpecification object)
      {
        return createTypeSpecificationAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object)
      {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter caseEnumeration(Enumeration object)
      {
        return createEnumerationAdapter();
      }
      @Override
      public Adapter caseNode(Node object)
      {
        return createNodeAdapter();
      }
      @Override
      public Adapter caseCompositeNode(CompositeNode object)
      {
        return createCompositeNodeAdapter();
      }
      @Override
      public Adapter caseLeafNode(LeafNode object)
      {
        return createLeafNodeAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter caseOption(Option object)
      {
        return createOptionAdapter();
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
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.datadesc.dataDsl.DataModel <em>Data Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.datadesc.dataDsl.DataModel
   * @generated
   */
  public Adapter createDataModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.datadesc.dataDsl.DataDescription <em>Data Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.datadesc.dataDsl.DataDescription
   * @generated
   */
  public Adapter createDataDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.datadesc.dataDsl.DataSource <em>Data Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.datadesc.dataDsl.DataSource
   * @generated
   */
  public Adapter createDataSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.datadesc.dataDsl.DataFragment <em>Data Fragment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.datadesc.dataDsl.DataFragment
   * @generated
   */
  public Adapter createDataFragmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.datadesc.dataDsl.TypeSpecification <em>Type Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.datadesc.dataDsl.TypeSpecification
   * @generated
   */
  public Adapter createTypeSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.datadesc.dataDsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.datadesc.dataDsl.DataType
   * @generated
   */
  public Adapter createDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.datadesc.dataDsl.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.datadesc.dataDsl.Enumeration
   * @generated
   */
  public Adapter createEnumerationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.datadesc.dataDsl.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.datadesc.dataDsl.Node
   * @generated
   */
  public Adapter createNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.datadesc.dataDsl.CompositeNode <em>Composite Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.datadesc.dataDsl.CompositeNode
   * @generated
   */
  public Adapter createCompositeNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.datadesc.dataDsl.LeafNode <em>Leaf Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.datadesc.dataDsl.LeafNode
   * @generated
   */
  public Adapter createLeafNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.datadesc.dataDsl.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.datadesc.dataDsl.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eagledata.core.dsl.datadesc.dataDsl.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eagledata.core.dsl.datadesc.dataDsl.Option
   * @generated
   */
  public Adapter createOptionAdapter()
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

} //DataDslAdapterFactory
