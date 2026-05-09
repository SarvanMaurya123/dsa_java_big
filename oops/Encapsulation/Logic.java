package oops.Encapsulation;
// access modifire : 1.public 2.private 3.default 4.protacted


public class Logic{
    private long amounts;
    private String name;
    private long credit;
    private long debit;

    public long getAmounts(){
      return amounts;
    }

    public String getName(){
        return name;
    }

    public long getCredit(){
        return credit;
    }

    public long getDebit(){
        return debit;
    }

    public void setAmounts(long amounts){
     this.amounts=amounts;
    }

    public void setName(String name){
        this.name= name;
    }

    public void setCredit(long credit){
       this.credit=credit;
    }

    public void setDebit(long debit){
        this.debit=debit;
    }
}

