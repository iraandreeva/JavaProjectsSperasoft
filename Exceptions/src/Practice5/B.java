package Practice5;

public class B extends A {

    public void catchExp ()
    {
        try {
            throw new Exception("Exception from B");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
