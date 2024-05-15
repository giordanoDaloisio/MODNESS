define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "AND|CHANGE_IN_TARGET_POPULATION|DIFFERENCE|DISPARATE_IMPACT|Dataset|DatasetSensitiveVariable|DatasetSize|E|EQUAL|EQUALIZED_ODDS|EQUAL_ACCURACY|EUCLIDEAN_DISTANCE|ExistingGroupFairnessMetric|ExistingIndividualFairnessMetric|ExpectedValue|FALSE_POSITIVE_DIFFERENCE|GREATER|GREATER_EQUAL|GroupAnalysis|GroupBias|GroupSize|HUMAN_DISCRIMINATION|IN_EXCLUDED|IN_GREATER_INCLUDED|IN_INCLUDED|IN_LOWER_INCLUDED|Logaritm|LogicalCondition|MAHALANOBIS_DISTANCE|MANHATTAN_DISTANCE|MINOR|MINOR_EQUAL|MULTIPLICATION|Metric|NOT_EQUAL|OMITTED_VARIABLE|OR|Operation|OperationValue|OperatorComponent|OtherVariable|Probability|RATIO|RESULT_RANKING|STATISTICAL_PARITY|SUM|SensitiveGroup|SensitiveVariableValue|SubLogicalCondition|Summation|TRUE_POSITIVE_DIFFERENCE|VariableValue|WRONG_AGGREGATION|WRONG_ALGORITHM_BEHAVIOUR|WRONG_LINKING|WRONG_MEASUREMENT|WRONG_PRESENTATION|WRONG_SAMPLING|WRONG_SYSTEM_EVALUATION|WRONG_SYSTEM_TARGET_POPULATION|body|columnName|condition|e|endRange|equalityOperator|false|function|groupCondition|leftSide|logicalOperator|logicalcondition|mappingGroup|object|operationvalue|operator|operatorcomponent|othervariablevalue|relativeToDatasetSize|rightSide|sensitivegroup|startRange|sublogicalcondition|true|value|variable";
		this.$rules = {
			"start": [
				{token: "comment", regex: "\\/\\/.*$"},
				{token: "comment", regex: "\\/\\*", next : "comment"},
				{token: "string", regex: '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]'},
				{token: "string", regex: "['](?:(?:\\\\.)|(?:[^'\\\\]))*?[']"},
				{token: "constant.numeric", regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"},
				{token: "lparen", regex: "[({]"},
				{token: "rparen", regex: "[}]"},
				{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
			],
			"comment": [
				{token: "comment", regex: ".*?\\*\\/", next : "start"},
				{token: "comment", regex: ".+"}
			]
		};
	};
	oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);
	
	var Mode = function() {
		this.HighlightRules = HighlightRules;
	};
	oop.inherits(Mode, mText.Mode);
	Mode.prototype.$id = "xtext/modness";
	Mode.prototype.getCompletions = function(state, session, pos, prefix) {
		return [];
	}
	
	return {
		Mode: Mode
	};
});
