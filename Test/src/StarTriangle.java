public class StarTriangle {
    int Width;

    StarTriangle(int Width){
        this.Width = Width;
    }

    public String toString() {
        String s = "";
        int cnt =0;
        for(int i=0;i<Width;++i){
            s = "";
            cnt++;
            for(int j=0;j<cnt;++j){
                s += "[*]";
            }
        }
        return s + "";
    }

    public static void main(String args[]){

        StarTriangle small = new StarTriangle(4);

        for(int i=0;i<=small.Width;++i){
            StarTriangle sm = new StarTriangle(i);
            System.out.println(sm.toString());
        }

    }
}
