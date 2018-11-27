package Practice5;

public class A{

    public void catchExp ()
    {
        try {
            throw new Exception("Exception from A");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
