package main;


public class Grades {
    
    String name;
    int id;
    double pr, md, pf, fn;
    
    public void addGrades (String snm, int sid, double spr, double smd, double spf, double sfn){
        this.name = snm;
        this.id = sid;
        this.pr = spr;
        this.md = smd;
        this.pf = spf;
        this.fn = sfn; 
        
    }
    
    public void viewGrades(){
       double totalmarks = this.pr + this.md + this.pf + this.fn;
       double average = totalmarks / 4;
       String status = (average > 3.0) ? "Failed" : "Passed";
       
        System.out.printf("%-10s %-10d %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n", this.name, this.id, this.pr,
                this.md, this.pf, this.fn, average, status);
        
        
        
        
       
    }
}