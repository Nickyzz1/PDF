using Radiance;
using static Radiance.Utils;

Character character = new Character();
character.SetState(new WaitingState());

Window.OnFrame += () =>
{
    character.Act();
};

Window.OnRender += () =>
{
    character.Draw();
};
Window.CloseOn(Input.Escape);
Window.Open();