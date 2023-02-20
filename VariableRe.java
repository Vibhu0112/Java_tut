public class VariableRe {
    int id=1000;
    //int id; -->this statement will run here. 
    // id=1000; -->this will not execute this statement will show error.
    void compute(){
        //int id;   --> this statement will not run here in the method.
        //id=1000;   --> now if we reinitialize the variable then it will run.
        int nextId = id+1; 
        System.out.println("id: "+id);
        System.out.println("nextId: "+nextId);
    }
    public static void main(String[] args) {
        VariableRe vr = new VariableRe();
        vr.compute();
    }    
}
