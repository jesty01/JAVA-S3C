public class GarbagecollectionEx 
{
    public void finalize()
    {
        System.out.println("Garbage collected....");
    }
    public static void main(String args [])
    {
        GarbagecollectionEx o1=new GarbagecollectionEx();
        GarbagecollectionEx  o2=new GarbagecollectionEx();
        o1=null;
        o2=null;
        System.gc();

    }
    
}
