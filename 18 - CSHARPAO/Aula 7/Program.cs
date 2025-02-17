var type = typeof(Funcionario);
Console.WriteLine($"Class {type.Name}");

foreach (var prop in type.GetProperties())
{
    Console.WriteLine($"\t{prop.Name} : {prop.PropertyType}");
}

foreach (var field in type.GetRuntimeFields())
    Console.WriteLine(field.Name);

var func = new Funcionario("donzinho");
func.Idade = 14;

var nameProp = type.GetProperty("Nome");
nameProp.SetValue(func, "queilinha");
Console.WriteLine(func.Nome);

var project = Assembly.GetExecutingAssembly();
List<Controller> controllers =
    project.GetTypes()
    .Where(t => t.BaseType == typeof(Controller))
    .Select(t => Activator.CreateInstance(t) as Controller)
    .Where(obj => obj is not null)
    .ToList()!;

foreach (var controller in controllers)
{
    var controllerType = controller.GetType();
    var method = controllerType.GetMethod("Get");
    if (method is null)
        continue;
    
    method.Invoke(controller, []);
}

public abstract class Controller;
public class ShopController : Controller
{
    public void Get()
    {
        Console.WriteLine("Olá, mundo!");
    }
}
public class LoginController : Controller;

public class Funcionario(string nome)
{
    public string Nome { get; set; } = nome;
    public int Idade { get; set; }

    public void Trabalhar(int horas)
    {
        if (horas > 12)
            Console.WriteLine("Estou cansado chefe!");
    }
}