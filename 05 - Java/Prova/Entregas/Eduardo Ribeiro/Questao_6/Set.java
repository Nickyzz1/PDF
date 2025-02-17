package Prova.Questao_6;

public abstract class Set
{
    /*O programa não funciona com a função contains(Float), pois NumberSet usa Double,
    e não é possível comparar os números mesmo após conversões devido a perda de precisão*/
    abstract public boolean contains(Double d);
}