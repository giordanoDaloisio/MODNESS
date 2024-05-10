define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "AND|CHANGE_IN_TARGET_POPULATION|DIFFERENCE|DISPARATE_IMPACT|Dataset|DatasetPositiveOutcome|DatasetSensitiveGroup|DatasetSensitiveVariable|DatasetSensitiveVariableValue|DatasetSize|E|EQUAL|EQUALIZED_ODDS|EQUAL_ACCURACY|EUCLIDEAN_DISTANCE|ExistingGroupFairnessMetric|ExistingIndividualFairnessMetric|ExpectedValue|FALSE_POSITIVE_DIFFERENCE|GREATER|GREATER_EQUAL|GroupAnalysis|GroupBias|GroupSize|HUMAN_DISCRIMINATION|IN_EXCLUDED|IN_GREATER_INCLUDED|IN_INCLUDED|IN_LOWER_INCLUDED|Logaritm|LogicalCondition|MAHALANOBIS_DISTANCE|MANHATTAN_DISTANCE|MINOR|MINOR_EQUAL|MULTIPLICATION|Metric|NOT_EQUAL|OMITTED_VARIABLE|OR|Operation|OperationValue|OperatorComponent|OtherVariable|PositiveOutcome|Probability|RATIO|RESULT_RANKING|RangeOperator|STATISTICAL_PARITY|SUM|SensitiveGroup|SensitiveVariable|SensitiveVariableValue|SingleOperator|SubLogicalCondition|Summation|TRUE_POSITIVE_DIFFERENCE|VariableValue|WRONG_AGGREGATION|WRONG_ALGORITHM_BEHAVIOUR|WRONG_LINKING|WRONG_MEASUREMENT|WRONG_PRESENTATION|WRONG_SAMPLING|WRONG_SYSTEM_EVALUATION|WRONG_SYSTEM_TARGET_POPULATION|analysis|body|columnName|condition|dataset|datasetPrivilegedGroup|datasetSentiveVariable|datasetUnprivilegedGroup|datasetsensitivevariablevalue|domain|e|endRange|equalityOperator|false|filePath|function|greaterValue|groundTruthLabelName|groupCondition|leftSide|logicalOperator|logicalcondition|lowerValue|mappingGroup|mappingPositiveOutcome|mappingSensitiveVariable|mappingValue|metric|object|operationvalue|operator|operatorcomponent|otherVariable|othervariablevalue|positiveOutcome|predictedLabelName|privilegedGroup|relativeToDatasetSize|rightSide|scope|sensitiveValue|sensitiveVariableValue|sensitiveVariables|sensitivegroup|source|startRange|sublogicalcondition|toleranceValue|true|unprivilegedGroup|value|variable";
		this.$rules = {
			"start": [
				{token: "comment", regex: "\\/\\/.*$"},
				{token: "comment", regex: "\\/\\*", next : "comment"},
				{token: "string", regex: '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]'},
				{token: "string", regex: "['](?:(?:\\\\.)|(?:[^'\\\\]))*?[']"},
				{token: "constant.numeric", regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"},
				{token: "lparen", regex: "[({]"},
				{token: "rparen", regex: "[)}]"},
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
