using System.Xml.Serialization;
using Radiance;
using Radiance.Bufferings;
using static Radiance.Utils;

public class Character
{
    dynamic charRender = render((vec2 dx) =>
    {
        zoom(40);
        move(dx);
        color = red;
        fill();

    });
    Polygon polygon = Polygons.Circle;
    public void Draw()
    {
        charRender(polygon, X, Y);
    }

    public float X { get; set; }
    public float Y { get; set; }

    State? state = null;
    public void SetState(State state)
    {
        this.state = state;
        this.state.SetContext(this);
    }
    
    public void Act()
        => state?.Act();
}