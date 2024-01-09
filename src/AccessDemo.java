class MyClass{
    private int alpha;
    public int beta;
    int gamma;

    void setAlpha(int a){
        alpha=a;
    }
    int getAlpha(){
        return alpha;
    }
}


public class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();
        ob.setAlpha(-99);
        System.out.println("ob.alpha is "+ob.getAlpha());

        ob.beta=88;
        System.out.println("ob.beta= "+ob.beta);

        ob.gamma=77;

        System.out.println("ob.gamma= "+ob.gamma);


    }
}