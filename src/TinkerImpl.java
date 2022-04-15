public class TinkerImpl implements Tinker{
    public static void main(String[] args) {
        Tinker tk = new TinkerImpl();
        System.out.println(tk.accept());
    }
    @Override
    public int accept(){
        return 2 *5;
    }

}
