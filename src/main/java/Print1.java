 class Print1 {
    private void print(){
        System.out.println(777);
    }
    void print(Print1 p){
        p.print();
    }
}