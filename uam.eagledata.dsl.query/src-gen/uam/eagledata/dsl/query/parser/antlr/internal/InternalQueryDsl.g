/*
 * generated by Xtext 2.9.2
 */
grammar InternalQueryDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package uam.eagledata.dsl.query.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package uam.eagledata.dsl.query.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uam.eagledata.dsl.query.services.QueryDslGrammarAccess;

}

@parser::members {

 	private QueryDslGrammarAccess grammarAccess;

    public InternalQueryDslParser(TokenStream input, QueryDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "QuerySet";
   	}

   	@Override
   	protected QueryDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleQuerySet
entryRuleQuerySet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQuerySetRule()); }
	iv_ruleQuerySet=ruleQuerySet
	{ $current=$iv_ruleQuerySet.current; }
	EOF;

// Rule QuerySet
ruleQuerySet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getQuerySetAccess().getQuerySetAction_0(),
					$current);
			}
		)
		otherlv_1='query-set'
		{
			newLeafNode(otherlv_1, grammarAccess.getQuerySetAccess().getQuerySetKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getQuerySetAccess().getNameQualifiedNameParserRuleCall_2_0());
				}
				lv_name_2_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQuerySetRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"uam.eagledata.dsl.query.QueryDsl.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getQuerySetAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='import'
			{
				newLeafNode(otherlv_4, grammarAccess.getQuerySetAccess().getImportKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getQuerySetAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_4_1_0());
					}
					lv_importedNamespace_5_0=ruleQualifiedNameWithWildcard
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getQuerySetRule());
						}
						add(
							$current,
							"importedNamespace",
							lv_importedNamespace_5_0,
							"uam.eagledata.dsl.query.QueryDsl.QualifiedNameWithWildcard");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6='import'
				{
					newLeafNode(otherlv_6, grammarAccess.getQuerySetAccess().getImportKeyword_4_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getQuerySetAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_4_2_1_0());
						}
						lv_importedNamespace_7_0=ruleQualifiedNameWithWildcard
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getQuerySetRule());
							}
							add(
								$current,
								"importedNamespace",
								lv_importedNamespace_7_0,
								"uam.eagledata.dsl.query.QueryDsl.QualifiedNameWithWildcard");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getQuerySetAccess().getQueriesSelectParserRuleCall_5_0_0());
					}
					lv_queries_8_0=ruleSelect
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getQuerySetRule());
						}
						add(
							$current,
							"queries",
							lv_queries_8_0,
							"uam.eagledata.dsl.query.QueryDsl.Select");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getQuerySetAccess().getQueriesSelectParserRuleCall_5_1_0());
					}
					lv_queries_9_0=ruleSelect
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getQuerySetRule());
						}
						add(
							$current,
							"queries",
							lv_queries_9_0,
							"uam.eagledata.dsl.query.QueryDsl.Select");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getQuerySetAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleQualifiedNameWithWildcard
entryRuleQualifiedNameWithWildcard returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); }
	iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard
	{ $current=$iv_ruleQualifiedNameWithWildcard.current.getText(); }
	EOF;

// Rule QualifiedNameWithWildcard
ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
		}
		this_QualifiedName_0=ruleQualifiedName
		{
			$current.merge(this_QualifiedName_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='.*'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleSelect
entryRuleSelect returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectRule()); }
	iv_ruleSelect=ruleSelect
	{ $current=$iv_ruleSelect.current; }
	EOF;

// Rule Select
ruleSelect returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSelectAccess().getSelectAction_0(),
					$current);
			}
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSelectAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSelectRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getLeftParenthesisKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSelectAccess().getParamsQueryParamParserRuleCall_2_1_0());
					}
					lv_params_3_0=ruleQueryParam
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSelectRule());
						}
						add(
							$current,
							"params",
							lv_params_3_0,
							"uam.eagledata.dsl.query.QueryDsl.QueryParam");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getCommaKeyword_2_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSelectAccess().getParamsQueryParamParserRuleCall_2_2_1_0());
						}
						lv_params_5_0=ruleQueryParam
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSelectRule());
							}
							add(
								$current,
								"params",
								lv_params_5_0,
								"uam.eagledata.dsl.query.QueryDsl.QueryParam");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_6=')'
			{
				newLeafNode(otherlv_6, grammarAccess.getSelectAccess().getRightParenthesisKeyword_2_3());
			}
		)?
		otherlv_7=':'
		{
			newLeafNode(otherlv_7, grammarAccess.getSelectAccess().getColonKeyword_3());
		}
		otherlv_8='select'
		{
			newLeafNode(otherlv_8, grammarAccess.getSelectAccess().getSelectKeyword_4());
		}
		(
			(
				(
					lv_selectAll_9_0='*'
					{
						newLeafNode(lv_selectAll_9_0, grammarAccess.getSelectAccess().getSelectAllAsteriskKeyword_5_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSelectRule());
						}
						setWithLastConsumed($current, "selectAll", true, "*");
					}
				)
			)
			    |
			(
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSelectRule());
							}
						}
						otherlv_10=RULE_ID
						{
							newLeafNode(otherlv_10, grammarAccess.getSelectAccess().getSelectionDataPropertyCrossReference_5_1_0_0());
						}
					)
				)
				(
					otherlv_11=','
					{
						newLeafNode(otherlv_11, grammarAccess.getSelectAccess().getCommaKeyword_5_1_1_0());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getSelectRule());
								}
							}
							otherlv_12=RULE_ID
							{
								newLeafNode(otherlv_12, grammarAccess.getSelectAccess().getSelectionDataPropertyCrossReference_5_1_1_1_0());
							}
						)
					)
				)*
			)
		)
		(
			otherlv_13='from'
			{
				newLeafNode(otherlv_13, grammarAccess.getSelectAccess().getFromKeyword_6_0());
			}
			(
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getSelectAccess().getFromSimpleFromParserRuleCall_6_1_0_0_0());
							}
							lv_from_14_0=ruleSimpleFrom
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getSelectRule());
								}
								add(
									$current,
									"from",
									lv_from_14_0,
									"uam.eagledata.dsl.query.QueryDsl.SimpleFrom");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						otherlv_15=','
						{
							newLeafNode(otherlv_15, grammarAccess.getSelectAccess().getCommaKeyword_6_1_0_1_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getSelectAccess().getFromSimpleFromParserRuleCall_6_1_0_1_1_0());
								}
								lv_from_16_0=ruleSimpleFrom
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getSelectRule());
									}
									add(
										$current,
										"from",
										lv_from_16_0,
										"uam.eagledata.dsl.query.QueryDsl.SimpleFrom");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)*
				)
				    |
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getSelectAccess().getFromSimpleFromParserRuleCall_6_1_1_0_0());
							}
							lv_from_17_0=ruleSimpleFrom
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getSelectRule());
								}
								add(
									$current,
									"from",
									lv_from_17_0,
									"uam.eagledata.dsl.query.QueryDsl.SimpleFrom");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						(
							{
								newCompositeNode(grammarAccess.getSelectAccess().getFromCompositeFromParserRuleCall_6_1_1_1_0());
							}
							lv_from_18_0=ruleCompositeFrom
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getSelectRule());
								}
								add(
									$current,
									"from",
									lv_from_18_0,
									"uam.eagledata.dsl.query.QueryDsl.CompositeFrom");
								afterParserOrEnumRuleCall();
							}
						)
					)+
				)
			)
		)?
		(
			otherlv_19='where'
			{
				newLeafNode(otherlv_19, grammarAccess.getSelectAccess().getWhereKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSelectAccess().getWhereConditionParserRuleCall_7_1_0());
					}
					lv_where_20_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSelectRule());
						}
						set(
							$current,
							"where",
							lv_where_20_0,
							"uam.eagledata.dsl.query.QueryDsl.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleQueryParam
entryRuleQueryParam returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQueryParamRule()); }
	iv_ruleQueryParam=ruleQueryParam
	{ $current=$iv_ruleQueryParam.current; }
	EOF;

// Rule QueryParam
ruleQueryParam returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getQueryParamAccess().getTypeTypeEnumRuleCall_0_0());
				}
				lv_type_0_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQueryParamRule());
					}
					set(
						$current,
						"type",
						lv_type_0_0,
						"uam.eagledata.dsl.query.QueryDsl.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getQueryParamAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getQueryParamRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleSimpleFrom
entryRuleSimpleFrom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimpleFromRule()); }
	iv_ruleSimpleFrom=ruleSimpleFrom
	{ $current=$iv_ruleSimpleFrom.current; }
	EOF;

// Rule SimpleFrom
ruleSimpleFrom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSimpleFromAccess().getSimpleFromAction_0(),
					$current);
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimpleFromRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getSimpleFromAccess().getSourceSemanticNodeCrossReference_1_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCompositeFrom
entryRuleCompositeFrom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompositeFromRule()); }
	iv_ruleCompositeFrom=ruleCompositeFrom
	{ $current=$iv_ruleCompositeFrom.current; }
	EOF;

// Rule CompositeFrom
ruleCompositeFrom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCompositeFromAccess().getCompositeFromAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCompositeFromAccess().getJoinJoinTypeEnumRuleCall_1_0());
				}
				lv_join_1_0=ruleJoinType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompositeFromRule());
					}
					set(
						$current,
						"join",
						lv_join_1_0,
						"uam.eagledata.dsl.query.QueryDsl.JoinType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompositeFromRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCompositeFromAccess().getSourceSemanticNodeCrossReference_2_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='on'
		{
			newLeafNode(otherlv_3, grammarAccess.getCompositeFromAccess().getOnKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCompositeFromAccess().getOnConditionParserRuleCall_4_0());
				}
				lv_on_4_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompositeFromRule());
					}
					set(
						$current,
						"on",
						lv_on_4_0,
						"uam.eagledata.dsl.query.QueryDsl.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConditionAccess().getSimpleConditionParserRuleCall_0());
		}
		this_SimpleCondition_0=ruleSimpleCondition
		{
			$current = $this_SimpleCondition_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConditionAccess().getCompositeConditionParserRuleCall_1());
		}
		this_CompositeCondition_1=ruleCompositeCondition
		{
			$current = $this_CompositeCondition_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSimpleCondition
entryRuleSimpleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimpleConditionRule()); }
	iv_ruleSimpleCondition=ruleSimpleCondition
	{ $current=$iv_ruleSimpleCondition.current; }
	EOF;

// Rule SimpleCondition
ruleSimpleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSimpleConditionAccess().getSimpleConditionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSimpleConditionAccess().getPredicatePredicateParserRuleCall_1_0());
				}
				lv_predicate_1_0=rulePredicate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSimpleConditionRule());
					}
					set(
						$current,
						"predicate",
						lv_predicate_1_0,
						"uam.eagledata.dsl.query.QueryDsl.Predicate");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePredicate
entryRulePredicate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPredicateRule()); }
	iv_rulePredicate=rulePredicate
	{ $current=$iv_rulePredicate.current; }
	EOF;

// Rule Predicate
rulePredicate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPredicateAccess().getPrimitiveValuePredicateParserRuleCall_0());
		}
		this_PrimitiveValuePredicate_0=rulePrimitiveValuePredicate
		{
			$current = $this_PrimitiveValuePredicate_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPredicateAccess().getModelValuePredicateParserRuleCall_1());
		}
		this_ModelValuePredicate_1=ruleModelValuePredicate
		{
			$current = $this_ModelValuePredicate_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPredicateAccess().getParamValuePredicateParserRuleCall_2());
		}
		this_ParamValuePredicate_2=ruleParamValuePredicate
		{
			$current = $this_ParamValuePredicate_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePrimitiveValuePredicate
entryRulePrimitiveValuePredicate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimitiveValuePredicateRule()); }
	iv_rulePrimitiveValuePredicate=rulePrimitiveValuePredicate
	{ $current=$iv_rulePrimitiveValuePredicate.current; }
	EOF;

// Rule PrimitiveValuePredicate
rulePrimitiveValuePredicate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPrimitiveValuePredicateAccess().getPrimitiveValueComparisonPredicateAction_0(),
					$current);
			}
		)
		(
			(
				lv_not_1_0='not'
				{
					newLeafNode(lv_not_1_0, grammarAccess.getPrimitiveValuePredicateAccess().getNotNotKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPrimitiveValuePredicateRule());
					}
					setWithLastConsumed($current, "not", true, "not");
				}
			)
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPrimitiveValuePredicateRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getPrimitiveValuePredicateAccess().getLeftDataPropertyCrossReference_2_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPrimitiveValuePredicateAccess().getComparisonTypeComparisonTypeEnumRuleCall_3_0());
				}
				lv_comparisonType_3_0=ruleComparisonType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPrimitiveValuePredicateRule());
					}
					set(
						$current,
						"comparisonType",
						lv_comparisonType_3_0,
						"uam.eagledata.dsl.query.QueryDsl.ComparisonType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPrimitiveValuePredicateAccess().getValueEStringParserRuleCall_4_0());
				}
				lv_value_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPrimitiveValuePredicateRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"uam.eagledata.dsl.query.QueryDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleModelValuePredicate
entryRuleModelValuePredicate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelValuePredicateRule()); }
	iv_ruleModelValuePredicate=ruleModelValuePredicate
	{ $current=$iv_ruleModelValuePredicate.current; }
	EOF;

// Rule ModelValuePredicate
ruleModelValuePredicate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getModelValuePredicateAccess().getModelValueComparisonPredicateAction_0(),
					$current);
			}
		)
		(
			(
				lv_not_1_0='not'
				{
					newLeafNode(lv_not_1_0, grammarAccess.getModelValuePredicateAccess().getNotNotKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelValuePredicateRule());
					}
					setWithLastConsumed($current, "not", true, "not");
				}
			)
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelValuePredicateRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getModelValuePredicateAccess().getLeftDataPropertyCrossReference_2_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModelValuePredicateAccess().getComparisonTypeComparisonTypeEnumRuleCall_3_0());
				}
				lv_comparisonType_3_0=ruleComparisonType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelValuePredicateRule());
					}
					set(
						$current,
						"comparisonType",
						lv_comparisonType_3_0,
						"uam.eagledata.dsl.query.QueryDsl.ComparisonType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getModelValuePredicateAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelValuePredicateRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getModelValuePredicateAccess().getRightDataPropertyCrossReference_5_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getModelValuePredicateAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleParamValuePredicate
entryRuleParamValuePredicate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParamValuePredicateRule()); }
	iv_ruleParamValuePredicate=ruleParamValuePredicate
	{ $current=$iv_ruleParamValuePredicate.current; }
	EOF;

// Rule ParamValuePredicate
ruleParamValuePredicate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getParamValuePredicateAccess().getParamValueComparisonPredicateAction_0(),
					$current);
			}
		)
		(
			(
				lv_not_1_0='not'
				{
					newLeafNode(lv_not_1_0, grammarAccess.getParamValuePredicateAccess().getNotNotKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParamValuePredicateRule());
					}
					setWithLastConsumed($current, "not", true, "not");
				}
			)
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParamValuePredicateRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getParamValuePredicateAccess().getLeftDataPropertyCrossReference_2_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getParamValuePredicateAccess().getComparisonTypeComparisonTypeEnumRuleCall_3_0());
				}
				lv_comparisonType_3_0=ruleComparisonType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParamValuePredicateRule());
					}
					set(
						$current,
						"comparisonType",
						lv_comparisonType_3_0,
						"uam.eagledata.dsl.query.QueryDsl.ComparisonType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='['
		{
			newLeafNode(otherlv_4, grammarAccess.getParamValuePredicateAccess().getLeftSquareBracketKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParamValuePredicateRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getParamValuePredicateAccess().getRightQueryParamCrossReference_5_0());
				}
			)
		)
		otherlv_6=']'
		{
			newLeafNode(otherlv_6, grammarAccess.getParamValuePredicateAccess().getRightSquareBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleCompositeCondition
entryRuleCompositeCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompositeConditionRule()); }
	iv_ruleCompositeCondition=ruleCompositeCondition
	{ $current=$iv_ruleCompositeCondition.current; }
	EOF;

// Rule CompositeCondition
ruleCompositeCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCompositeConditionAccess().getCompositeConditionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCompositeConditionAccess().getPredicatePredicateParserRuleCall_1_0());
				}
				lv_predicate_1_0=rulePredicate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
					}
					set(
						$current,
						"predicate",
						lv_predicate_1_0,
						"uam.eagledata.dsl.query.QueryDsl.Predicate");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCompositeConditionAccess().getConnectionConnectionTypeEnumRuleCall_2_0());
				}
				lv_connection_2_0=ruleConnectionType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
					}
					set(
						$current,
						"connection",
						lv_connection_2_0,
						"uam.eagledata.dsl.query.QueryDsl.ConnectionType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCompositeConditionAccess().getOnConditionParserRuleCall_3_0());
				}
				lv_on_3_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
					}
					set(
						$current,
						"on",
						lv_on_3_0,
						"uam.eagledata.dsl.query.QueryDsl.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Rule JoinType
ruleJoinType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='join'
			{
				$current = grammarAccess.getJoinTypeAccess().getInnerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getJoinTypeAccess().getInnerEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='left-join'
			{
				$current = grammarAccess.getJoinTypeAccess().getLeftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getJoinTypeAccess().getLeftEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='right-join'
			{
				$current = grammarAccess.getJoinTypeAccess().getRightEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getJoinTypeAccess().getRightEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='outer-join'
			{
				$current = grammarAccess.getJoinTypeAccess().getOuterEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getJoinTypeAccess().getOuterEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='left-outer-join'
			{
				$current = grammarAccess.getJoinTypeAccess().getLeftouterEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getJoinTypeAccess().getLeftouterEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='right-outer-join'
			{
				$current = grammarAccess.getJoinTypeAccess().getRightouterEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getJoinTypeAccess().getRightouterEnumLiteralDeclaration_5());
			}
		)
	)
;

// Rule ComparisonType
ruleComparisonType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='='
			{
				$current = grammarAccess.getComparisonTypeAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getComparisonTypeAccess().getEqualEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='!='
			{
				$current = grammarAccess.getComparisonTypeAccess().getNotequalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getComparisonTypeAccess().getNotequalEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='<'
			{
				$current = grammarAccess.getComparisonTypeAccess().getLessthanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getComparisonTypeAccess().getLessthanEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='<='
			{
				$current = grammarAccess.getComparisonTypeAccess().getLessthanorequalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getComparisonTypeAccess().getLessthanorequalEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='>'
			{
				$current = grammarAccess.getComparisonTypeAccess().getGreaterthanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getComparisonTypeAccess().getGreaterthanEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='>='
			{
				$current = grammarAccess.getComparisonTypeAccess().getGreaterthanorequalEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getComparisonTypeAccess().getGreaterthanorequalEnumLiteralDeclaration_5());
			}
		)
	)
;

// Rule ConnectionType
ruleConnectionType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='and'
			{
				$current = grammarAccess.getConnectionTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getConnectionTypeAccess().getAndEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='or'
			{
				$current = grammarAccess.getConnectionTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getConnectionTypeAccess().getOrEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule Type
ruleType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='String'
			{
				$current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Int'
			{
				$current = grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Boolean'
			{
				$current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='Float'
			{
				$current = grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='Double'
			{
				$current = grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_4());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
