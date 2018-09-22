class TestAnd1{
    public static void main (String[]args){
        int i=0;
        int j=10;
        boolean test=false;

        test=(i>0) && (j++>9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}