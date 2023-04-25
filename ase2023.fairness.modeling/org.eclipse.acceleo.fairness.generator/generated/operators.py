
from enum import Enum
from abc import ABC


class Operator(Enum, ABC):
    pass


class SingleOperator(Operator):
    GREATER = '>'
    MINOR = '<'
    GREATER_EQUAL = '>='
    MINOR_EQUAL = '<='


class RangeOperator(Operator):
    IN_INCLUDED = 'IN_INCLUDED'
    IN_EXCLUDED = 'IN_EXCLUDED'
    IN_LOWER_INCLUDED = 'IN_LOWER_INCLUDED'
    IN_GREATER_INCLUDED = 'IN_GREATER_INCLUDED'

