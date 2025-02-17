using System;
using System.Collections.Generic;

Number number = 3;
double value = number;

public static class Enumerator
{
    public static T FirstOrDefault<T>(this IEnumerable<T> coll){
        throw new NotImplementedException();
    }

    public static T LastOrDefault<T>(this IEnumerable<T> coll){
        throw new NotImplementedException();
    }

    public static T ToArray<T>(this IEnumerable<T> coll){
        throw new NotImplementedException();
    }

    public static T Take<T>(this IEnumerable<T> coll, int num){
        throw new NotImplementedException();
    }

    public static T Take<T>(this IEnumerable<T> coll, T item){
        throw new NotImplementedException();
    }
}
