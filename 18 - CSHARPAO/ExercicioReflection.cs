using System.Collections;
using System.Reflection;
using System.Text;

var empresa = new Empresa(
    "Bosch",
    new Funcionario(1, "Fábio", 100_000), [
        new Funcionario(2, "Don", 50_000),
        new Funcionario(3, "Queila", 20_000),
        new Funcionario(4, "Trevis", 600),
    ]
);
var json = empresa.ToJson();
Console.WriteLine(json);

public record Funcionario(
    int Id,
    string Nome,
    decimal Salario
);
public record Empresa(
    string Nome,
    Funcionario Chefe,
    List<Funcionario> Funcionarios
);

public static class Converter
{
    public static Task<string> ToJsonAsync<T>(this T obj)
    {
        // ????
    }

    public static string ToJson<T>(this T obj)
    {
        var sb = new StringBuilder();
        AppendObject(obj, sb);
        return sb.ToString();
    }

    private static void toJson<T>(T obj, StringBuilder sb)
    {
	
    }
}