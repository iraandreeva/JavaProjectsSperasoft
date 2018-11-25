package Practice5;

public class C extends B{

    public void catchExp ()
    {
        try {
            throw new Exception("Exception from C");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
