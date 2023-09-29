package com.mycompany.app;

interface Expression {
    Expression times(int mulitplier);
    Expression plus(Expression addend);
    Money reduce(Bank bank, String to);
}
