/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.pattern.streamingDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Int Option Key</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eagledata.core.dsl.pattern.streamingDsl.StreamingDslPackage#getIntOptionKey()
 * @model
 * @generated
 */
public enum IntOptionKey implements Enumerator
{
  /**
   * The '<em><b>Lang</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LANG_VALUE
   * @generated
   * @ordered
   */
  LANG(0, "lang", "minretweet"),

  /**
   * The '<em><b>Source</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SOURCE_VALUE
   * @generated
   * @ordered
   */
  SOURCE(1, "source", "minfavorite");

  /**
   * The '<em><b>Lang</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Lang</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LANG
   * @model name="lang" literal="minretweet"
   * @generated
   * @ordered
   */
  public static final int LANG_VALUE = 0;

  /**
   * The '<em><b>Source</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Source</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SOURCE
   * @model name="source" literal="minfavorite"
   * @generated
   * @ordered
   */
  public static final int SOURCE_VALUE = 1;

  /**
   * An array of all the '<em><b>Int Option Key</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final IntOptionKey[] VALUES_ARRAY =
    new IntOptionKey[]
    {
      LANG,
      SOURCE,
    };

  /**
   * A public read-only list of all the '<em><b>Int Option Key</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<IntOptionKey> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Int Option Key</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static IntOptionKey get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      IntOptionKey result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Int Option Key</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static IntOptionKey getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      IntOptionKey result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Int Option Key</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static IntOptionKey get(int value)
  {
    switch (value)
    {
      case LANG_VALUE: return LANG;
      case SOURCE_VALUE: return SOURCE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private IntOptionKey(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //IntOptionKey
