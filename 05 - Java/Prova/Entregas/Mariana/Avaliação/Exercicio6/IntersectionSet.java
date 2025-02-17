public class IntersectionSet extends Set
{
    private Set Set1, Set2;

    public IntersectionSet(Set Set1, Set Set2){
        this.Set1 = Set1;
        this.Set2 = Set2;
    }

    public boolean contains(Double dois){
        if ((Set1.contains(dois)) && (Set2.contains(dois))){
            return true;
        }
        return false;
    }
}