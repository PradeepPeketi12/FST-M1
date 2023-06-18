import pytest


def test_addition():
    num1 = 10
    num2 = 20
    sum = num1 + num2
    assert sum == 30

def test_subtraction():
    num1 = 20
    num2 = 10
    sub = num1 - num2
    assert sub == 10

@pytest.mark.activity1
def test_multiply():
    num1 = 2
    num2 = 3
    mul = num1 * num2
    assert mul == 6

@pytest.mark.activity1
def test_division():
    num1 = 6
    num2 = 2
    div = num1%num2
    assert div == 0